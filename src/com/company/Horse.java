package com.company;

public class Horse extends Animal{
    public Horse(int weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "Horse{}" +
                "weight=" + getWeight() +
                " age=" + getAge()+
                " gender=" + getGender() + '\'' +
                " nickName=" + getNickName() + '\'' +
                '}';
    }
}
