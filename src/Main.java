import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.setProperty("console.encoding", "UTF-8");
        String filePath= "fortune.txt";

        String purple = "\u001B[35m";
        String reset = "\u001B[0m";
        String ball = "\uD83D\uDD2E";
        String star = "✨";

        FortuneTeller Fortune=new FortuneTeller();
        Fortune.initialize(filePath);

        Scanner input=new Scanner(System.in);

        System.out.println(ball + " Welcome to My Fortune Telling " + ball);
        System.out.println(star + " Ask me anything, or type '" + purple + "exit" + reset + "' to leave " + star);

        while(true) {
            System.out.print("> ");
            String question=input.nextLine().trim();
            if(question.equalsIgnoreCase("exit")) break;
            System.out.println(Fortune.chooseFortune());
        }
        System.out.println("Farewell, mortal. Until our paths cross again...");
    }
}