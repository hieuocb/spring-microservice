package com.hoclamdev.httptomessage.service;

import com.hoclamdev.httptomessage.entity.request.KafkaRequest;
import com.hoclamdev.utils.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public boolean sendTopicKafka(KafkaRequest request) {
        try {
            var json = JsonUtils.objectToJson(request.getData());
            kafkaTemplate.send(request.getTopic(), json.toString());
            return true;
        } catch (Exception ex) {
            log.error("Send Exception", ex);
            return false;
        }
    }
}
