package GameShips;

public enum FieldState {
    CLEAR(0), OCCUPIED(-1), SUNK(1);
    private int state;

    private FieldState(int state) {
        this.state = state;
    }

    FieldState(){
        this.state = 0;
    }

    public char getChar() {
        switch (state) {
            case 0:
                return '~';

            case -1:
                return 'O';

            case 1:
                return 'X';

            default:
                System.out.println("nothing gone give u up");
                break;
        }
        return 'E';
    }

}