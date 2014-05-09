package visitor;

public interface Visitor {

    public void visit(MlbSport mlbSport);

    public void visit(NbaSport nbaSport);

    public void visit(NflSport nflSport);
}
