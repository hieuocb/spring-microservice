package com.hoclamdev.httptomessage.controller;

import com.google.gson.Gson;
import com.hoclamdev.httptomessage.entity.reponse.KafkaResponse;
import com.hoclamdev.httptomessage.entity.request.KafkaRequest;
import com.hoclamdev.httptomessage.service.KafkaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/send")
    public ResponseEntity<KafkaResponse> sendMessage(@RequestBody KafkaRequest request) {
        var gson = new Gson();
        var data = gson.toJsonTree(request.getData()).getAsJsonObject();
        log.info("request data: {}", data);

        var isSend = kafkaService.sendTopicKafka(request);
        var resonse = new KafkaResponse();
        if (isSend) {
            resonse.setMessage("success");
            resonse.setStatusCode(0);
            return new ResponseEntity<>(resonse, HttpStatus.OK);
        }

        resonse.setStatusCode(-1);
        resonse.setMessage("send kafka failed");
        return new ResponseEntity<>(resonse, HttpStatus.BAD_REQUEST);
    }

}
