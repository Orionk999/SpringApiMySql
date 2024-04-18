package com.icodeap.eventos.infrastructure.adapter;

import com.icodeap.eventos.infrastructure.entity.EventEntity;
import com.icodeap.eventos.infrastructure.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface EventCrudRepository  extends CrudRepository<EventEntity, Integer> {
    Iterable<EventEntity> findByUserEntity (UserEntity userEntity);
}
