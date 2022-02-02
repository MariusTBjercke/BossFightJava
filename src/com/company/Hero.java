package com.company;

import org.jetbrains.annotations.NotNull;

public class Hero extends GameCharacter {

    public Hero() {
        super("Hero", 100, "20", 40);
    }

    public void TakeDamage(@NotNull GameCharacter boss) {
        boss.Health -= Integer.parseInt(Strength);
        System.out.println(Colors.ANSI_RED_BACKGROUND + Name + " tok " + Strength + " skade fra " + boss.Name + "." + Colors.ANSI_RESET);
    }

}
