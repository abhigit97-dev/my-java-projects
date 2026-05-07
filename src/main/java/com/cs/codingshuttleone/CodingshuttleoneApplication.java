package com.cs.codingshuttleone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CodingshuttleoneApplication {
	
	//PaymentService pss=null;
	
	CodingshuttleoneApplication()
	{
		System.out.println("Constructor called");
	
	}

	public static void main(String[] args) {
		SpringApplication.run(CodingshuttleoneApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner clrunner(PaymentService pss)
	{
		CommandLineRunner clr=new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws InterruptedException
			{
				System.out.println("executing clr of parent class");
			
				pss.doPayment();
			}
			
		};
		
		return clr;
	}

}
