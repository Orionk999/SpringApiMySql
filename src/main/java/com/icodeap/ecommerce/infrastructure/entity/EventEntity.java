package com.icodeap.ecommerce.infrastructure.entity;

import com.icodeap.ecommerce.domain.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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


    @ManyToOne
    private UserEntity userEntity;
}
