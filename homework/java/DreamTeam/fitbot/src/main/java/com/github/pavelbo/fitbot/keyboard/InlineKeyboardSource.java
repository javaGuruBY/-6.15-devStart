package com.github.pavelbo.fitbot.keyboard;

import com.github.pavelbo.fitbot.constant.StringConctant;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import static com.github.pavelbo.fitbot.constant.StringConctant.buttonText;
import static com.github.pavelbo.fitbot.constant.StringConctant.buttonName;
import static com.github.pavelbo.fitbot.constant.StringConctant.monthNames;

@Component
public class InlineKeyboardSource {
    public InlineKeyboardMarkup getKeyboardMain(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton descriptionButton = new InlineKeyboardButton()
                .setText("Описание")
                .setCallbackData("/description");
        InlineKeyboardButton contactButton = new InlineKeyboardButton()
                .setText("Контакты")
                .setCallbackData("/contact");

        List<InlineKeyboardButton> firstKeyboard = new ArrayList<>();
        firstKeyboard.add(descriptionButton);
        firstKeyboard.add(contactButton);

        List<List<InlineKeyboardButton>> keyboardRows = new ArrayList<>();
        keyboardRows.add(firstKeyboard);

        inlineKeyboardMarkup.setKeyboard(keyboardRows);
        return inlineKeyboardMarkup;
    }

    public InlineKeyboardMarkup getKeyboardMonth(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();

        InlineKeyboardButton firstButton = new InlineKeyboardButton()
                .setText(monthNames[Calendar.getInstance().get(Calendar.MONTH)])
                .setCallbackData("/month1");
        InlineKeyboardButton secondButton = new InlineKeyboardButton()
                .setText(monthNames[Calendar.getInstance().get(Calendar.MONTH)+1])
                .setCallbackData("/month2");

        List<InlineKeyboardButton> firstKeyboard = new ArrayList<>();
        firstKeyboard.add(firstButton);
        firstKeyboard.add(secondButton);

        List<List<InlineKeyboardButton>> keyboardRows = new ArrayList<>();
        keyboardRows.add(firstKeyboard);

        inlineKeyboardMarkup.setKeyboard(keyboardRows);
        return inlineKeyboardMarkup;
    }

    public InlineKeyboardMarkup getKeyboardDay(int countDays){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> firstKeyboard = new ArrayList<>();
        List<InlineKeyboardButton> secondKeyboard = new ArrayList<>();
        List<InlineKeyboardButton> thirdKeyboard = new ArrayList<>();
        List<InlineKeyboardButton> fourthKeyboard = new ArrayList<>();
        List<InlineKeyboardButton> fifthKeyboard = new ArrayList<>();
        List<InlineKeyboardButton> sixthKeyboard = new ArrayList<>();
        List<InlineKeyboardButton> seventhKeyboard = new ArrayList<>();
        for (int i = 1; i <= countDays; i++){
            if (i < 6)
            firstKeyboard.add(new InlineKeyboardButton().setText(String.valueOf(i))
                    .setCallbackData("/day" + i));
            else if (i < 11)
                secondKeyboard.add(new InlineKeyboardButton().setText(String.valueOf(i))
                        .setCallbackData("/day" + i));
            else if (i < 16)
                thirdKeyboard.add(new InlineKeyboardButton().setText(String.valueOf(i))
                        .setCallbackData("/day" + i));
            else if (i < 21)
                fourthKeyboard.add(new InlineKeyboardButton().setText(String.valueOf(i))
                        .setCallbackData("/day" + i));
            else if (i < 26)
                fifthKeyboard.add(new InlineKeyboardButton().setText(String.valueOf(i))
                        .setCallbackData("/day" + i));
            else if (i < 31) sixthKeyboard.add(new InlineKeyboardButton().setText(String.valueOf(i))
                        .setCallbackData("/day" + i));
            else seventhKeyboard.add(new InlineKeyboardButton().setText(String.valueOf(i))
                        .setCallbackData("/day" + i));
        }

        List<List<InlineKeyboardButton>> keyboardRows = new ArrayList<>();
        keyboardRows.add(firstKeyboard);
        keyboardRows.add(secondKeyboard);
        keyboardRows.add(thirdKeyboard);
        keyboardRows.add(fourthKeyboard);
        keyboardRows.add(fifthKeyboard);
        keyboardRows.add(sixthKeyboard);
        keyboardRows.add(seventhKeyboard);

        inlineKeyboardMarkup.setKeyboard(keyboardRows);
        return inlineKeyboardMarkup;
    }

    public InlineKeyboardMarkup getKeyboardHour(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboardRows = new ArrayList<>();
        InlineKeyboardButton[] buttons = new InlineKeyboardButton[buttonName.length];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new InlineKeyboardButton();
            buttons[i].setText(buttonText[i] + i).setCallbackData(buttonName[i]);
            List<InlineKeyboardButton> keyboard = new ArrayList<>();
            keyboard.add(buttons[i]);
            keyboardRows.add(keyboard);
        }

        inlineKeyboardMarkup.setKeyboard(keyboardRows);
        return inlineKeyboardMarkup;
    }

}
