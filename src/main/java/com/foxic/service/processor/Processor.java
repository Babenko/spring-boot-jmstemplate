package com.foxic.service.processor;

import com.foxic.dto.Message;

/**
 * @author Sem Babenko
 */
public interface Processor {

    void receive();

    void send(Message message);
}
