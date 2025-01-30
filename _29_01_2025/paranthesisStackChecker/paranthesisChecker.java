import java.util.HashMap;
import java.util.Map;

public class paranthesisChecker {
    private final char[] stack;
    private int top;
    private int size;
    private final String str;
    private final Map<Character, Character> map;
    private final char[] openBraces = {'(', '[', '{'};
    private final char[] closeBraces = {')', ']', '}'};

    public paranthesisChecker(String str) {
        this.str = str;
        this.size = str.length();
        this.stack = new char[size];
        this.top = -1;
        this.map = new HashMap<>();
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    private void push(char c) {
        stack[++top] = c;
    }

    private void pop() {
        top--;
    }

    private char peek() {
        return stack[top];
    }

    public boolean doesContain(char c, char[] str) {
        for (int i = 0; i < str.length; i++) {
            if (str[i] == c) {
                return true;
            }
        }
        return false;
    }

    public boolean isParanthesisRight() {
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (doesContain(currentChar, openBraces)) {
                this.push(currentChar);
            } else if (doesContain(currentChar, closeBraces)) {
                if (this.isEmpty() || map.get(this.peek()) != currentChar) {
                    return false;
                }
                this.pop();
            }
        }

        return this.isEmpty();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}