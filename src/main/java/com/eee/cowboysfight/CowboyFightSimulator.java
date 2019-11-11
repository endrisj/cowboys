package com.eee.cowboysfight;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CowboyFightSimulator {

    private static Random rand = new Random();

    public static Cowboy simulateFight(List<Cowboy> cowboys) {
        List<Thread> cowboysReadyToFight = cowboys.stream()
            .map(cowboy -> {
                return new Thread(() -> {
                    try {
                        while (cowboy.health >= 0 && cowboys.size() > 1) {
                            shoot(cowboy.name, cowboys, cowboy.damage);
                            Thread.sleep(1_000);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
            })
            .collect(Collectors.toList());

        cowboysReadyToFight.parallelStream()
            .forEach(Thread::run);

        int j = 0;
        while (cowboys.size() > 1 && j++ < 15) {
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return cowboys.get(0);
    }

    static void shoot(String shooterName, List<Cowboy> cowboys, int damage) {
        int index = rand.nextInt(cowboys.size());
        Cowboy shootTo = cowboys.get(index);
        synchronized (shootTo) {
            shootTo.health -= damage;
            if (shootTo.health <= 0) {
                cowboys.remove(index);
            }
        }
        System.out.println(String.format(
            "Cowboy `%s` makes damage `%s` to `%s` and health left `%s`.",
            shooterName,
            damage,
            shootTo.name,
            shootTo.health
        ));
    }
}
