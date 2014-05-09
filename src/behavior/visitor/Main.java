package visitor;

public class Main {

    public static void main(String[] args) {

        EspnVisitor visitor = new EspnVisitor();

        MlbSport mlbSportEspn = new MlbSport();

        NflSport nflSportEspn = new NflSport();

        NbaSport nbaSportEspn = new NbaSport();

        visitor.visit(mlbSportEspn);

        visitor.visit(nbaSportEspn);

        visitor.visit(nflSportEspn);

        // //////////////////////////////////////////////////////////////////////

        FoxVisitor foxVisitor = new FoxVisitor();

        MlbSport mlbSportFox = new MlbSport();

        NflSport nflSportFox = new NflSport();

        NbaSport nbaSportFox = new NbaSport();

        foxVisitor.visit(mlbSportFox);

        foxVisitor.visit(nbaSportFox);

        foxVisitor.visit(nflSportFox);

    }

}
