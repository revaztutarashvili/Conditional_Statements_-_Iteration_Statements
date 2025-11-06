public class ForEachLoop {

    public void simpleForEAchExample(){

        int [] num = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        for (int x :num){
            System.out.println("number: " + x);
            sum +=x;
        }
        System.out.println("sum is: " + sum);
    }
}
