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

/*
- for-each for loop iterates until all elements in an array have
been examined, it is possible to terminate the loop early by using a break
statement.

- The break statement can also be used with Java’s other loops
*/
    public void forEachBreak (){
    int [] nums = {1,2,3,4,5,6,7,8,9,10};
    int sum = 0;

    for (int x : nums){
        System.out.println("number : " + x );
        sum+=x;
        if (x == 5)break;//now iteration will stop after fifth element.
    }
        System.out.println("sum is: " + sum);
    }
}
