public class JumpStatements {

    /*

    - Jump Statements-ები არის: Break, Continue, Return;

    -  Break გამოიყენება რომ შეაჩეროს loop, მაგრამ იგი მოქმედებს ჩადგმული ლუპების შემთხვევაში იმ სკოუპში სადაც ჩადგმულია
        და გავლენას არ ახდენს გარე ლუპებზე, როგორც switch-ში ჩასმული break იმოქმედებს უშუალოდ იმ ქეისზე სადაც იგია
        მოთავსებული და არ გამოიწვევს გარე ლუპის შეწყვეტას, ან პროგრამის გაჩერებას.

    - ზემოთ თქმული საპირისპიროც შეუძლია Break -ს, თუ გამოვიყენებთ მას როგორც GoTo. GoTo-დ  Break -ის გამოოყენება ხდება
      Labeled break-ის გამოყენებით. ეს არის მექანიზმი, რომელიც გაძლევს საშუალებას, გამოხვიდე არა ერთი, არამედ რამდენიმე
      block-იდან ერთდროულად. მისი მთავარი პრაქტიკული დანიშნულებაა nested loop-ების (ჩადგმული ციკლების) დროს: როდესაც
      შიდა loop-ში რაღაცას იპოვი და გინდა, რომ არა მხოლოდ შიდა, არამედ გარე loop-იც დაუყოვნებლივ შეჩერდეს.

    - return არის jump statement,რომლის ერთადერთი დანიშნულებაა method-ის (ჩვენს შემთხვევაში main method-ის)
      დაუყოვნებლივ შეწყვეტა და პროგრამის კონტროლის დაბრუნება იმისთვის, ვინც ეს method გამოიძახა
      (ანუ მის caller-ისთვის).

    - main method-ში return ბრძანების გამოყენება ნიშნავს "დაასრულე პროგრამა ახლავე და დაუბრუნდი
    კონტროლი run-time system-ს".

    - ქვემოთ ეს ხაზი: "if (t)return;" if-ის გარეშე კომპილაციის ერორს მოგვცემდა, რადგან return უპირობო დასრულებას ნიშნავს
      და მის შემდეგ არაფერი არ შესრულდეება, ხოლო როცა სადემონსტრაციოდ if დავუწერეთ, კომპილატორი ფიქრობს რომ return
      დამოკიდებულია if (t)-ზე, და დაშვებას აკეთებს რომ თუ if (t) = false, return აღარ შესრულდება.
         */
    public static void main(String[] args) {
        boolean t =true;
        System.out.println("before return");
        if (t)return;
        System.out.println("this won't  ");
    }



    public void labeledBreakGoTo() {
        boolean t = true;

        first: {
            second:{
                third:{
                    System.out.println("before the break!");
                    //ანუ აქ მთავარი თემა ისაა რომ ხელით ვუთითებ inner scope-ში  რომ მუშაობა დაასრულოოს გარე სქოოუფში;
                    if (t) break second;// break out of second block
                    System.out.println("this is won't execute!!");
                }
            }
            System.out.println("this text is after second block");
        }
    }

    /*
- break ნიშნავს: "სრულად შეწყვიტე ეს loop და გამიყვანე გარეთ."

- continue ნიშნავს: "შეწყვიტე მხოლოდ ეს ერთი iteration (რაუნდი), დააიგნორე ყველაფერი, რაც ჩემს შემდეგ წერია,
  და პირდაპირ გადადი შემდეგ iteration-ზე."

- როდესაც i = 0 (ლუწია):
    - if პირობა true-ა.
        - სრულდება continue.
           -  continue არ ხტება i < 10-ზე (პირობაზე).
               - ის ხტება iteration ნაწილზე: სრულდება i++. i ხდება 1.
                    - ამის შემდეგ სრულდება condition ნაწილი: i < 10 (1 < 10) true-ა.
                        - loop გრძელდება.  

- for loop-ში continue განსაკუთრებულად მუშაობს. ის არ ხტება პირდაპირ პირობის შემოწმებაზე (i < 10).
  ის ხტება iteration ნაწილზე (i++). ეს უზრუნველყოფს, რომ loop-ი არასდროს გაიჭედოს (არ გახდეს უსასრულო(infinite loop)).

- ამრიგად, for ციკლში continue გამოყენება უსაფრთხოა, ხოლო switch-ში კი შეიძლება infinite loop გამოიწვიოს.

-
     */

    public void continueJumpStatement(){

                for (int i = 0; i < 10; i++) {
                    System.out.print(i + " ");

                    if (i % 2 == 0) continue; //<-- მთავარი ლოგიკა(ანუ თუ ლუწია ტოვებს ქვედა პრინტს და გაადახტება i++ ზე)

                    System.out.println(""); // <-- ეს კოდი "გამოტოვებული" იქნება თუ ლუწია რიცხვი
                }
    }

}
