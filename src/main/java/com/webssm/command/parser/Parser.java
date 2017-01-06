package com.webssm.command.parser;

import com.webssm.command.Command;

public interface Parser {
    Command parse(String[] cmd);
    boolean hasOption(String option);
}
