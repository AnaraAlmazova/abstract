package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Cow cow1=new Cow(17,4,"Pet","My");
        Cow cow2=new Cow(19,5,"Pet","Mo");
        Cow cow3=new Cow(23,6,"Tep","Mai");
        Cow cow4=new Cow(22,7,"Tep","Mo");
        Cow cow5=new Cow(21,8,"Pet","Mu");
        Cow cow6=new Cow(24,9,"Pet","Momo");


        Sheep sheep1=new Sheep(10,2,"Ram","Ma");
        Sheep sheep2=new Sheep(12,3,"Ram","Ba");
        Sheep sheep3=new Sheep(13,4,"Ram","Maa");
        Sheep sheep4=new Sheep(15,5,"Ram","Baa");

        Horse horse1=new Horse(27,3,"horses","Boru");
        Horse horse2=new Horse(34,5,"horses","Taitoru");
        Horse horse3=new Horse(45,6,"horses","Akjal");


        Farm farm=new Farm("Jailoo",new Cow[]{cow1,cow2,cow3,cow4,cow5,cow6},
                new Horse[]{horse1,horse2,horse3},
                new Sheep[]{sheep1,sheep2,sheep3,sheep4},"Jack");


        Farm farm1=new Farm("Jailoo",new Cow[]{cow1,cow2,cow3,cow4,cow5},
                new Horse[]{horse1,horse2},new Sheep[]{sheep1,sheep2,sheep3},"Jack");
        Farm farm2=new Farm("Jailoo",new Cow[]{cow6},new Horse[]{horse3},new Sheep[]{sheep4},"Jack");

        


        System.out.println(farm1);
        System.out.println(farm2);



    }
}
