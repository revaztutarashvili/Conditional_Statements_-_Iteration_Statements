public class Main {
    public static void main(String[] args) {
        //---------
//        GuessNumberGame guessNumberGame = new GuessNumberGame();
//        guessNumberGame.guessNumber();
//      //--------
//        SeasonByMonth seasonByMonth = new SeasonByMonth();
//        seasonByMonth.monthOfSeason();
        //--------
//          SampleSwitch sampleSwitch = new SampleSwitch();
//          sampleSwitch.switchSampleMethod();
        //--------
        WhileDemonstrate whileDemonstrate = new WhileDemonstrate();
        whileDemonstrate.happyNewYear();
        whileDemonstrate.midPointfinder();
        //--------

        String weather = "sunny";
        forOddNumbersPrinter (0, 5);
        forEvenNumbersPrinter(0, 5);
        whileOddNumbersPrinter(0,5);
        whileEvenNumbersPrinter(0,5);



        if (weather == "sunny") {
            System.out.println("go to walk");

        } else if (weather == "rainy") {
            System.out.println("play bording games");

        } else if (weather == "cloudy") {
            System.out.println("go for fishing");

        } else System.out.println("stay at home");


        switch (weather) {
            case "sunny":
                System.out.println("go to walk");
                break;
            case "rainy":
                System.out.println("play boardgames");
                break;
            case "cloudy":
                System.out.println("go for fishing");
                break;
            default:
                System.out.println("stay at home");
                break;

        }
    }
     static void forOddNumbersPrinter(int start, int end){

        for (int i =start;  i <= end;i++ ){

            if (i %2==0){
                System.out.println(i);
            }
        }
     }

     static void forEvenNumbersPrinter(int start, int end){
        for (int i = start; i <= end; i++){
            if (i%2==1){
                System.out.println(i);
            }
        }
     }

     static void whileOddNumbersPrinter(int start, int end){
        int i = start;
        while (i <= end){
            if (i%2==1){
            System.out.println("while: "+i);
            }
            i++;
        }
     }




     static void whileEvenNumbersPrinter (int start, int end){
       int i = start;
       while (i <= end){
           if (i%2==0){
               System.out.println("while: " + i);
           }
           i++;
       }
     }







}