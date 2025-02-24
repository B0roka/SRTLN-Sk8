package com.b0roka.SRTLN_sk8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.b0roka.SRTLN_sk8")
public class SrtlnSk8Application {

	private static final Logger log = LoggerFactory.getLogger(SrtlnSk8Application.class);

	public static void main(String[] args) {
		SpringApplication.run(SrtlnSk8Application.class, args);
		log.info("La aplicación ha compilado correctamente");
	}

}
