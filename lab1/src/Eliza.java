import java.util.Scanner;

/* super simple chat bot.*/
public class Eliza {

    public static String getResponse(String input) {
        String response;

        if (input.equalsIgnoreCase("pizza") || input.equalsIgnoreCase("chocolate")
                || input.equalsIgnoreCase("cake")) {
            response = "I love " + input + "!";
        } else if (input.equalsIgnoreCase("joke")) {
            response = "I don't know why I love bad puns so much. It's just how eye roll";
        } else if (input.contains("I am")) {
            int index = input.indexOf("I am");
            response = "Why are you " + input.substring(index + 5) + "?";
        } else if (input.equalsIgnoreCase("goodbye")) {
            response = "Goodbye!";
        } else {
            response = "I don't know about that.";
        }

        return response;
    }

    public static void main(String[] args) {
        String str, response;
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name?");
        str = scanner.nextLine();
        System.out.println("Nice to meet you, " + str);
        // loop here
        while (!str.equalsIgnoreCase("goodbye")) {
            System.out.print("What would you like to talk about?");
            str = scanner.nextLine();
            response = Eliza.getResponse(str);
            System.out.println(response);
        }
    }

}
