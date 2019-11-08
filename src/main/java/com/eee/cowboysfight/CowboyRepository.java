package com.eee.cowboysfight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CowboyRepository {

    /*
[
    {
      "name": "John",
      "health": 10,
      "damage": 1
    },
    {
      "name": "Bill",
      "health": 8,
      "damage": 2
    },
    {
      "name": "Sam",
      "health": 10,
      "damage": 1
    },
    {
      "name": "Peter",
      "health": 5,
      "damage": 3
    },
    {
      "name": "Philip",
      "health": 15,
      "damage": 1
    }
]
 */

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
