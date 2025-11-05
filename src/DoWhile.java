public class DoWhile {
    int n = 10;

    public void doWhileHNY(){
       try {
           do {
               System.out.println("Tick: " + n);
               Thread.sleep(1000);
           } while (--n >0);
           System.out.println("Happy new year!!!");
       }catch (InterruptedException e) {
           System.out.println(e.getMessage());
       }

    }
}
