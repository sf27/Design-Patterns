package visitor;

import java.util.ArrayList;

public class NbaSport implements VisitableSport {

    private ArrayList<String> teams = new ArrayList<>();

    public NbaSport() {
        teams.add("Raptors");
        teams.add("Nets");
        teams.add("Cavaliers");
        teams.add("Lakers");
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
