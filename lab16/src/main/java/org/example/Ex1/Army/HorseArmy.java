package org.example.Ex1.Army;

import org.example.Ex1.ArmyType.MilitaryType;

public class HorseArmy implements Army{
    MilitaryType military;
    public HorseArmy(MilitaryType militaryType){
        military = militaryType;
    }
    @Override
    public void Attack() {
        System.out.println("Horse army attacked");
    }
}
