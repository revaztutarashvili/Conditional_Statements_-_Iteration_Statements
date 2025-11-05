public class WhileDemonstrate {
    int n = 10;
    public void happyNewYear(){
        while (n>0){
            System.out.println("Tick "+n);
            --n;
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("happy new year!");
    }


    public void midPointfinder(){
        int i, x;
        i = 100;
        x = 200;

        while (++i < --x){
            //no body while example;
            //ტესტი 2
        }
        System.out.println("midpoint is: " + i);
    }
}
