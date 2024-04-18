package com.icodeap.ecommerce.infrastructure.adapter;

import com.icodeap.ecommerce.domain.Event;
import com.icodeap.ecommerce.infrastructure.entity.EventEntity;
import com.icodeap.ecommerce.infrastructure.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface EventCrudRepository  extends CrudRepository<EventEntity, Integer> {
    Iterable<EventEntity> findByUserEntity (UserEntity userEntity);
}
