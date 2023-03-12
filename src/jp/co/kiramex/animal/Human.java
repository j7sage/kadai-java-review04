package jp.co.kiramex.animal;

import jp.co.kiramex.animal.Thinkable;

public class Human extends Animal implements Thinkable{

    private String hobby;

    public Human() {

    }

    public Human(String humanName,int humanAge,String hobby) {
        super(humanName,humanAge);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public void think() {
        System.out.println("私は、" + hobby + "について考えています。");
    }
}

