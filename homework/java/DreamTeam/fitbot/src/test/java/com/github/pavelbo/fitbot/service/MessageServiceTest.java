package com.github.pavelbo.fitbot.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pavelbo.fitbot.FitbotApplicationTests;
import com.github.pavelbo.fitbot.config.Mapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MessageServiceTest extends FitbotApplicationTests {

    @Autowired
    TelegramBot telegramBot;
    @Autowired
    ObjectMapper objectMapper;
    @Autowired
    MessageService messageService;

//    @Test
//    void onUnknownReceived() throws IOException {
//        Update update = objectMapper.readValue(new File("src/test/resources/update.json"), Update.class);
//        SendMessage actualResult = messageService.onUpdateReceived(update);
//        SendMessage expectedResult = makeMessage("Do no");
//        assertEquals(expectedResult, actualResult);
//    }
//
//    @Test
//    void onUStartReceived() throws IOException {
//        Update update = objectMapper.readValue(new File("src/test/resources/start.json"), Update.class);
//        SendMessage actualResult = messageService.onUpdateReceived(update);
//        SendMessage expectedResult = makeMessage("Hello!");
//        assertEquals(expectedResult, actualResult);
//    }
//
//    @Test
//    void onSettingsReceived() throws IOException {
//        Update update = objectMapper.readValue(new File("src/test/resources/settings.json"), Update.class);
//        SendMessage actualResult = messageService.onUpdateReceived(update);
//        SendMessage expectedResult = makeMessage("Settings!");
//        assertEquals(expectedResult, actualResult);
//    }
//
//    @Test
//    void onHelpReceived() throws IOException {
//        Update update = objectMapper.readValue(new File("src/test/resources/help.json"), Update.class);
//        SendMessage actualResult = messageService.onUpdateReceived(update);
//        SendMessage expectedResult = makeMessage("Help!");
//        assertEquals(expectedResult, actualResult);
//    }
//
//    @Test
//    private SendMessage makeMessage(String text) {
//        SendMessage sendMessage = new SendMessage();
//        sendMessage.setChatId(365905429L);
//        sendMessage.setText(text);
//        return sendMessage;
//    }
}