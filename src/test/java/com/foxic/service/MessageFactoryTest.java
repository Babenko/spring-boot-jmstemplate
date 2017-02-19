package com.foxic.service;

import com.foxic.dto.Message;
import com.foxic.dto.TextMessage;
import com.foxic.service.factory.MessageFactory;
import com.foxic.service.factory.SimpleMessageFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * @author Sem Babenko
 */
@RunWith(MockitoJUnitRunner.class)
public class MessageFactoryTest {

    private static MessageFactory messageFactory;

    @Before
    public void tearUp() {
        messageFactory = new SimpleMessageFactory();
    }

    @Test
    public void textMessageTest() {
        Message msg = messageFactory.createTextMessage();
        Assert.assertTrue(msg.getClass() == TextMessage.class);
    }

}
