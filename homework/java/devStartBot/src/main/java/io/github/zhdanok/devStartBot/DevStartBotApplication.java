package io.github.zhdanok.devStartBot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class DevStartBotApplication {

	public static void main(String[] args) {
		ApiContextInitializer.init();
		SpringApplication.run(DevStartBotApplication.class, args);
	}

}
