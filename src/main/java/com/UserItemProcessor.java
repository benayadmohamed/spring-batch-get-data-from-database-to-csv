package com;

import org.springframework.batch.item.ItemProcessor;

public class UserItemProcessor implements ItemProcessor<User, User> {
    @Override
    public User process(User item) throws Exception {
        System.out.println("item = [" + item + "]");
        return item;
    }
}
