package com.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

/**
 * Created by debasish paul on 08-11-2017.
 */
public class KafkaProducerUtility {
    public static KafkaProducer getInstance() {
        Properties props = new Properties();
        props.put("bootstrap.servers", "192.168.33.207:9092");
        props.put("retries", 2);
        props.put("compression.type", "gzip");
        props.put("request.timeout.ms", 60000);
        props.put("batch.size", 16384);
        props.put("max.request.size", 15728640);
        props.put("linger.ms", 1);
        props.put("buffer.memory", 33554432);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        props.put("acks", "all");

        KafkaProducer kafkaProducer = new KafkaProducer(props);
        return kafkaProducer;
    }

    public static void sendMessage(String topic, String key, String value) {
        getInstance().send(new ProducerRecord(topic, key, value));
    }

    public static void main(String[] args) {
        sendMessage("hello", "as", "sda");
    }
}
