package com.example.reactiveavroprocessor;

import com.avro.document.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.schema.registry.avro.AvroSchemaMessageConverter;
import org.springframework.cloud.schema.registry.avro.AvroSchemaServiceManagerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.converter.MessageConverter;
import org.springframework.util.MimeType;
import reactor.core.publisher.Flux;

import java.util.function.Function;

@SpringBootApplication
public class ReactiveAvroProcessorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveAvroProcessorApplication.class, args);
	}

	@Bean
	public MessageConverter avroDocumentMessageConverter() {
		AvroSchemaMessageConverter converter = new AvroSchemaMessageConverter(MimeType.valueOf("avro/bytes"), new AvroSchemaServiceManagerImpl());
		converter.setSchema(Document.getClassSchema());
		return converter;
	}

	@Bean
	public Function<Flux<Document>, Flux<Document>> process() {
		return documentFlux -> documentFlux.doOnNext(document -> document.setText("hello"))
										   .log();
	}

}
