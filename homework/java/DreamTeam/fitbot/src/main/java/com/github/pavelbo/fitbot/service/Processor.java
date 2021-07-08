package com.github.pavelbo.fitbot.service;

import org.telegram.telegrambots.meta.api.objects.Update;

public interface Processor {
    void process(Update update);
}
