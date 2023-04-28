package org.example.Ex1.Factory;

import org.example.Ex1.Army.Army;
import org.example.Ex1.Army.HorseArmy;
import org.example.Ex1.ArmyType.MilitaryType;

public class HorseArmyFactory implements ArmyFactory{
    @Override
    public Army createArmy(MilitaryType militaryType) {
        return new HorseArmy(militaryType);
    }
}
