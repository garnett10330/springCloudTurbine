package com.cloud.Turbine;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableTurbineStream
@EnableDiscoveryClient
public class TestSpringCloudTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringCloudTurbineApplication.class, args);
	}
//	@Bean
//    public MessageConverter integrationArgumentResolverMessageConverter(CompositeMessageConverterFactory factory) {
//        return new MessageConverter(factory.getMessageConverterForAllRegistered().getConverters());
//    }
}
