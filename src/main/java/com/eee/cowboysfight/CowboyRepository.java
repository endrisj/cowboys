package com.eee.cowboysfight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CowboyRepository {

    public static List<Cowboy> getAll() {
        List<Cowboy> cowboys = Collections.synchronizedList(new ArrayList<Cowboy>());
        cowboys.add(new Cowboy("John", 10, 1));
        cowboys.add(new Cowboy("Bill", 8, 2));
        cowboys.add(new Cowboy("Sam", 10, 1));
        cowboys.add(new Cowboy("Peter", 5, 3));
        cowboys.add(new Cowboy("Philip", 15, 1));
        return cowboys;
    }
}
