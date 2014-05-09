package decorator;

public class Main {
    public static void main(String[] args) {
        Skill skill = new Python(new PHP(new DefaultSkill()));
        
        System.out.println("Programming Languages: " + skill.getProgrammingLanguage());
        System.out.println("Years of experience: " + skill.getYearExperience());
    }
}
