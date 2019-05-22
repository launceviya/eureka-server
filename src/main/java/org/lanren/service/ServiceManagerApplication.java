package org.lanren.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @version V1.0
 * @ProjectName:service-manager
 * @Description:
 * @Copyright: Copyright (c) 2019
 * @Company:鲸力智享（北京）科技有限公司
 * @author: Lan Yuan
 * @email: yuan.lan@jingli365.com
 * @date 2019-05-20 14:24
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceManagerApplication.class, args);
    }
}
