package com.foxic.service.processor;

import javax.jms.Message;

/**
 * @author Sem Babenko
 */
public interface Receiver {

    void receive(String message);
}
