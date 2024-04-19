package com.icodeap.eventos.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "events")
@Data
@NoArgsConstructor
public class EventEntity {

    @Id
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