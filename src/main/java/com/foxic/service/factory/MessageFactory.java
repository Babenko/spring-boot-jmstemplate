package com.foxic.service.factory;

import com.foxic.dto.TextMessage;
import org.springframework.stereotype.Service;

/**
 * @author Sem Babenko
 */
public interface MessageFactory {

    TextMessage createTextMessage();
}
