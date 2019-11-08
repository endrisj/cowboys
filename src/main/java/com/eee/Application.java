package com.eee;

import static java.lang.String.format;

import com.eee.cowboysfight.Cowboy;
import com.eee.cowboysfight.CowboyFightSimulator;
import com.eee.cowboysfight.CowboyRepository;

public class Application {

    public static void main(String[] args) {
        Cowboy winner = CowboyFightSimulator.simulateFight(CowboyRepository.getAll());
        System.out.println(format("And the winner is: `%s`", winner.name));
    }
}


