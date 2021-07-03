package io.github.zhdanok.devStartBot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Service
public class MessageService {

    @Autowired
    DevStartBot devStartBot;

    public void sendMessage(Long actualChatId, String message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(actualChatId).setText(message);
        try {
            devStartBot.execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(Long actualChatId, String message, ReplyKeyboard replyKeyboard) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(actualChatId).setText(message).setReplyMarkup(replyKeyboard);
        try {
            devStartBot.execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
