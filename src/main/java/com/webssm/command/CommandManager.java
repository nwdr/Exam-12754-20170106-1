package com.webssm.command;

import org.springframework.beans.factory.annotation.Autowired;

import com.webssm.command.handler.Handler;
import com.webssm.command.parser.CommandParser;

import java.util.Map;

public class CommandManager {
    private Map<String, Handler> commands;
    private CommandParser commandParser;

    public CommandManager setCommands(Map<String, Handler> commands) {
        this.commands = commands;
        return this;
    }

    @Autowired
    public CommandManager setCommandParser(CommandParser commandParser) {
        this.commandParser = commandParser;
        return this;
    }

    public void showMenu() {
        StringBuilder menu = new StringBuilder();
        menu.append("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n");
        for (String cmd : commands.keySet()){
            menu.append(String.format("\\\\command:%s     description:%s\\\\\n",cmd,commands.get(cmd).getDescription()));
        }
        menu.append("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n");
        System.out.println(menu);
    }

    public void handle(String cmd) {
        Command command = commandParser.parse(cmd);
        commands.get(command.getCmdName()).handle(command);
    }
}
