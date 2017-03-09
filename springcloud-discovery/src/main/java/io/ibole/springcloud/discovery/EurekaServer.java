/**
 * 
 */
package io.ibole.springcloud.discovery;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zijia.wang
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaServer.class).web(true).properties(
                "spring.config.name:eureka", "logging.level.com.netflix.discovery:OFF")
                .run(args);
	}

}
