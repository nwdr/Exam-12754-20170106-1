package com.webssm.event;

import org.springframework.context.ApplicationEvent;

public class QueryEvent extends ApplicationEvent {
    private String message;

    public QueryEvent(Object source) {
        super(source);
    }

    public String getMessage() {
        return message;
    }

    public QueryEvent setMessage(String message) {
        this.message = message;
        return this;
    }
}
