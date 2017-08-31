package com.lankydan;

import com.lankydan.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

  @Autowired private MyService myService;

  public static void main(String args[]) {
    SpringApplication.run(Application.class);
  }

  @Override
  public void run(final String args[]) {
  	myService.doStuff("value");
	}
}
