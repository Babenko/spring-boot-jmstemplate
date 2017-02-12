package com.foxic.AppConf;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.support.destination.DestinationResolver;

import javax.jms.ConnectionFactory;

/**
 * @author Sem Babenko
 */
@Configuration
@EnableJms
public class JmsConf {

    @Autowired
    private ConnectionFactory connectionFactory;

    @Autowired
    private DestinationResolver destinationResolver;

    public DefaultJmsListenerContainerFactory jmsListenerContainerFactory() {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        factory.setDestinationResolver(destinationResolver);
        factory.setConcurrency("2");
        return factory;
    }

}
