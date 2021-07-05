package com.github.pavelbo.fitbot.keyboard;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

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
        InlineKeyboardButton secondButton09 = new InlineKeyboardButton()
                .setText(monthNames[Calendar.getInstance().get(Calendar.MONTH) + 2])
                .setCallbackData("/month3");
        InlineKeyboardButton secondButton10 = new InlineKeyboardButton()
                .setText(monthNames[Calendar.getInstance().get(Calendar.MONTH)+3])
                .setCallbackData("/month4");
        InlineKeyboardButton secondButton11 = new InlineKeyboardButton()
                .setText(monthNames[Calendar.getInstance().get(Calendar.MONTH)+4])
                .setCallbackData("/month5");
        InlineKeyboardButton secondButton12 = new InlineKeyboardButton()
                .setText(monthNames[Calendar.getInstance().get(Calendar.MONTH)+5])
                .setCallbackData("/month6");
        InlineKeyboardButton secondButton01 = new InlineKeyboardButton()
                .setText(monthNames[Calendar.getInstance().get(Calendar.MONTH)+6])
                .setCallbackData("/month7");

        List<InlineKeyboardButton> firstKeyboard = new ArrayList<>();
        firstKeyboard.add(firstButton);
        firstKeyboard.add(secondButton);
        firstKeyboard.add(secondButton09);
        firstKeyboard.add(secondButton10);
        firstKeyboard.add(secondButton11);
        firstKeyboard.add(secondButton12);
        firstKeyboard.add(secondButton01);

        List<List<InlineKeyboardButton>> keyboardRows = new ArrayList<>();
        keyboardRows.add(firstKeyboard);
        firstKeyboard.add(secondButton);
        firstKeyboard.add(secondButton09);
        firstKeyboard.add(secondButton10);
        firstKeyboard.add(secondButton11);
        firstKeyboard.add(secondButton12);
        firstKeyboard.add(secondButton01);

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
                .setText("7:00-8:00 осталось 15 мест")
                .setCallbackData("/hour700");
        InlineKeyboardButton button800 = new InlineKeyboardButton()
                .setText("8:00-9:00 осталось 3 мест")
                .setCallbackData("/hour800");
        InlineKeyboardButton button900 = new InlineKeyboardButton()
                .setText("9:00-10:00 осталось 10 мест")
                .setCallbackData("/hour900");
        InlineKeyboardButton button1000 = new InlineKeyboardButton()
                .setText("10:00-11:00 осталось 13 мест")
                .setCallbackData("/hour1000");
        InlineKeyboardButton button1100 = new InlineKeyboardButton()
                .setText("11:00-12:00 осталось 15 мест")
                .setCallbackData("/hour1100");
        InlineKeyboardButton button1200 = new InlineKeyboardButton()
                .setText("12:00-13:00 осталось 5 мест")
                .setCallbackData("/hour1200");
        InlineKeyboardButton button1300 = new InlineKeyboardButton()
                .setText("13:00-14:00 осталось 14 мест")
                .setCallbackData("/hour1300");
        InlineKeyboardButton button1400 = new InlineKeyboardButton()
                .setText("14:00-15:00 осталось 1 место")
                .setCallbackData("/hour1400");
        InlineKeyboardButton button1500 = new InlineKeyboardButton()
                .setText("15:00-16:00 осталось 5 мест")
                .setCallbackData("/hour1500");
        InlineKeyboardButton button1600 = new InlineKeyboardButton()
                .setText("16:00-17:00 осталось 0 мест")
                .setCallbackData("/hour1600");
        InlineKeyboardButton button1700 = new InlineKeyboardButton()
                .setText("17:00-18:00 осталось 0 мест")
                .setCallbackData("/hour1700");
        InlineKeyboardButton button1800 = new InlineKeyboardButton()
                .setText("12:30-13:00 осталось 3 места")
                .setCallbackData("/hour1800");
        InlineKeyboardButton button1900 = new InlineKeyboardButton()
                .setText("18:00-19:00 осталось 2 места")
                .setCallbackData("/hour1900");
        InlineKeyboardButton button2000 = new InlineKeyboardButton()
                .setText("19:00-20:00 осталось 0 мест")
                .setCallbackData("/hour2000");
        InlineKeyboardButton button2100 = new InlineKeyboardButton()
                .setText("20:00-21:00 осталось 5 мест")
                .setCallbackData("/hour2100");
        InlineKeyboardButton button2200 = new InlineKeyboardButton()
                .setText("21:00-22:00 осталось 1 место")
                .setCallbackData("/hour2200");
        InlineKeyboardButton button2300 = new InlineKeyboardButton()
                .setText("22:00-23:00 осталось 0 мест")
                .setCallbackData("/hour2300");

        List<List<InlineKeyboardButton>> keyboardRows = new ArrayList<>();

        List<InlineKeyboardButton> keyboard700 = new ArrayList<>();
        keyboard700.add(button700);
        keyboardRows.add(keyboard700);

        List<InlineKeyboardButton> keyboard800 = new ArrayList<>();
        keyboard800.add(button800);
        keyboardRows.add(keyboard800);

        List<InlineKeyboardButton> keyboard900 = new ArrayList<>();
        keyboard900.add(button900);
        keyboardRows.add(keyboard900);

        List<InlineKeyboardButton> keyboard1000 = new ArrayList<>();
        keyboard1000.add(button1000);
        keyboardRows.add(keyboard1000);

        List<InlineKeyboardButton> keyboard1100 = new ArrayList<>();
        keyboard1100.add(button1100);
        keyboardRows.add(keyboard1100);

        List<InlineKeyboardButton> keyboard1200 = new ArrayList<>();
        keyboard1200.add(button1200);
        keyboardRows.add(keyboard1200);

        List<InlineKeyboardButton> keyboard1300 = new ArrayList<>();
        keyboard1300.add(button1300);
        keyboardRows.add(keyboard1300);

        List<InlineKeyboardButton> keyboard1400 = new ArrayList<>();
        keyboard1400.add(button1400);
        keyboardRows.add(keyboard1400);

        List<InlineKeyboardButton> keyboard1500 = new ArrayList<>();
        keyboard1500.add(button1500);
        keyboardRows.add(keyboard1500);

        List<InlineKeyboardButton> keyboard1600 = new ArrayList<>();
        keyboard1600.add(button1600);
        keyboardRows.add(keyboard1600);

        List<InlineKeyboardButton> keyboard1700 = new ArrayList<>();
        keyboard1700.add(button1700);
        keyboardRows.add(keyboard1700);

        List<InlineKeyboardButton> keyboard1800 = new ArrayList<>();
        keyboard1800.add(button1800);
        keyboardRows.add(keyboard1800);

        List<InlineKeyboardButton> keyboard1900 = new ArrayList<>();
        keyboard1900.add(button1900);
        keyboardRows.add(keyboard1900);

        List<InlineKeyboardButton> keyboard2000 = new ArrayList<>();
        keyboard2000.add(button2000);
        keyboardRows.add(keyboard2000);

        List<InlineKeyboardButton> keyboard2100 = new ArrayList<>();
        keyboard2100.add(button2100);
        keyboardRows.add(keyboard2100);

        List<InlineKeyboardButton> keyboard2200 = new ArrayList<>();
        keyboard2200.add(button2200);
        keyboardRows.add(keyboard2200);

        List<InlineKeyboardButton> keyboard2300 = new ArrayList<>();
        keyboard2300.add(button2300);
        keyboardRows.add(keyboard2300);

        inlineKeyboardMarkup.setKeyboard(keyboardRows);
        return inlineKeyboardMarkup;
    }

}
