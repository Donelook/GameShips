package GameShips;

public class Ship {
   private Cord cord;

    public Ship(Cord cord){
        this.cord = cord;
    }

    public Cord getCordShip() {
        return cord;
    }

    @Override
    public boolean equals(Object obj) {
        if(this.cord.equals(((Ship) obj).getCordShip())) return true;
        else return false;

    }
}
