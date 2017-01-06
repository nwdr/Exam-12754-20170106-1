package com.webssm.command;

import java.util.Map;

public abstract class Command{
    protected String cmdName;
    protected Map<String, String> args;

    public abstract String getCmdName();

    public Map<String, String> getArgs() {
        return args;
    }

    public Command setArgs(Map<String, String> args) {
        this.args = args;
        return this;
    }
}
