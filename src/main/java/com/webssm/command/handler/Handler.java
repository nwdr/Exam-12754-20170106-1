package com.webssm.command.handler;

public interface Handler<T> {
    void handle(T command);

    String getCmdName();

    String getDescription();
}
