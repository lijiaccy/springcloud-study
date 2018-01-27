package com.lijia.lijia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by lj on 2018/1/27.
 */
@SpringBootApplication
@EnableConfigServer
public class AppServer {

    public static void main(String[] args) {
        SpringApplication.run(AppServer.class, args);
    }
}