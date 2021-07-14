package com.mrgiovanotti.kafkaconsumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppProperties {

	@Value("${kafka.topic.name}")
	private String topic;

	public String getTopic() {
		return topic;
	}

}
