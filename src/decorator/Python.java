package decorator;

public class Python extends Decorator {

    public Python(Skill newSkills) {
        super(newSkills);
        // TODO Auto-generated constructor stub
    }

    @Override
    public StringBuilder getProgrammingLanguage() {
        // TODO Auto-generated method stub
        return tempSkill.getProgrammingLanguage().append(",").append("Python");
    }

    @Override
    public int getYearExperience() {
        // TODO Auto-generated method stub
        return tempSkill.getYearExperience() + 3;
    }

}