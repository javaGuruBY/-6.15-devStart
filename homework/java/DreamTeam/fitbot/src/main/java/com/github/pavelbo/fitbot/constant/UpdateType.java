package com.github.pavelbo.fitbot.constant;

import com.github.pavelbo.fitbot.service.CallbackProcessor;
import com.github.pavelbo.fitbot.service.ContactProcessor;
import com.github.pavelbo.fitbot.service.DefaultProcessor;
import com.github.pavelbo.fitbot.service.Processor;
import com.github.pavelbo.fitbot.service.TextProcessor;

public enum UpdateType {
    CALLBACK(new CallbackProcessor()),
    TEXT(new TextProcessor()),
    CONTACT(new ContactProcessor()),
    DEFAULT(new DefaultProcessor());

    private final Processor processor;

    UpdateType(Processor processor) {
        this.processor = processor;
    }

    public Processor getProcessor() {
        return this.processor;
    }
}
