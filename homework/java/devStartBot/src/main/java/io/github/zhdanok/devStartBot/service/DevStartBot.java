package io.github.zhdanok.devStartBot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@PropertySource("application.properties")
@Component
public class DevStartBot extends TelegramLongPollingBot {

    @Value("$bot.username")
    private  String botUsername;

    @Value("$bot.token")
    private  String botToken;

    @Override
    public void onUpdateReceived(Update update) {

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
