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


    /*
-
-   for-each loop (for (int x : nums)) ყოველთვის მიჰყვება array-ს თანმიმდევრობით, ელემენტების გამოტოვების
    ან უკან დაბრუნების გარეშე.

-   Linear Search: რადგან array-ის ელემენტები დალაგებული არ არის ზრდადობით, ჩვენ არ გვაქვს სხვა გზა, გარდა იმისა, რომ
    შევამოწმოთ თითოეული ელემენტი სათითაოდ, პირველიდან დაწყებული. For-each კი სწორედ ამას აკეთებს.
    როგორც კი იპოვით იმას, რასაც ეძებდით, აღარ არის საჭირო array-ს ბოლომდე შემოწმება. ამიტომ ვიყენებთ break ოპერატორს,
    რომ loop დაუყოვნებლივ შევწყვიტოთ.

-   Binary Search: array დალაგებული (sorted) რომ ყოფილიყო, ჩვენ გამოვიყენებდით ბევრად უფრო სწრაფ binary search ალგორითმს.
    მაგრამ binary search მოითხოვს array-ს შუა ელემენტზე "გადახტომას", შემდეგ დარჩენილი ნახევრის შუა ელემენტზე და ა.შ.
    for-each loop-ს ამის გაკეთება არ შეუძლია, რადგან ის მხოლოდ თანმიმდევრობით მოძრაობს.
    ასეთ დროს კლასიკური for(int i ...) loop დაგვჭირდებოდა.
*/
    public void linearSearchByForEach(){
        int [] nums = {9,4,3,5,7,2,1,6,8};
        int val = 7;
        boolean found = false;

        for (int x : nums){
            if (x==val){
                System.out.println("value found! '" + x+"'");
                break;

            } System.out.println("value not found: " + x);
        }
    }


 /*
-  ლოკალური ცვლადის გამოცნობის ფუნქცია:

- შეგიძლიათ გამოიყენოთ var საკვანძო სიტყვა ცვლადის ტიპის (int, double და ა.შ.) ნაცვლად, და compiler-ი თავად "მიხვდება"
  (მოახდენს inference-ს), თუ რა type-ია საჭირო.

- compiler-ი ხედავს var-ს და ხვდება, რომ type-ი უნდა გამოიცნოს. ის აკვირდება ცვლადის initializer-ს (მნიშვნელობას,
  რომელსაც მას ანიჭებთ): = 2.5.  ის ხვდება რომ Double ტიპი უნდა დააბრუნოს.

- ტერმინი var არის Local Variable Type Inference-ის (ლოკალური ცვლადის ტიპის გამოცნობის) შემოკლება.

- var-ის მთავარი დატვირთვაა უთხრას compiler-ს: "შენ ხომ ხედავ, რას ვანიჭებ ამ ცვლადს? ხოდა, თავად მიხვდი, რა type-ია
  და მეორედ აღარ დამაწერინო." Compiler-ი აკვირდება გამოსახულებას მინიჭების (=) ნიშნის მარჯვნივ და ადგენს ცვლადის type-ს.

-სად არ შეიძლება var-ის გამოყენება?
1. არ შეიძლება Class-ის Field-ებისთვის (Instance Variables):
                                                              class MyClass {
                                                              private var name = "Test"; // <-- ERROR!
                                                              }
2. არ შეიძლება მეთოდის Parameter-ებისთვის:
                                             public void myMethod(var input) { // <-- ERROR!
                                             // ...
                                             }

3. არ შეიძლება მეთოდის Return Type-ისთვის:
                                           public var myMethod() { // <-- ERROR!
                                           return "Hello";
                                           }
4. აუცილებლად სჭირდება ინიციალიზაცია (მინიჭება) იმავე ხაზზე:
                                                            var name; // <-- ERROR!
                                                            name = "John";

5. არ შეიძლება null-ის მინიჭება:  var name = null; // <-- ERROR!
  */
    public void localVariableTypeInference (){

        // use function in "for-each" :
        int [] nums = {1,2,3,4,5};
        for (var x : nums)
            System.out.print( x + ", ");

        // use function for "for loop":
        System.out.println("values of x: ");
        for (var x = 2.5; x < 100; x= x*2)
            System.out.print(x + ", ");

    }
}
