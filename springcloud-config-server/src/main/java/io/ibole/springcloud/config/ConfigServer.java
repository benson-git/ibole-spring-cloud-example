package io.ibole.springcloud.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.config.server.config.EncryptionAutoConfiguration;
import org.springframework.cloud.config.server.config.SingleEncryptorAutoConfiguration;

@EnableConfigServer
@SpringBootApplication
@EnableAutoConfiguration(exclude={SingleEncryptorAutoConfiguration.class,EncryptionAutoConfiguration.class})
public class ConfigServer {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigServer.class).web(true).run(args);
	}

}
