package com.github.pavelbo.fitbot.service;

import static com.github.pavelbo.fitbot.util.ChatIdExtractor.getChatId;

import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
public class DefaultProcessor extends BaseProcessor  implements Processor{

    public void process(Update update) {
        messageService.sendMessage(getChatId(update), "I dont updarstand");
    }
}
