
# Valid Bracket Counter

## Using Stack As Counter
```java
public class ValidBracketCounter {
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
}
```
    
### Output
    [Prod] amount of valid bracket '()' is 1
    [Prod] amount of valid bracket '()()()' is 3
    [Prod] amount of valid bracket '((()()' is 2
    [Prod] amount of valid bracket '))((' is 0
    [Prod] amount of valid bracket '))()((' is 1
     

## Using Simple Integer
This one fails to address Closing bracket first.

```java
import java.util.Stack;

public class ValidBracketCounter {

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

```

### Output

     [Beta] amount of valid bracket '()' is 1
     [Beta] amount of valid bracket '()()()' is 3
     [Beta] amount of valid bracket '((()()' is 2
     [Beta] amount of valid bracket '))((' is 2
     [Beta] amount of valid bracket '))()((' is 3