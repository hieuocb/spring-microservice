package com.hoclamdev.httptomessage.entity.reponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class KafkaResponse {
    private int statusCode;
    private String message;
}
