package GameShips;

import java.util.Scanner;

public class Game {

    private Player playerOne;
    private Player playerTwo;
    private BattleField battleFieldPlayerOne;
    private BattleField battleFieldPlayerTwo;
    private FieldsDrawing fieldsDrawing;
    private BattleField GAMEFIELD;

    Game(){
        this.battleFieldPlayerOne = new BattleField();
        this.battleFieldPlayerTwo = new BattleField();
        this.GAMEFIELD = new BattleField();
        this.fieldsDrawing = new FieldsDrawing();
        this.playerOne = new Player();
        this.playerTwo = new Player();
    }

    public void runGame(){

        playerOne.setName();
        this.setShips(this.playerOne);
        playerTwo.setName();
        this.setShips(this.playerTwo);

        while(playerOne.areShips() && playerTwo.areShips()){
            playerOne.shotTo(playerTwo);
            fieldsDrawing.drawBoard(playerOne.getBattleFieldPlayer());
            playerTwo.shotTo(playerOne);
            fieldsDrawing.drawBoard(playerTwo.getBattleFieldPlayer());
    }

        fieldsDrawing.drawBoard(battleFieldPlayerOne);
        System.out.format("Player %s won", whoWin());
    }

    public void setShips(Player player){
       Scanner scanner = new Scanner(System.in);

       while(player.getCountOfShips() < 8){

           Cord cordShip = new Cord();
            System.out.format("Player %s, Where will be your ship?(%d)",player.toString(), 1 + player.getCountOfShips());

            cordShip.setCord(scanner.nextInt(), scanner.nextInt());
            System.out.println(cordShip.toString());

            if(player.isThatShip(cordShip) || cordShip.areInTheRange(0, 7)) continue;
            else {
                player.addShip(new Ship(cordShip));
            }
        }
    }

    public String whoWin(){
        if(playerOne.areShips()) return playerOne.toString();
        else return playerTwo.toString();
    }
    public static void main(String args[]){
    Game game = new Game();
    game.runGame();
    }
}
