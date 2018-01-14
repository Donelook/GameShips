package GameShips;

import java.util.Scanner;

public class BattleField {
    private final FieldState[][] battleArray;

    BattleField() {
        battleArray = new FieldState[8][8];
        this.setClearFields();
    }

    public void setClearFields() {
        for( int i = 0; i<8; i++){
            for(int j = 0; j<8; j++){
               battleArray[i][j] = FieldState.CLEAR;
            }
        }



    }

    public void setBattleField(Cord cord, FieldState state) {
        battleArray[cord.getX()][cord.getY()] = state;

    }

    public FieldState getBattleField(Cord cord) {

        return battleArray[cord.getX()][cord.getY()];
    }



    public static void main(String[] args) {



    }
}
