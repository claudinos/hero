package models;

import java.util.ArrayList;


    import java.util.ArrayList;

    public class Hero {
        private String heroName;
        private int heroAge;
        private String heroPower;
        private String heroWeakness;

        private static ArrayList<Hero> instance = new ArrayList<Hero>();

        public Hero(String name, int age, String power, String weakness) {
            heroName = name;
            heroAge = age;
            heroPower = power;
            heroWeakness = weakness;
            instance.add(this);

        }

        public String getheroName() {
            return heroName;
        }

        public int getheroAge() {
            return heroAge;
        }

        public String getheroPower() {

            return heroPower;
        }

        public String getheroWeakness() {

            return heroWeakness;
        }

    }

