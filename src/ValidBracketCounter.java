import java.util.Stack;

public class ValidBracketCounter {

    public static void main(String[] args) {
        String[] sample = {"()", "()()()", "((()()", ")())))((", "))()(("};

        for (int i = 0; i<sample.length; i++) {
            System.out.println("[Prod] valid amount of bracket '" + sample[i] +"' is " + counter(sample[i]));
        }
        System.out.println("");
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
        int stackCounter = 0;
        int matchCounter = 0;
        char[] charArray = s.toCharArray();

        for (char ch : charArray) {
            if (ch == '(') {
                stackCounter++;
            } else if (ch == ')' && stackCounter > 0) {
                stackCounter--;
                matchCounter++;
            }
        }
        //return (s.length() - Math.abs(stackCounter)) / 2;
        return matchCounter;
    }
}
