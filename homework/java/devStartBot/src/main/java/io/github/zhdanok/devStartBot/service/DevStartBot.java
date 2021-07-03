package io.github.zhdanok.devStartBot.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.zhdanok.devStartBot.keyboard.InlineKeyboardSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;


@PropertySource("application.properties")
@Component
public class DevStartBot extends TelegramLongPollingBot {

    @Value("${bot.username}")
    private String botUsername;

    @Value("${bot.token}")
    private String botToken;

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    MessageService messageService;

    @Autowired
    InlineKeyboardSource inlineKeyboardSource;

    public static final String START_MESSAGE = "Hi!";

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            switch (update.getMessage().getText()) {
                case "/start":
                    messageService.sendMessage(update.getMessage().getChatId(), START_MESSAGE);
                    break;
                case "/help":
                    messageService.sendMessage(update.getMessage().getChatId(), "Help!");
                    break;
                case "/settings":
                    messageService.sendMessage(update.getMessage().getChatId(), "Settings", inlineKeyboardSource.getKeyboard());
                    break;
                default:
                    messageService.sendMessage(update.getMessage().getChatId(), "I don't know");
                    break;
            }


        } else if (update.hasCallbackQuery()) {
            switch (update.getCallbackQuery().getData()) {
                case "/aboutUs":
                    messageService.sendMessage(update.getCallbackQuery().getMessage().getChatId(), "We are cool");
                    break;
                case "/help":
                    messageService.sendMessage(update.getCallbackQuery().getMessage().getChatId(), "Help! from callback");
                    break;
                case "/settings":
                    messageService.sendMessage(update.getCallbackQuery().getMessage().getChatId(), "Keyboard", inlineKeyboardSource.getKeyboard());
                    break;
            }

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

/*try {
            objectMapper.writeValue(new File("src/test/resources/start.json"),update);
            System.out.println("writed");
        } catch (Exception ex) {
            ex.printStackTrace();
        }*/