package visitor;

import java.util.ArrayList;

public class NflSport implements VisitableSport {

    private ArrayList<String> teams = new ArrayList<>();

    public NflSport() {
        teams.add("Bears");
        teams.add("Ravens");
        teams.add("Lions");
        teams.add("Vikings");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }

    public ArrayList<String> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<String> teams) {
        this.teams = teams;
    }

}
