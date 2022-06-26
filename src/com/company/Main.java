package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       /* City деген класс тузунуз. (code, name, ...)
        Эгерде code так сан болсо TreeSetke салыныз.
                Аларды чонунан кичинесине караган тартипте чыгарыныз.*/

        Set<City> city =new HashSet<>();
        city.add(new City(1,"Bishkek"));
        city.add(new City(2,"Batken"));
        city.add(new City(3,"Jalal-Abad"));
        city.add(new City(4,"Karakol"));
        city.add(new City(5,"Naryn"));
        city.add(new City(6,"Osh"));
        city.add(new City(7,"Talas"));

        Set<City> treeSetTak = new TreeSet<>(city);

        for (City city1 : treeSetTak) {
            if (city1.getCode() % 2 != 0) {
                treeSetTak.add(city1);
                System.out.println(city1);
            }
        }












    }


}
