package com.mastercard.transaction.processor.service;

import com.mastercard.transaction.processor.domain.event.Event;

public interface EventService {

    void processEvent(Event event);

}
