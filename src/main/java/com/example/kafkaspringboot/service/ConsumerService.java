package com.example.kafkaspringboot.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ConsumerService {

	@KafkaListener(topics = "testTopic")
	public void consumerMessage(String value) { // 메세지 전송 시 해당 그룹 메세지 받기
		log.info("returnValue = " + value);
	}

}
