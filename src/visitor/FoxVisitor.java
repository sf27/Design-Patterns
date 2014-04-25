package visitor;

public class FoxVisitor implements Visitor {

    @Override
    public void visit(MlbSport mlbSport) {

        System.out.println("MLB games in Fox");
        System.out.println(mlbSport.getTeams().subList(2, mlbSport.getTeams().size()));

    }

    @Override
    public void visit(NbaSport nbaSport) {
        System.out.println("NBA games in Fox");
        System.out.println(nbaSport.getTeams().subList(2, nbaSport.getTeams().size()));

    }

    @Override
    public void visit(NflSport nflSport) {
        System.out.println("NFL games in Fox");
        System.out.println(nflSport.getTeams().subList(2, nflSport.getTeams().size()));

    }

}
