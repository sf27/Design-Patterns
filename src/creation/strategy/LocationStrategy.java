package strategy;

public interface LocationStrategy {
    String Location();

}

class LocationMaracaibo implements LocationStrategy {

    @Override
    public String Location() {
        // TODO Auto-generated method stub
        return "I am at Maracaibo";
    }

}


class LocationMiami implements LocationStrategy {

    @Override
    public String Location() {
        // TODO Auto-generated method stub
        return "I am at Miami";
    }

}