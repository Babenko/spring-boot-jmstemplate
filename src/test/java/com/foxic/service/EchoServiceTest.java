package com.foxic.service;

import com.foxic.dto.TextMessage;
import com.foxic.service.factory.MessageFactory;
import com.foxic.service.processor.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


/**
 * @author Sem Babenko
 */
@RunWith(MockitoJUnitRunner.class)
public class EchoServiceTest {

    @Mock
    private Sender jmsTemplate;

    @Mock
    private MessageFactory messageFactory;

    @InjectMocks
    private static EchoService echoService;

    @Test
    public void echoTest() throws Exception {

        Mockito.when(messageFactory.createTextMessage()).thenReturn(new TextMessage());

        echoService.echo();
        
        Mockito.verify(jmsTemplate, Mockito.times(1)).send(Mockito.any());
        Mockito.verify(messageFactory, Mockito.times(1)).createTextMessage();
    }

}
