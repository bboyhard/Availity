import java.util.*;

public class validate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter a string for validation: ");
        String validString = sc.nextLine();              //reads string
        System.out.println("You have entered: " + validString);

        boolean valid = false;
        Stack<String> testStack = new Stack<>();

        String testParentheses;
        for (char charValue: validString.toCharArray()) {
            if(charValue == '(') {
                testStack.push(String.valueOf(charValue));
                valid = false;
            } else if (charValue == ')') {
                if (testStack.isEmpty())
                    valid = false;
                else {
                    testParentheses = testStack.pop();
                    valid = testParentheses.contentEquals("(");
                }
            }
        }

        System.out.println("String \"" + validString +"\" is valid? = "+valid);

    }
}

