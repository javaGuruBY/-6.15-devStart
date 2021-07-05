package com.github.pavelbo.fitbot.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pavelbo.fitbot.keyboard.InlineKeyboardSource;
import com.github.pavelbo.fitbot.keyboard.ReplayKeyboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

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
        if(update.hasMessage() && update.getMessage().hasText()) {
            switch (update.getMessage().getText()) {
                case "/start":
                    messageService.sendMessage(getChatId(update), START_MESSAGE,
                            inlineKeyboardSource.getKeyboardMain(), replayKeyboardService.getReplayKeyboardMain());
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
                    int month2 = Calendar.getInstance().get(Calendar.MONTH) +1;
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_DAY,
                            inlineKeyboardSource.getKeyboardDay(countDay(month2)));
                    break;
                case "/month3" :
                    int month3 = Calendar.getInstance().get(Calendar.MONTH) +2;
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_DAY,
                            inlineKeyboardSource.getKeyboardDay(countDay(month3)));
                    break;
                case "/month4" :
                    int month4 = Calendar.getInstance().get(Calendar.MONTH) +3;
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_DAY,
                            inlineKeyboardSource.getKeyboardDay(countDay(month4)));
                    break;
                case "/month5" :
                    int month5 = Calendar.getInstance().get(Calendar.MONTH) +4;
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_DAY,
                            inlineKeyboardSource.getKeyboardDay(countDay(month5)));
                    break;
                case "/month6" :
                    int month6 = Calendar.getInstance().get(Calendar.MONTH) +5;
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_DAY,
                            inlineKeyboardSource.getKeyboardDay(countDay(month6)));
                    break;
                case "/month7" :
                    int month7 = Calendar.getInstance().get(Calendar.MONTH) +6;
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_DAY,
                            inlineKeyboardSource.getKeyboardDay(countDay(month7)));
                    break;
                case "/day1" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day2" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day3" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day4" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day5" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day6" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day7" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day8" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day9" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day10" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day11" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day12" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day13" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day14" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day15" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day16" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day17" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day18" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day19" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day20" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day21" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day22" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day23" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day24" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day25" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day26" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day27" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day28" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day29" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day30" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/day31" :
                    messageService.sendMessage(getChatId(update),SELECTION_OF_THE_HOUR,
                            inlineKeyboardSource.getKeyboardHour());
                    break;
                case "/contact" :
                    messageService.sendMessage(getChatId(update),"Contact!", inlineKeyboardSource.getKeyboardMain());
                    break;
                default:
                    messageService.sendMessage(getChatId(update),"Do no!", inlineKeyboardSource.getKeyboardMain(), replayKeyboardService.getYesOrNo());
                    break;
            }
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
        return null;
    }

    private void saveJson(Update update) {
        try{
            objectMapper.writeValue(new File("src/test/resources/update.json"), update);
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
