package GameShips;

public class FieldsDrawing {
    private Cord cord;

    FieldsDrawing(){ cord = new Cord();
    }

    public void drawBoard(BattleField battleField){
        System.out.print("  0 1 2 3 4 5 6 7\n");

        for(int i = 0; i<8; i++){

            System.out.print(i+" ");
            for(int j = 0; j<8; j++){

                cord.setCord(i, j);
                System.out.print(battleField.getBattleField(cord).getChar()+" ");

            }
            System.out.println();

        }
    }

}
