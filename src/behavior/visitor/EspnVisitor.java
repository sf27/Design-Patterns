package visitor;

public class EspnVisitor implements Visitor {

    @Override
    public void visit(MlbSport mlbSport) {

        System.out.println("MLB games in ESPN");
        System.out.println(mlbSport.getTeams());

    }

    @Override
    public void visit(NbaSport nbaSport) {
        System.out.println("NBA games in ESPN");
        System.out.println(nbaSport.getTeams());

    }

    @Override
    public void visit(NflSport nflSport) {
        System.out.println("NFL games in ESPN");
        System.out.println(nflSport.getTeams());

    }

}
