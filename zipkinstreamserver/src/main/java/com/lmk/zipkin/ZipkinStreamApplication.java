package com.lmk.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class ZipkinStreamApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinStreamApplication.class, args);
    }
}
