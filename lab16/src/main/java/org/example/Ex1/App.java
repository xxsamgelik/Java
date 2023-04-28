package org.example.Ex1;

import org.example.Ex1.Army.Army;
import org.example.Ex1.ArmyType.Natives;
import org.example.Ex1.Factory.ArmyFactory;
import org.example.Ex1.Factory.FootArmyFactory;

public class App {
        static Army army;
        public static void main(String[] args){
            ArmyFactory factory = new FootArmyFactory();

            army = factory.createArmy(new Natives());
        }
}
