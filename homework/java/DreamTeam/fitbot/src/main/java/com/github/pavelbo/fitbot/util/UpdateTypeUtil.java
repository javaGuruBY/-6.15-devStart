package com.github.pavelbo.fitbot.util;

import com.github.pavelbo.fitbot.constant.UpdateType;
import com.github.pavelbo.fitbot.service.CallbackProcessor;
import com.github.pavelbo.fitbot.service.ContactProcessor;
import com.github.pavelbo.fitbot.service.DefaultProcessor;
import com.github.pavelbo.fitbot.service.TextProcessor;
import org.telegram.telegrambots.meta.api.objects.Update;

public class UpdateTypeUtil {

    public static UpdateType getType(Update update) {
        if (isTextMessage(update)) {
            return UpdateType.TEXT;
        } else if (isCallbackQuery(update)) {
            return UpdateType.CALLBACK;
        } else if (isContactMessage(update)) {
            return UpdateType.CONTACT;
        } else {
            return UpdateType.DEFAULT;
        }
    }

    public static boolean isContactMessage(Update update) {
        return update.hasMessage() && update.getMessage().hasContact();
    }

    public static boolean isCallbackQuery(Update update) {
        return update.hasCallbackQuery();
    }

    public static boolean isTextMessage(Update update) {
        return update.hasMessage() && update.getMessage().hasText();
    }
}
