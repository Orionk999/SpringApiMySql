package com.icodeap.eventos.infrastructure.adapter;

import com.icodeap.eventos.infrastructure.entity.EventEntity;
import org.springframework.data.repository.CrudRepository;

public interface EventCrudRepository  extends CrudRepository<EventEntity, String> {
}
