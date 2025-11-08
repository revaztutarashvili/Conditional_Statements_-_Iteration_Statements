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


    /*
   - There is one important point, you can’t change the contents of the array by assigning the
iteration variable a new value.
   - for-each style loop  iteration variable is “read-only” as it relates to the underlying array
   - for-each არის read only პრიმიტიულ ცვლადებთან მიმართებით, თორემ იგივეს ვერ ვიტყვით როცა საქმე
   ობიექტებს ეხება ან მაგალითად String-ს.
     */

    public void forEachIsReadOnly(){
        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        for (int x : nums){ // აქ ცვლადი x წარმოადგენს მასივის ასლს და ამ ასლში ვცვლით მონაცემებს
            System.out.println(x + " ");
            x=x*10; //აქ მასივის ასლში ვაკეთებს მანიპულაციებს და ვცვლით ელემენტებს
            System.out.println("nums: " + x);
        }
        for (int x : nums){
            System.out.println(x+" ");//output იქნება ისევ 1 დან 10-ის ჩათვლით, ეს მოოწმობს რომ მასივის ელემენტეები ვერ შეცვალა
        }
    }

    /*
    -
    -
    -
    */
    /*
    -int [][] nums = new int[3][5] აქ ნიშნავს რომ "nums" არის მასივების მასივი, რაც იმას ნიშნავს რომ
    ჩვენ ვქმნით "მთავარ" array-ს, რომელსაც აქვს 3 ელემენტი int[3]. თავის მხრივ, ამ 3 ელემენტიდან თითოეული არის სხვა array,
    რომლის ზომაა 5 (int[5]). ანუ:
    nums[0] არის int[0, 0, 0, 0, 0] array
    nums[1] არის int[0, 0, 0, 0, 0] array
    nums[2] არის int[0, 0, 0, 0, 0] array
    -
    -
    */
    public void multiDimensionalArrayIterating (){
    int sum =0;
    int [][] nums = new int[3][5];
//give nums some value
    for (int i =0; i<3; i++)
       for (int j =0; j<5; j++)
           nums [i] [j] = (i+1)*(j+1);
//use for-each for to display and sum values
        for (int [] x : nums) {
            for (int y : x) {
                System.out.println("value is: " + y);
                sum +=y;
            }
            System.out.println();
        }
        System.out.println("Sum is : "+sum);
    }
}
