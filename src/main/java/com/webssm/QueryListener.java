package com.webssm;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.webssm.event.QueryEvent;

@Component
public class QueryListener implements ApplicationListener<QueryEvent> {
    @Override
    public void onApplicationEvent(QueryEvent event) {
        System.out.println(event.getMessage());
    }
}
