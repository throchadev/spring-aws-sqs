package br.com.throchadev.springawssqs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SqsPublisher {

    private QueueMessagingTemplate queueMessagingTemplate;
    private SqsConfiguration sqsConfiguration;

    public SqsPublisher(QueueMessagingTemplate queueMessagingTemplate, SqsConfiguration sqsConfiguration) {
        this.queueMessagingTemplate = queueMessagingTemplate;
        this.sqsConfiguration = sqsConfiguration;
    }

    @Scheduled(fixedRate = 5000)
    public void sendMessage() {
        log.info("Sending Message to SQS ...");
        queueMessagingTemplate.convertAndSend(sqsConfiguration.getEndpoint(), "My First Message");
    }
}
