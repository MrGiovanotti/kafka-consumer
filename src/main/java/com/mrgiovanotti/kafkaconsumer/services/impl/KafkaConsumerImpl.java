package com.mrgiovanotti.kafkaconsumer.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.mrgiovanotti.kafkaconsumer.services.KafkaConsumer;

@Service
public class KafkaConsumerImpl implements KafkaConsumer {

	Logger logger = LoggerFactory.getLogger(KafkaConsumerImpl.class);

	@Override
	@KafkaListener(topics = "${kafka.topic.name}", groupId = "mygroup")
	public void consumeFromTopic(@Payload(required = false) String message) {
		logger.info(message);
	}

}
