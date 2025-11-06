import java.io.IOException;

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

    public void conditionalInfoMenu() throws IOException {
        char choise;
        do {
            System.out.println("Help on :");
            System.out.println("    1. if");
            System.out.println("    2. Switch");
            System.out.println("    3. While");
            System.out.println("    4. do-While");
            System.out.println("    5. for\n");
            System.out.println("choose one");
            choise = (char) System.in.read();
        } while (choise < '0' | choise > '5' );

        switch (choise){
            case '1':
                System.out.println("The if :\n");
                System.out.println("if (conditional) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("THe switch statement:\n");
                System.out.println("switch (expression) {");
                System.out.println("    case constraint:");
                System.out.println("        statement sequence");
                System.out.println("        brake;");
                System.out.println("      //...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("The while:\n");
                System.out.println("while (conditional) statement;)");
                break;
            case '4':
                System.out.println("The do-while:\n");
                System.out.println("do {");
                System.out.println("    statement");
                System.out.println("} while (condition);");
                break;
            case '5':
                System.out.println("The for\n");
                System.out.println("for (init, condition, iteration)");
                System.out.println(" statement;");

        }
    }
}
