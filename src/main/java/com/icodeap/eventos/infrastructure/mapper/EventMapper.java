package com.icodeap.eventos.infrastructure.mapper;

import com.icodeap.eventos.domain.Event;
import com.icodeap.eventos.infrastructure.entity.EventEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface EventMapper {
    @Mappings(
            {
                    @Mapping(source = "sg_message_id", target = "sg_message_id"),
                    @Mapping(source = "response", target = "response"),
                    @Mapping(source = "email", target = "email"),
                    @Mapping(source = "timestamp", target = "timestamp"),
                    @Mapping(source = "fromaddress", target = "fromaddress"),
                    @Mapping(source = "event", target = "event"),
                    @Mapping(source = "msize", target = "msize"),
                    @Mapping(source = "customargs1", target = "customargs1"),
                    @Mapping(source = "customargs2", target = "customargs2"),
                    @Mapping(source = "tags", target = "tags"),

            }
    )

    Event toEvent(EventEntity eventEntity);
    Iterable<Event> toEvents (Iterable<EventEntity> eventEntities);

    @InheritInverseConfiguration
    EventEntity toEventEntity (Event event);
}
