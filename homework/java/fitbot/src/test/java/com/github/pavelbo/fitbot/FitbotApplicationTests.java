package com.github.pavelbo.fitbot;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pavelbo.fitbot.service.MessageService;
import com.github.pavelbo.fitbot.service.TelegramBot;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {TelegramBot.class, ObjectMapper.class, MessageService.class})
public class FitbotApplicationTests {

	@Test
	void contextLoads() {
	}

}
