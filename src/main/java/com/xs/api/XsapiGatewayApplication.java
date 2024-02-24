package com.xs.api;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class
})
@EnableDubbo
public class XsapiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(XsapiGatewayApplication.class, args);
    }

    //@Bean
    //public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
    //    return builder.routes()
    //            .route("tobaidu", r -> r.path("/baidu")
    //                    .uri("http://www.baidu.com"))
    //            .route("tojaux", r -> r.path("/jaux")
    //                    .uri("http://jauxgit.top"))
    //            .build();
    //}
}
