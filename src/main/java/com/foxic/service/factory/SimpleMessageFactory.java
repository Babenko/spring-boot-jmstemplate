package com.foxic.service.factory;

import com.foxic.dto.TextMessage;
import org.springframework.stereotype.Service;

/**
 * @author Sem Babenko
 */
@Service
public class SimpleMessageFactory implements MessageFactory {

    @Override
    public TextMessage createTextMessage() {
        return new TextMessage();
    }
}
