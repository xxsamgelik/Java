package org.example.Ex1.Factory;

import org.example.Ex1.Army.Army;
import org.example.Ex1.Army.TankArmy;
import org.example.Ex1.ArmyType.MilitaryType;

public class TankArmyFactory implements ArmyFactory{
    @Override
    public Army createArmy(MilitaryType militaryType) {
        return new TankArmy(militaryType);
    }
}
