package com.dongnaoedu.example.mq.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.dongnaoedu.example.TopicRabbitConfiguration;

@Component
public class TopicRabbitMQConsumer {

	/**
	 * 监听方法传入的参数需要和消息生产者的一致
	 */
	@RabbitHandler
	@RabbitListener(queues = TopicRabbitConfiguration.TOPIC_ROUTING_KEY_YUJIAOJIAO)
	public void processt(String context) {
		System.out.println("Y\t"+context);
	}

	@RabbitHandler
	@RabbitListener(queues = TopicRabbitConfiguration.TOPIC_ROUTING_KEY_MINE)
	public void processy(String context) {
		System.out.println("M\t"+context.toString());
	}

	@RabbitHandler
	@RabbitListener(queues = TopicRabbitConfiguration.TOPIC_ROUTING_KEY_TIMEBUSKER)
	public void processo(String context) {
		System.out.println("T\t"+context);
	}
}
