package yungshun.chang.springcharactergeneratorxmlconfig;

public class FemaleCharacter implements CharacterGenerator {

    // Define a private field for the dependency
    private PersonalityService personalityService;

    /* Define a constructor for dependency injection
    public FemaleCharacter(PersonalityService thePersonalityService) {
        personalityService = thePersonalityService;
    }
    */

    // Add new fields for age and socialClass
    private int age;
    private String socialClass;

    public FemaleCharacter() {
        System.out.println("FemaleCharacter: inside no-arg constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("FemaleCharacter: inside setter method - setAge");
        this.age = age;
    }

    public String getSocialClass() {
        return socialClass;
    }

    public void setSocialClass(String socialClass) {
        System.out.println("FemaleCharacter: inside setter method - setSocialClass");
        this.socialClass = socialClass;
    }

    @Override
    public String getName() {
        return "Helen Nolan";
    }

    // Setter method
    public void setPersonalityService(PersonalityService personalityService) {
        System.out.println("FemaleCharacter: inside setter method - setPersonalityService");
        this.personalityService = personalityService;
    }

    @Override
    public String getPersonality() {
        return personalityService.getPersonality();
    }
}
