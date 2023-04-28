package org.example.Ex1.Army;

import org.example.Ex1.ArmyType.MilitaryType;

public class FootArmy implements Army {
    MilitaryType military;
    public FootArmy(MilitaryType militaryType){
        military = militaryType;
    }
    @Override
    public void Attack() {
        System.out.println("Foot army attacked");
    }
}
