package com.icodeap.eventos.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

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
