package com.github.pavelbo.fitbot.keyboard;

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

        InlineKeyboardButton button700 = new InlineKeyboardButton()
                .setText("7:00-7:30")
                .setCallbackData("/hour700");
        InlineKeyboardButton button730 = new InlineKeyboardButton()
                .setText("7:30-8:00")
                .setCallbackData("/hour730");
        InlineKeyboardButton button800 = new InlineKeyboardButton()
                .setText("8:00-8:30")
                .setCallbackData("/hour800");
        InlineKeyboardButton button830 = new InlineKeyboardButton()
                .setText("8:30-9:00")
                .setCallbackData("/hour830");
        InlineKeyboardButton button900 = new InlineKeyboardButton()
                .setText("9:00-9:30")
                .setCallbackData("/hour900");
        InlineKeyboardButton button930 = new InlineKeyboardButton()
                .setText("9:30-10:00")
                .setCallbackData("/hour930");
        InlineKeyboardButton button1000 = new InlineKeyboardButton()
                .setText("10:00-10:30")
                .setCallbackData("/hour1000");
        InlineKeyboardButton button1030 = new InlineKeyboardButton()
                .setText("10:30-11:00")
                .setCallbackData("/hour1030");
        InlineKeyboardButton button1100 = new InlineKeyboardButton()
                .setText("11:00-11:30")
                .setCallbackData("/hour1100");
        InlineKeyboardButton button1130 = new InlineKeyboardButton()
                .setText("11:30-12:00")
                .setCallbackData("/hour1130");
        InlineKeyboardButton button1200 = new InlineKeyboardButton()
                .setText("12:00-12:30")
                .setCallbackData("/hour1200");
        InlineKeyboardButton button1230 = new InlineKeyboardButton()
                .setText("12:30-13:00")
                .setCallbackData("/hour1230");
        InlineKeyboardButton button1300 = new InlineKeyboardButton()
                .setText("13:00-13:30")
                .setCallbackData("/hour1300");
        InlineKeyboardButton button1330 = new InlineKeyboardButton()
                .setText("13:30-14:00")
                .setCallbackData("/hour1330");

        List<List<InlineKeyboardButton>> keyboardRows = new ArrayList<>();

        List<InlineKeyboardButton> keyboard730 = new ArrayList<>();
        keyboard730.add(button730);
        keyboardRows.add(keyboard730);

        List<InlineKeyboardButton> keyboard800 = new ArrayList<>();
        keyboard800.add(button800);
        keyboardRows.add(keyboard800);

        List<InlineKeyboardButton> keyboard830 = new ArrayList<>();
        keyboard830.add(button830);
        keyboardRows.add(keyboard830);

        List<InlineKeyboardButton> keyboard900 = new ArrayList<>();
        keyboard900.add(button900);
        keyboardRows.add(keyboard900);

        List<InlineKeyboardButton> keyboard930 = new ArrayList<>();
        keyboard930.add(button930);
        keyboardRows.add(keyboard930);

        List<InlineKeyboardButton> keyboard1000 = new ArrayList<>();
        keyboard1000.add(button1000);
        keyboardRows.add(keyboard1000);

        List<InlineKeyboardButton> keyboard1030 = new ArrayList<>();
        keyboard1030.add(button1030);
        keyboardRows.add(keyboard1030);

        List<InlineKeyboardButton> keyboard1100 = new ArrayList<>();
        keyboard1100.add(button1100);
        keyboardRows.add(keyboard1100);

        List<InlineKeyboardButton> keyboard1130 = new ArrayList<>();
        keyboard1130.add(button1130);
        keyboardRows.add(keyboard1130);

        List<InlineKeyboardButton> keyboard1200 = new ArrayList<>();
        keyboard1200.add(button1200);
        keyboardRows.add(keyboard1200);

        List<InlineKeyboardButton> keyboard1230 = new ArrayList<>();
        keyboard1230.add(button1230);
        keyboardRows.add(keyboard1230);

        List<InlineKeyboardButton> keyboard1300 = new ArrayList<>();
        keyboard1300.add(button1300);
        keyboardRows.add(keyboard1300);

        List<InlineKeyboardButton> keyboard1330 = new ArrayList<>();
        keyboard1330.add(button1330);
        keyboardRows.add(keyboard1330);

        inlineKeyboardMarkup.setKeyboard(keyboardRows);
        return inlineKeyboardMarkup;
    }

}
