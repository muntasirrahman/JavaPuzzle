
# Puzzles

## Valid Bracket Counter

### Using Stack As Counter
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
    
#### Output
    [Prod] valid amount of bracket '()' is 1
    [Prod] valid amount of bracket '()()()' is 3
    [Prod] valid amount of bracket '((()()' is 2
    [Prod] valid amount of bracket '))((' is 0
    [Prod] valid amount of bracket '))()((' is 1
     

### Using Simple Integer
This one fails to address Closing bracket first.


     [Beta] valid amount of bracket '()' is 1
     [Beta] valid amount of bracket '()()()' is 3
     [Beta] valid amount of bracket '((()()' is 2
     [Beta] valid amount of bracket '))((' is 2
     [Beta] valid amount of bracket '))()((' is 3