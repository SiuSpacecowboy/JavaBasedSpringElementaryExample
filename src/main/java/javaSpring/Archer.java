package javaSpring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Archer implements NewHero {

    @Value("${archer.classType}")
    private String classType;
    @Value("${archer.nickname}")
    private String nickName;

    public Archer() {
    }

    @Override
    public String classType() {
        return classType;
    }

    @Override
    public String nickName() {
        return nickName;
    }

    public void setClassType(String name) {
        this.classType = name;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
