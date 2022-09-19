package yungshun.chang.springcharactergeneratorxmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCharacterGeneratorXmlConfigApplication {

    public static void main(String[] args) {

        // [1] Load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // [2] Create the object
        // CharacterGenerator maleCharacter = new MaleCharacter();
        // [3] Use the object
        // System.out.println(maleCharacter.getName());

        // [4] Retrieve bean from Spring IoC container
        CharacterGenerator newCharacter = context.getBean("newFemaleCharacter", CharacterGenerator.class);

        // [5] Call methods on the bean
        System.out.println(newCharacter.getName());

        // [7] Call new method for ages
        System.out.println(newCharacter.getPersonality());

        // [8] Call new methods to get the literal values
        System.out.println(newCharacter.getAge());
        System.out.println(newCharacter.getSocialClass());

        // [6] Close the context
        context.close();
    }

}
