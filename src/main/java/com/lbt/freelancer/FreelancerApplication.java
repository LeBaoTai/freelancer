package com.lbt.freelancer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FreelancerApplication {

  public static void main(String[] args) {
    SpringApplication.run(FreelancerApplication.class, args);
  }
}
