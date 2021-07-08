package com.github.pavelbo.fitbot.service;

import static com.github.pavelbo.fitbot.util.UpdateTypeUtil.isCallbackQuery;
import static com.github.pavelbo.fitbot.util.UpdateTypeUtil.isContactMessage;
import static com.github.pavelbo.fitbot.util.UpdateTypeUtil.isTextMessage;

import com.github.pavelbo.fitbot.keyboard.InlineKeyboardSource;
import com.github.pavelbo.fitbot.keyboard.ReplayKeyboardService;
import com.github.pavelbo.fitbot.util.UpdateTypeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
public class DispatchUpdate {

    public void choiceOfAnswer(Update update) {
        UpdateTypeUtil.getType(update)
                .getProcessor().process(update);
    }
}
