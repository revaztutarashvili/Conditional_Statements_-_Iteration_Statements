import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

       public void guessNumber () {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            int randomNumb = random.nextInt(100)+1;
            int attempt = 10;
            int attemptCount = 0;

            System.out.println("can you guess number from 1 to 100? you have 10 attempts");



            for (int i = 0; i < attempt; i++) {
                System.out.println("enter your guess: ");
                int answer;
                //ვჰენდლავ InputMismatchException-ს
                try {
                    answer = scanner.nextInt();
                }catch (InputMismatchException e){
                    System.out.println("please input number 1 - 100");
                    scanner.next();
                    i--;
                    continue;

                }

                //ჯერ ვაკეთებ ვალიდაციას რომ 100-ის დიაპაზონშია შემოტანილი რიცხვი
                if (answer < 1 || answer > 100){
                    System.out.println("please input number between 1 - 100");
                    i--; // ეს მცდელობა არ მსურს რომ ჩაითვალოს
                    continue;
                }

                attemptCount++;

                if (answer == randomNumb) {
                    System.out.println("Congrats, you guess number in "+ (attemptCount) + " attempts");
                    return;
                } else if (randomNumb < answer){
                    if (attemptCount==attempt){break;} // ამას იმისთვის ვაკეთებ რომ თუ რიცხვი ვერ გამოიცნეს აღარ დაიწეროს მე-10 მცდელობაზე რომ სცადეთ მაღალი ან დაბალი რიცხვი
                    System.out.println("try lower number");
                } else{
                    if (attemptCount==attempt){break;}
                    System.out.println("try higher number");
                }
                System.out.println("you left " + (attempt - attemptCount) + " attempts");
            }
           System.out.println("unfortunately you Lost game, guess number was: " + randomNumb);
           scanner.close();
       }

}