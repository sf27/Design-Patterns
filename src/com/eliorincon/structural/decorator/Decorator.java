package decorator;

abstract class Decorator implements Skill {

    protected Skill tempSkill;

    public Decorator(Skill newSkills) {
        tempSkill = newSkills;
    }

    @Override
    public StringBuilder getProgrammingLanguage() {
        // TODO Auto-generated method stub
        return tempSkill.getProgrammingLanguage();
    }

    @Override
    public int getYearExperience() {
        // TODO Auto-generated method stub
        return tempSkill.getYearExperience();
    }
}
