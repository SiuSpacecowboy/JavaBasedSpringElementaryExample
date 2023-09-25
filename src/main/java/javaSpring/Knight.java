package javaSpring;

import org.springframework.stereotype.Component;

public class Knight implements NewHero {

    @Override
    public String classType() {
        return "Knight";
    }

    @Override
    public String nickName() {
        return "Nagibator";
    }
}
