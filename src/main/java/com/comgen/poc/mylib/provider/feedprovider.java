package com.comgen.poc.mylib.provider;

import com.comgen.poc.mylib.item.feedItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class feedprovider {

    public static List<feedItem> parse(String rssFeed) {
        List<feedItem> list = new ArrayList<>();
        Random r = new Random();
        // random number of item but at least 5
        Integer number = r.nextInt(10) + 5;
        for (int i = 0; i < number; i++) {
            // create sample data
            String s = String.valueOf(r.nextInt(1000));
            feedItem item = new feedItem("Summary " + s, "Description " + s);
            list.add(item);
        }
        return list;
    }
}
