package homex.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import cn.hutool.core.util.NetUtil;
import cn.hutool.log.LogFactory;

/**
 * <p>服务注册中心</p>
 * @author K
 */
@SpringBootApplication
@EnableEurekaServer   
public class EurekaApplication {
	public static void main(String[] args) {
        int port = 8761;
        if(!NetUtil.isUsableLocalPort(port)) {
            System.err.printf("该端口被占用", port );
            System.exit(1);
        }
        new SpringApplicationBuilder(EurekaApplication.class).properties("server.port=" + port).run(args);
	}
}
