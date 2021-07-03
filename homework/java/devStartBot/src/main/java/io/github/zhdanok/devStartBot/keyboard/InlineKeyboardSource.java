package io.github.zhdanok.devStartBot.keyboard;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;
@Component
public class InlineKeyboardSource {

    public InlineKeyboardMarkup getKeyboard() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton firstButton = new InlineKeyboardButton()
                .setText("HELP")
                .setCallbackData("/help");
        InlineKeyboardButton secondButton = new InlineKeyboardButton()
                .setText("SETTINGS")
                .setCallbackData("/settings");
        InlineKeyboardButton thirdButton = new InlineKeyboardButton()
                .setText("ABOUT US")
                .setCallbackData("/aboutUs");

        List<InlineKeyboardButton> firstKeyboard = new ArrayList<>();
        firstKeyboard.add(firstButton);
        List<InlineKeyboardButton>secondKeyboard = new ArrayList<>();
        secondKeyboard.add(secondButton);
        secondKeyboard.add(thirdButton);

        List<List<InlineKeyboardButton>> keyboardRows = new ArrayList<>();
        keyboardRows.add(firstKeyboard);
        keyboardRows.add(secondKeyboard);

        inlineKeyboardMarkup.setKeyboard(keyboardRows);

        return inlineKeyboardMarkup;


    }
}
