package in.sita.sangita.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

@Configuration

public class RedisConfig {
	@Value("${spring.datasource.redis.url}")
	private String url;
	@Value("${spring.datasource.redis.port}")
	private Integer port;
	@Value("${spring.datasource.redis.username}")
	private String username;
	@Value("${spring.datasource.redis.password}")
	private String password;

	@Bean
	public JedisConnectionFactory jedisConnectionFactory() {

		RedisStandaloneConfiguration serverConfig = 
				new RedisStandaloneConfiguration(url, port);

		serverConfig.setUsername(username);
		serverConfig.setPassword(password);

		JedisClientConfiguration clientConfig = JedisClientConfiguration.builder().build();

		return new JedisConnectionFactory(serverConfig, clientConfig);
	}

}
