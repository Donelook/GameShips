package GameShips;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private ArrayList<Ship> ships;
    private String name;
    private int countOfShips;
    private BattleField battleFieldPlayer;

    public Player(){
        ships = new ArrayList<>();
        battleFieldPlayer = new BattleField();
    }

    public void setName(String name){
        this.name= name;
    }

    public BattleField getBattleFieldPlayer(){
        return battleFieldPlayer;
    }

    public void setName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your Name: ");
        name= scanner.nextLine();
    }

    public int getCountOfShips(){
        return countOfShips;
    }

    public boolean isThatShip(Cord cord){
        return ships.contains(new Ship(cord));
    }

    public boolean areShips(){
        if(ships.isEmpty()) return false;
        else return true;
    }

    public void addShip(Ship ship){
        ships.add(ship);
        countOfShips++;
    }

    public void shotTo(Player player) {
        Cord cord = new Cord();

        System.out.print("Where do you want to hit him? ");
        cord.setCord();
        System.out.println();

        if (player.isThatShip(cord)) {
            battleFieldPlayer.setBattleField(cord, FieldState.SUNK);
            player.removeShip(new Ship(cord));
            System.out.println(this.toString() + " Sunked " + player.toString());
        }
        else {
            battleFieldPlayer.setBattleField(cord, FieldState.OCCUPIED);
            System.out.print("Misshit\n");
        }
    }

    public void removeShip(Ship ship){ships.remove(ship);}

    @Override
    public String toString(){
        return name;
    }

    public static void main(String args[]){

    }
}
