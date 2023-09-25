package javaSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class DamageHere {

    private List<NewHero> heroes;

    @Autowired
    public DamageHere(List<NewHero> heroes) {
        this.heroes = heroes;
    }

    public void attack() {
        int numb = new Random().nextInt(2);
        NewHero hero = heroes.get(numb);
        System.out.println("Сейчас атакует: " + hero.classType() + "\n" + "С ником: " + hero.nickName());
    }
}
