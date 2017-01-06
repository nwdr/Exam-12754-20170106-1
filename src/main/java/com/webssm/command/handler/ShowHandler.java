package com.webssm.command.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.webssm.command.ShowCommand;
import com.webssm.command.handler.Handler;
import com.webssm.command.parser.ShowParser;
import com.webssm.entities.Customer;
import com.webssm.service.CustomerService;
import com.webssm.service.FilmService;

import java.util.Map;

@Component
public class ShowHandler implements Handler<ShowCommand> {
    public static String cmdName = "show";
    public static String description = "查询用户";
    @Autowired
    private CustomerService customerService;

    @Autowired
    private FilmService filmService;
    
    @Override
    public void handle(ShowCommand command) {
        Map<String,String> args = command.getArgs();
        Customer customer = new Customer();
        customer.setFirst_name(args.get(ShowParser.F));
        customer.setLast_name(args.get(ShowParser.L));
//        System.out.println(userService.query(user));
    }

    @Override
    public String getCmdName() {
        return cmdName;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
