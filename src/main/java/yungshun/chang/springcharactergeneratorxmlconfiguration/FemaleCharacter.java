package yungshun.chang.springcharactergeneratorxmlconfiguration;

public class FemaleCharacter implements CharacterGenerator {

    // Define a private field for the dependency
    private PersonalityService personalityService;

    // Define a constructor for dependency injection
    public FemaleCharacter(PersonalityService thePersonalityService) {
        personalityService = thePersonalityService;
    }

    @Override
    public String getName() {
        return "Helen Nolan";
    }

    @Override
    public String getPersonality() {
        return "Considerate";
    }
}
