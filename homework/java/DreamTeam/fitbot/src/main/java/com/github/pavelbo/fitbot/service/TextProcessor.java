package com.github.pavelbo.fitbot.service;

import static com.github.pavelbo.fitbot.constant.StringConctant.CANCEL;
import static com.github.pavelbo.fitbot.constant.StringConctant.CONFIRMATION;
import static com.github.pavelbo.fitbot.constant.StringConctant.CONTACT_DETAILS_MESSAGE;
import static com.github.pavelbo.fitbot.constant.StringConctant.DESCRIPTION_MESSAGE;
import static com.github.pavelbo.fitbot.constant.StringConctant.SELECTION_OF_THE_MONTH;
import static com.github.pavelbo.fitbot.constant.StringConctant.START_MESSAGE;
import static com.github.pavelbo.fitbot.util.ChatIdExtractor.getChatId;


import com.github.pavelbo.fitbot.keyboard.InlineKeyboardSource;
import com.github.pavelbo.fitbot.keyboard.ReplayKeyboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
public class TextProcessor extends BaseProcessor implements Processor{

    public void process(Update update) {
        switch (update.getMessage().getText()) {
            case "/start":
                messageService.sendMessage(getChatId(update), START_MESSAGE,
                        inlineKeyboardSource.getKeyboardMain(), replayKeyboardService.getContact());
                break;
            case "Описание":
                messageService.sendMessage(getChatId(update), DESCRIPTION_MESSAGE);
                break;
            case "Контакты":
                messageService.sendMessage(getChatId(update), CONTACT_DETAILS_MESSAGE);
                break;
            case "Начать запись!":
                messageService.sendMessage(getChatId(update), SELECTION_OF_THE_MONTH,
                        inlineKeyboardSource.getKeyboardMonth());
                break;
            case "Подтвердить!":
                messageService.sendMessage(getChatId(update), CONFIRMATION,
                        replayKeyboardService.getReplayKeyboardMain());
                break;
            case "Отмена!":
                messageService.sendMessage(getChatId(update), CANCEL,
                        replayKeyboardService.getReplayKeyboardMain());
                break;
            default:
                messageService.sendMessage(getChatId(update), "Do no!", replayKeyboardService.getReplayKeyboardMain());
                break;
        }
    }
}
