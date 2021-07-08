package com.github.pavelbo.fitbot.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pavelbo.fitbot.keyboard.InlineKeyboardSource;
import com.github.pavelbo.fitbot.keyboard.ReplayKeyboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static com.github.pavelbo.fitbot.constant.StringConctant.*;

@Component
@PropertySource("application.properties")
public class TelegramBot extends TelegramLongPollingBot {

    @Value("${bot.username}")
    private String botUsername;
    @Value("${bot.token}")
    private String botToken;

    final ObjectMapper objectMapper;
    final DispatchUpdate dispatchUpdate;

    public TelegramBot(ObjectMapper objectMapper, DispatchUpdate dispatchUpdate) {
        this.objectMapper = objectMapper;
        this.dispatchUpdate = dispatchUpdate;
    }

    @Override
    public void onUpdateReceived(Update update) {
        dispatchUpdate.choiceOfAnswer(update);
    }

    private void saveJson(Update update) {
        try{
            objectMapper.writeValue(new File("src/test/resources/contact.json"), update);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return botUsername;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }
}
