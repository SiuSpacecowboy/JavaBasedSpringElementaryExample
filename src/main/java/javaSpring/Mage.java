package javaSpring;

public class Mage implements NewHero {

    @Override
    public String classType() {
        return "Mage";
    }

    @Override
    public String nickName() {
        return "Merlin";
    }
}
