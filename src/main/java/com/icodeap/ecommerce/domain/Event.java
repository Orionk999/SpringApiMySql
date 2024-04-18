package com.icodeap.ecommerce.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
public class Event {
    private String sg_message_id;
    private String response;
    private String email;
    private Float timestamp;
    private String fromaddress;
    private String event;
    private Float msize;
    private String customargs1;
    private String customargs2;
    private String tags;

}
