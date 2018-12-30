package com.ready2die;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.PrintStream;

@SpringBootApplication
@RestController
public class Application {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring";
    }

    public static void main(String[] args) {
//        SpringApplication application = new SpringApplication(Application.class);
//        application.setBanner(new Banner() {
//            @Override
//            public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
//                out.println("===========================");
//                out.println("===========================");
//                out.println("===========================");
//            }
//        });
////        application.setBannerMode(Banner.Mode.OFF);
//        application.run(args);

        new SpringApplicationBuilder()
                .sources(Application.class)
                .run(args);
    }

//    @Bean
//    public ServletWebServerFactory serverFactory() {
//        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
//        tomcat.addAdditionalTomcatConnectors(createStandardConnector());
//        return tomcat;
//    }
//
//    private Connector createStandardConnector() {
//        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//        connector.setPort(8080);
//        return connector;
//    }
}
