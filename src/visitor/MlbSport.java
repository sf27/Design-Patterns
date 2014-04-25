package visitor;

import java.util.ArrayList;

public class MlbSport implements VisitableSport {

    private ArrayList<String> teams = new ArrayList<>();

    public MlbSport() {
        teams.add("Atlanta");
        teams.add("Red Sox");
        teams.add("Yankees");
        teams.add("Orioles");
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
