package org.fve.springbootprojects.springbootmicroservicestarterapp;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.test.context.TestConfiguration;
//import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
//import org.springframework.context.annotation.Bean;
//import org.testcontainers.containers.GenericContainer;
//import org.testcontainers.containers.KafkaContainer;
//import org.testcontainers.containers.MySQLContainer;
//import org.testcontainers.containers.PostgreSQLContainer;
//import org.testcontainers.containers.RabbitMQContainer;
//import org.testcontainers.oracle.OracleContainer;
//import org.testcontainers.utility.DockerImageName;

//@TestConfiguration(proxyBeanMethods = false)
class TestMicroserviceStarterApplication {

//	@Bean
//	@ServiceConnection
//	KafkaContainer kafkaContainer() {
//		return new KafkaContainer(DockerImageName.parse("confluentinc/cp-kafka:latest"));
//	}
//
//	@Bean
//	@ServiceConnection
//	MySQLContainer<?> mysqlContainer() {
//		return new MySQLContainer<>(DockerImageName.parse("mysql:latest"));
//	}
//
//	@Bean
//	@ServiceConnection
//	OracleContainer oracleFreeContainer() {
//		return new OracleContainer(DockerImageName.parse("gvenzl/oracle-free:latest"));
//	}
//
//	@Bean
//	@ServiceConnection
//	PostgreSQLContainer<?> postgresContainer() {
//		return new PostgreSQLContainer<>(DockerImageName.parse("postgres:latest"));
//	}
//
//	@Bean
//	@ServiceConnection
//	RabbitMQContainer rabbitContainer() {
//		return new RabbitMQContainer(DockerImageName.parse("rabbitmq:latest"));
//	}
//
//	@Bean
//	@ServiceConnection(name = "openzipkin/zipkin")
//	GenericContainer<?> zipkinContainer() {
//		return new GenericContainer<>(DockerImageName.parse("openzipkin/zipkin:latest")).withExposedPorts(9411);
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.from(MicroserviceStarterApplication::main).with(TestMicroserviceStarterApplication.class).run(args);
//	}


}
