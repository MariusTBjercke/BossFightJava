package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        var random = new Random();
        int first = random.nextInt(0, 2);

        var hero = new Hero();
        var boss = new Boss();

        // Choose random positions and fight
        while (hero.Health > 0 && boss.Health > 0)
        {
            if (first == 1) {
                hero.Fight(boss);
                boss.Fight(hero);
            } else {
                boss.Fight(hero);
                hero.Fight(boss);
            }
        }

        WinnerCheck(hero, boss);
    }

    private static void WinnerCheck(Hero hero, Boss boss) {
        if (!hero.Alive) {
            System.out.println(boss.Name + " vant!");
            System.out.println(hero.Name + " tapte :(");
        } else {
            System.out.println(hero.Name + " vant!");
            System.out.println(boss.Name + " tapte :(");
        }
    }

}
