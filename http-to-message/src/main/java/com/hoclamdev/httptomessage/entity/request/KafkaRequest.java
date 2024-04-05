package com.hoclamdev.httptomessage.entity.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class KafkaRequest {

    private String topic;
    private Object data;
}
