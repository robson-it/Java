package com.robsonit.MS_Email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsEmailApplication {

		public static void main (String[]args) {
			try {
				SpringApplication.run(MsEmailApplication.class, args);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
