package yungshun.chang.springcharactergeneratorxmlconfiguration;

public class MaleCharacter implements CharacterGenerator {

    private PersonalityService personalityService;

    public MaleCharacter() {}

    public MaleCharacter(PersonalityService personalityService) {
        this.personalityService = personalityService;
    }

    @Override
    public String getName() {
        return "John Doe";
    }

    public String getPersonality() {
        return "Generous " + personalityService.getPersonality();
    }
}
