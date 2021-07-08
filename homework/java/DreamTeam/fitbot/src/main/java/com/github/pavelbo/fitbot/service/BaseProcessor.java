package com.github.pavelbo.fitbot.service;

import com.github.pavelbo.fitbot.keyboard.InlineKeyboardSource;
import com.github.pavelbo.fitbot.keyboard.ReplayKeyboardService;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseProcessor {
    @Autowired
    MessageService messageService;
    @Autowired
    InlineKeyboardSource inlineKeyboardSource;
    @Autowired
    ReplayKeyboardService replayKeyboardService;
}
