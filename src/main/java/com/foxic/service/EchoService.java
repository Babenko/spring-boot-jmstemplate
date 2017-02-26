package com.foxic.service;

import com.foxic.dto.TextMessage;
import com.foxic.service.factory.MessageFactory;
import com.foxic.service.processor.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Sem Babenko
 */
@Service
public class EchoService {

    @Autowired
    private Sender jmsProcessor;

    @Autowired
    private MessageFactory messageFactory;

    public void echo() {
        TextMessage textMessage = messageFactory.createTextMessage();
        textMessage.setPayload("test");
        jmsProcessor.send(textMessage);
    }

}
