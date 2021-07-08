package com.github.pavelbo.fitbot.service;

import static com.github.pavelbo.fitbot.constant.StringConctant.CONFIRM_ENTRY_MESSAGE;
import static com.github.pavelbo.fitbot.constant.StringConctant.SELECTION_OF_THE_DAY;
import static com.github.pavelbo.fitbot.constant.StringConctant.SELECTION_OF_THE_HOUR;
import static com.github.pavelbo.fitbot.constant.StringConctant.START_MESSAGE;
import static com.github.pavelbo.fitbot.util.ChatIdExtractor.getChatId;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
public class CallbackProcessor extends BaseProcessor implements Processor {

    public void process(Update update) {
        switch (update.getCallbackQuery().getData()) {
            case "/start":
                messageService.sendMessage(getChatId(update), START_MESSAGE,
                        inlineKeyboardSource.getKeyboardMain(), replayKeyboardService.getReplayKeyboardMain());
                break;
            case "/month1":
                messageService.sendMessage(getChatId(update), SELECTION_OF_THE_DAY,
                        inlineKeyboardSource.getKeyboardDay(countDay(Calendar.getInstance().get(Calendar.MONTH))));
                break;
            case "/month2":
                int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
                messageService.sendMessage(getChatId(update), SELECTION_OF_THE_DAY,
                        inlineKeyboardSource.getKeyboardDay(countDay(month)));
                break;
            case "/hour900":
            case "/hour930":
            case "/hour1000":
            case "/hour1030":
            case "/hour1100":
            case "/hour1130":
            case "/hour1200":
            case "/hour1230":
            case "/hour1300":
            case "/hour1330":
            case "/hour1400":
            case "/hour1430":
            case "/hour1500":
            case "/hour1530":
            case "/hour1600":
            case "/hour1630":
            case "/hour1700":
            case "/hour1730":
            case "/hour1800":
            case "/hour1830":
            case "/hour1900":
            case "/hour1930":
            case "/hour2000":
            case "/hour2030":
            case "/hour2100":
            case "/hour2130":
            case "/hour2200":
                //saveFile(update);
                messageService.sendMessage(getChatId(update), CONFIRM_ENTRY_MESSAGE + "15 июля в 17:00-17:30 ",
                        replayKeyboardService.getYesOrNo());
                break;
            case "/day1":
            case "/day2":
            case "/day3":
            case "/day4":
            case "/day5":
            case "/day6":
            case "/day7":
            case "/day8":
            case "/day9":
            case "/day10":
            case "/day11":
            case "/day12":
            case "/day13":
            case "/day14":
            case "/day15":
            case "/day16":
            case "/day17":
            case "/day18":
            case "/day19":
            case "/day20":
            case "/day21":
            case "/day22":
            case "/day23":
            case "/day24":
            case "/day25":
            case "/day26":
            case "/day27":
            case "/day28":
            case "/day29":
            case "/day30":
            case "/day31":
                messageService.sendMessage(getChatId(update), SELECTION_OF_THE_HOUR,
                        inlineKeyboardSource.getKeyboardHour());
                break;
            case "/contact":
                messageService.sendMessage(getChatId(update), "Contact!", inlineKeyboardSource.getKeyboardMain());
                break;
            default:
                messageService.sendMessage(getChatId(update), "Do no!", inlineKeyboardSource.getKeyboardMain(), replayKeyboardService.getReplayKeyboardMain());
                break;
        }
    }

    private int countDay(int month) {
        GregorianCalendar calendar = new GregorianCalendar(Calendar.getInstance().get(Calendar.YEAR),
                month, Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
}
