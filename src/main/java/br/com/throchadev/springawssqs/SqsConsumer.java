package br.com.throchadev.springawssqs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SqsConsumer {

    @SqsListener("${cloud.aws.queue.name}")
    public void receiveMessage(String message) {
        log.info("Message from SQS {}", message);
    }
}
