public class Interface {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();
    }   
}
interface ChessPlayer   {
    //void moves();
}
class Queen implements ChessPlayer{
      public void moves(){
        System.out.println("up, right, left , right");
      }
}
