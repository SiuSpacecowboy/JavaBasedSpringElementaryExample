package javaSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        DamageHere damage = context.getBean("damageHere", DamageHere.class);
        damage.attack();
        Archer archer1 = context.getBean("archer", Archer.class);
        Archer archer2 = context.getBean("archer", Archer.class);
        archer1.setClassType("KKKKK");
        System.out.println(archer1.classType());
        System.out.println(archer2.classType());
    }
}
