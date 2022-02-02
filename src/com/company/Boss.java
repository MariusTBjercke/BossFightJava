package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class Boss extends GameCharacter {

    public Boss() {
        super("Boss", 400, "0-30", 10);
    }

    public void TakeDamage(@NotNull GameCharacter hero) {
        var random = new Random();
        var strengthParts = Strength.split("-");
        var min = Integer.parseInt(strengthParts[0]);
        var max = Integer.parseInt(strengthParts[1]);
        var finalStrength = random.nextInt(min, max);
        hero.Health -= finalStrength;
        System.out.println(Colors.ANSI_RED_BACKGROUND + Name + " tok " + finalStrength + " skade fra " + hero.Name + "." + Colors.ANSI_RESET);
    }

}
