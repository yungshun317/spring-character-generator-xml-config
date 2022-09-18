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

    @Override
    public String getPersonality() {
        return "Generous " + personalityService.getPersonality();
    }

    @Override
    public int getAge() {
        return 25;
    }

    @Override
    public String getSocialClass() {
        return "Middle";
    }
}
