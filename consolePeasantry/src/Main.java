import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "What is the best gaming device?";
        String choiceOne = "playstation";
        String choiceTwo = "pc";
        String choiceThree = "xbox";
        String choiceFour = "nintendo switch";

        String correctAnswer = choiceTwo;


        System.out.println(question);
        System.out.println("choose one of the following: " + choiceOne + ", " + choiceTwo +", " + choiceThree + ", or " + choiceFour +". ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if(correctAnswer.equals(input.toLowerCase())) {
            System.out.println("Just Master Race things");
        } else {
            System.out.println("Dirty Console Peasant");
        }



    }

}
