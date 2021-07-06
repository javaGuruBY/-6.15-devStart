package com.github.pavelbo.fitbot.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pavelbo.fitbot.keyboard.InlineKeyboardSource;
import com.github.pavelbo.fitbot.keyboard.ReplayKeyboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static com.github.pavelbo.fitbot.constant.StringConctant.*;

@Component
@PropertySource("application.properties")
public class TelegramBot extends TelegramLongPollingBot {

    @Value("${bot.username}")
    private String botUsername;
    @Value("${bot.token}")
    private String botToken;

    @Autowired
    ObjectMapper objectMapper;
    @Autowired
    MessageService messageService;
    @Autowired
    InlineKeyboardSource inlineKeyboardSource;
    @Autowired
    ReplayKeyboardService replayKeyboardService;

    @Override
    public void onUpdateReceived(Update update) {
        choiceOfAnswer(update);
    }

    private void choiceOfAnswer(Update update) {
        if(update.hasMessage() && update.getMessage().hasText()) {
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
        }else if(update.hasCallbackQuery()) {
            switch (update.getCallbackQuery().getData()){
                case "/start":
                    messageService.sendMessage(getChatId(update), START_MESSAGE,
                            inlineKeyboardSource.getKeyboardMain(), replayKeyboardService.getReplayKeyboardMain());
                    break;
                case "/month1" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_DAY,
                            inlineKeyboardSource.getKeyboardDay(countDay(Calendar.getInstance().get(Calendar.MONTH))));
                    break;
                case "/month2" :
                    int month = Calendar.getInstance().get(Calendar.MONTH) +1;
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_DAY,
                            inlineKeyboardSource.getKeyboardDay(countDay(month)));
                    break;
                case "/hour900" :
                case "/hour930" :
                case "/hour1000" :
                case "/hour1030" :
                case "/hour1100" :
                case "/hour1130" :
                case "/hour1200" :
                case "/hour1230" :
                case "/hour1300" :
                case "/hour1330" :
                case "/hour1400" :
                case "/hour1430" :
                case "/hour1500" :
                case "/hour1530" :
                case "/hour1600" :
                case "/hour1630" :
                case "/hour1700" :
                case "/hour1730" :
                case "/hour1800" :
                case "/hour1830" :
                case "/hour1900" :
                case "/hour1930" :
                case "/hour2000" :
                case "/hour2030" :
                case "/hour2100" :
                case "/hour2130" :
                case "/hour2200" :
                    //saveFile(update);
                    messageService.sendMessage(getChatId(update),CONFIRM_ENTRY_MESSAGE + "15 июля в 17:00-17:30 ",
                            replayKeyboardService.getYesOrNo());
                    break;
                case "/day1" :
                case "/day2" :
                case "/day3" :
                case "/day4" :
                case "/day5" :
                case "/day6" :
                case "/day7" :
                case "/day8" :
                case "/day9" :
                case "/day10" :
                case "/day11" :
                case "/day12" :
                case "/day13" :
                case "/day14" :
                case "/day15" :
                case "/day16" :
                case "/day17" :
                case "/day18" :
                case "/day19" :
                case "/day20" :
                case "/day21" :
                case "/day22" :
                case "/day23" :
                case "/day24" :
                case "/day25" :
                case "/day26" :
                case "/day27" :
                case "/day28" :
                case "/day29" :
                case "/day30" :
                case "/day31" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/contact" :
                    messageService.sendMessage(getChatId(update),"Contact!", inlineKeyboardSource.getKeyboardMain());
                    break;
                default:
                    messageService.sendMessage(getChatId(update),"Do no!", inlineKeyboardSource.getKeyboardMain(), replayKeyboardService.getReplayKeyboardMain());
                    break;
            }
        }
        else if (update.hasMessage() && update.getMessage().hasContact()){
            messageService.sendMessage(getChatId(update),"Авторизация прошла успешно!", replayKeyboardService.getReplayKeyboardMain());
        }
    }

    private int countDay (int month){
        GregorianCalendar calendar = new GregorianCalendar(Calendar.getInstance().get(Calendar.YEAR),
                month , Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    private Long getChatId(Update update) {
        if (update.hasMessage() && update.getMessage().hasText())
            return update.getMessage().getChatId();
        else if (update.hasCallbackQuery())
            return update.getCallbackQuery().getMessage().getChatId();
        else if (update.getMessage().hasContact()){
            return update.getMessage().getChatId();
        }
        return null;
    }

    private void saveJson(Update update) {
        try{
            objectMapper.writeValue(new File("src/test/resources/contact.json"), update);
        }catch (IOException e){
            e.printStackTrace();
        }
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
