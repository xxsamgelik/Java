package org.example.Ex1.Factory;

import org.example.Ex1.Army.Army;
import org.example.Ex1.Army.FootArmy;
import org.example.Ex1.ArmyType.MilitaryType;
import org.example.Ex1.Factory.ArmyFactory;

public class FootArmyFactory implements ArmyFactory {
    @Override
    public Army createArmy(MilitaryType militaryType) {
        return new FootArmy(militaryType);
    }
}
