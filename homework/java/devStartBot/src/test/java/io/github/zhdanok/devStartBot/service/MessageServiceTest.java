package io.github.zhdanok.devStartBot.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.zhdanok.devStartBot.config.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {DevStartBot.class, Mapper.class, MessageService.class})
class MessageServiceTest {

    @Autowired
    DevStartBot devStartBot;

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    MessageService messageService;

   /* @Test
    void sendMessage() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/start.json"), Update.class);
        Long expectedChatId = 972435376L;
        Long actualChatId = update.getMessage().getChatId();
        assertEquals(expectedChatId, actualChatId);
        String message = "Hi!";
        SendMessage actual = messageService.sendMessage(actualChatId, message);
        SendMessage expected = new SendMessage().setChatId(expectedChatId).setText("Hi!");
        assertEquals(expected, actual);
    }*/

}