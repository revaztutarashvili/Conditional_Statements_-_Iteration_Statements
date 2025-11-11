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
}
