import java.util.Stack;

public class ValidBracketCounter {

    /**
     [Prod] valid amount of bracket '()' is 1
     [Prod] valid amount of bracket '()()()' is 3
     [Prod] valid amount of bracket '((()()' is 2
     [Prod] valid amount of bracket '))((' is 0
     [Prod] valid amount of bracket '))()((' is 1

     [Beta] valid amount of bracket '()' is 1
     [Beta] valid amount of bracket '()()()' is 3
     [Beta] valid amount of bracket '((()()' is 2
     [Beta] valid amount of bracket '))((' is 2
     [Beta] valid amount of bracket '))()((' is 3
     */

    public static void main(String[] args) {
        String[] sample = {"()", "()()()", "((()()", "))((", "))()(("};

        for (int i = 0; i<sample.length; i++) {
            System.out.println("[Prod] valid amount of bracket '" + sample[i] +"' is " + counter(sample[i]));
        }


        for (int i = 0; i<sample.length; i++) {
            System.out.println("[Beta] valid amount of bracket '" + sample[i] +"' is " + counterBetaVersion(sample[i]));
        }

    }

    static int counter(String s) {
        int result = 0;
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char ch : charArray) {
            switch (ch) {
                case '(':
                    stack.push(ch);
                    break;
                case ')':
                    if (!stack.isEmpty()) {
                        stack.pop();
                        result++;
                    }
                default:
            }
        }
        return result;
    }

    static int counterBetaVersion(String s) {
        int result = 0;
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        int stackCounter = 0;

        for (char ch : charArray) {
            if (ch == '(') {
                stackCounter++;
            } else if (ch == ')') {
                stackCounter--;
            }
        }
        return result = (s.length() - Math.abs(stackCounter)) / 2;
    }
}
