package decorator;

public class PHP extends Decorator{

    public PHP(Skill newSkills) {
        super(newSkills);
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public StringBuilder getProgrammingLanguage() {
        // TODO Auto-generated method stub
        return super.getProgrammingLanguage().append(",").append("PHP");
    }
    
    @Override
    public int getYearExperience() {
        // TODO Auto-generated method stub
        return super.getYearExperience() + 2;
    }

}
