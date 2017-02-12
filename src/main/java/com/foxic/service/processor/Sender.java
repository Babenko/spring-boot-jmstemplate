package com.foxic.service.processor;

import com.foxic.dto.Message;

/**
 * @author Sem Babenko
 */
public interface Sender {

    void send(Message message);
}
