package com.foxic.service.processor;

import com.foxic.dto.Message;
import org.springframework.stereotype.Service;

/**
 * @author Sem Babenko
 */
@Service
public class JmsProcessor implements Processor {

    @Override
    public void receive() {

    }

    @Override
    public void send(Message message) {

    }
}
