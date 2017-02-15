package com.foxic.service;

import com.foxic.dto.Message;
import com.foxic.service.processor.JmsProcessor;
import com.foxic.service.processor.Processor;
import com.foxic.service.processor.Receiver;
import com.foxic.service.processor.Sender;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.jms.core.JmsTemplate;

import static org.mockito.Mockito.*;

/**
 * @author Sem Babenko
 */
@RunWith(MockitoJUnitRunner.class)
public class JmsProcessorTest {

    private static final String DESTINATION = "box";

    @Mock
    private JmsTemplate jmsTemplate;

    @Mock
    private Message<CharSequence> message;

    private static Sender sender;
    private static Receiver receiver;

    @Before
    public void tearUp() {
        Processor processor = new JmsProcessor(jmsTemplate, DESTINATION);
        receiver = processor;
        sender = processor;
    }

    @Test
    public void sendMessageTest() throws Exception {
        when(message.getPayload()).thenReturn("hi");
        sender.send(message);
        verify(message, times(1)).getPayload();
        verify(jmsTemplate, times(1)).convertAndSend(anyString(), anyString());
    }

    @Test
    public void receiveMessageTest() throws Exception {
        receiver.receive("some message");
    }

}
