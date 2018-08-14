package config;

import javax.activation.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class persistenceConfiguration {
	@Bean
	@ConfigurationProperties(prefix="spring.datasource")
	@Primary
	public javax.sql.DataSource dataSource() {
		return DataSourceBuilder.create().build();
		}

	@Bean
	@ConfigurationProperties(prefix="datasource.flyway")
	public javax.sql.DataSource flywayDataSource() {
		return DataSourceBuilder.create().build();
		}
}