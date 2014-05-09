package decorator;

public class DefaultSkill implements Skill {

    /**
     * Every programmer made will start with a DefaultSkills
     */

    @Override
    public StringBuilder getProgrammingLanguage() {
        // TODO Auto-generated method stub
        return new StringBuilder("Java");
    }

    @Override
    public int getYearExperience() {
        // TODO Auto-generated method stub
        return 1;
    }

}
