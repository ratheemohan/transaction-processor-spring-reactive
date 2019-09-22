package com.mastercard.transaction.processor.service;

import com.mastercard.transaction.processor.domain.event.Event;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DefaultEventService implements EventService {

    @Override
    public void processEvent(Event event) {
        log.info("processing event={}", event);
    }
}
