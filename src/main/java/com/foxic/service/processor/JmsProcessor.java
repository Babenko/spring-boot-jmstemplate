package com.foxic.service.processor;

import com.foxic.dto.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 * @author Sem Babenko
 */
@Service
public class JmsProcessor implements Processor {

    private String destination;
    private JmsTemplate jmsTemplate;

    @Autowired
    public JmsProcessor(JmsTemplate jmsTemplate, @Value("${destination}") String destination) {
        this.jmsTemplate = jmsTemplate;
        this.destination = destination;
    }

    @Override
    @JmsListener(destination = "box")
    public void receive(String message) {
        System.out.println(message);
    }

    @Override
    public void send(Message message) {
        jmsTemplate.convertAndSend(destination, message.getPayload().toString());
    }
}
