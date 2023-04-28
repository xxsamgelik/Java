package org.example.Ex1.Army;

import org.example.Ex1.ArmyType.MilitaryType;

public class TankArmy implements Army{
    MilitaryType military;
    public TankArmy(MilitaryType militaryType){
        military = militaryType;
    }
    @Override
    public void Attack() {
        System.out.println("Tank army attacked");
    }
}