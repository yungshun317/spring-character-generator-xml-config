package yungshun.chang.springcharactergeneratorxmlconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCharacterGeneratorXmlConfigurationApplication {

    public static void main(String[] args) {

        // [1] Load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // [2] Create the object (Inversion of Control)
        // CharacterGenerator maleCharacter = new MaleCharacter();
        // [3] Use the object
        // System.out.println(maleCharacter.getName());

        // [4] Retrieve bean from Spring container (Inversion of Control)
        CharacterGenerator newCharacter = context.getBean("newCharacter", CharacterGenerator.class);

        // [5] Call methods on the bean
        System.out.println(newCharacter.getName());

        // [6] Close the context
        context.close();
    }

}
