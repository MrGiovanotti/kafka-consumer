package com.mrgiovanotti.kafkaconsumer.services;

public interface KafkaConsumer {

	void consumeFromTopic(String message);

}
