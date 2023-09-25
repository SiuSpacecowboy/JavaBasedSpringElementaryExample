package javaSpring;

import org.springframework.context.annotation.*;

import java.util.List;

@Configuration
@ComponentScan("javaSpring")
@PropertySource("classpath:info.properties")
public class SpringConfig {

    @Bean
    public Knight knight() {
        return new Knight();
    }

    @Bean
    public Mage mage() {
        return new Mage();
    }

   @Bean
   @Scope("prototype")
   public Archer archer() {
        return new Archer();
    }

    @Bean
    public List<NewHero> heroes() {
        return List.of(knight(), mage(), archer());
    }

/*    @Bean DamageHero damageHero() {
        return new DamageHero(heroes());
    }*/

}
