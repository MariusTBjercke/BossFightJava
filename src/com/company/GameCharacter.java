package com.company;

public class GameCharacter {
    public String Name;
    public Integer Health;
    public String Strength;
    public Integer Stamina;
    public Integer MaxStamina;
    public boolean Alive;

    public GameCharacter(String name, Integer health, String strength, Integer stamina) {
        Name = name;
        Health = health;
        Strength = strength;
        Stamina = stamina;
        MaxStamina = stamina;
        Alive = true;
    }

    public void Fight(GameCharacter player2) {
        if (Stamina == 0) {
            Recharge();
        }

        TakeDamage(player2);

        Stamina -= 10;
        if (player2.Health > 0) {
            System.out.println(player2.Name + " har " + player2.Health + " HP igjen.");
        } else {
            player2.Alive = false;
        }
    }

    public void TakeDamage(GameCharacter player2) {}

    public void Recharge() {
        Stamina = MaxStamina;
        System.out.println(Name + " har ikke nok stamina. Bruker 'Recharge'.");
        System.out.println(Colors.ANSI_GREEN_BACKGROUND + Name + " fikk tilbake " + MaxStamina + " stamina." + Colors.ANSI_RESET);
    }

}
