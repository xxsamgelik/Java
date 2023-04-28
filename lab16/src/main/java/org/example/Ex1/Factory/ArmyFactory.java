package org.example.Ex1.Factory;

import org.example.Ex1.Army.Army;
import org.example.Ex1.ArmyType.MilitaryType;

public interface ArmyFactory {
    Army createArmy(MilitaryType militaryType);
}
