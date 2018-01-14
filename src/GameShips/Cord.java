package GameShips;



import java.util.Scanner;

public class Cord {
   private int x,y;

   Cord(int x, int y){
       this.x = x;
       this.y = y;
   }

   Cord(){
       this.x = 0;
       this.y = 0;
   }

    public int getX() {
        return x;
    }

     public int getY() {
        return y;
    }

    public void setCord(int x ,int y){
       this.x = x;
       this.y = y;
    }

    public void setCord(){
        Scanner scanner = new Scanner(System.in);
        setCord(scanner.nextInt(),scanner.nextInt());

    }
    public boolean areInTheRange(int min, int max){
        if( this.x < min || this.x > max || this.y < min || this.y > max)
            return true;
        else
            return false;
    }
   @Override
    public String toString() {
        return "x :" + x + " y :" +y;
    }
   public boolean equals(Cord obj) {
       if(this.x == obj.getX() && this.y == obj.getY())return true;
       else return false;

    }

}
