package com.github.pavelbo.fitbot.util;

import static com.github.pavelbo.fitbot.util.UpdateTypeUtil.isCallbackQuery;
import static com.github.pavelbo.fitbot.util.UpdateTypeUtil.isContactMessage;
import static com.github.pavelbo.fitbot.util.UpdateTypeUtil.isTextMessage;

import org.telegram.telegrambots.meta.api.objects.Update;

public class ChatIdExtractor {
    public static Long getChatId(Update update) {
        if (isTextMessage(update))
            return update.getMessage().getChatId();
        else if (isCallbackQuery(update))
            return update.getCallbackQuery().getMessage().getChatId();
        else if (isContactMessage(update)) {
            return update.getMessage().getChatId();
        }
        return null;
    }
}
