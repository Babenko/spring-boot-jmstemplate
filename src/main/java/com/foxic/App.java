package com.foxic;

import com.foxic.dto.TextMessage;
import com.foxic.service.EchoService;
import com.foxic.service.factory.MessageFactory;
import com.foxic.service.processor.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class App implements CommandLineRunner{

    @Autowired
    private EchoService echoService;

    public static void main( String[] args ) {

        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        echoService.echo();
    }
}
