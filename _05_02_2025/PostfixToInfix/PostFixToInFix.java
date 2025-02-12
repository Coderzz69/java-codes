import java.util.Scanner;

class PostFixToInFix {
    static void postIn(String[] tokens) {
        Stack expressionStack = new Stack(tokens.length);
        String processedExpr;
        String rightOperand;

        for (String token : tokens) {
            if (checkOperator(token)) {
                rightOperand = expressionStack.pop();
                processedExpr = "(" + expressionStack.pop() + " " + token + " " + rightOperand + ")";
                expressionStack.push(processedExpr);
            } else {
                expressionStack.push(token);
            }
        }
        expressionStack.display();
    }

    static boolean checkOperator(String token) {
        return switch (token) {
            case "+", "-", "*", "/" -> true;
            default -> false;
        };
    }

    public static void main(String[] args) {
        Scanner inputReader = null;
        String expression;
        try {
            inputReader = new Scanner(System.in);
            System.out.print("Enter expression (with spaces): ");
            expression = inputReader.nextLine();
            String[] tokens = expression.split("\\s+");
            postIn(tokens);
        } finally {
            if (inputReader != null) {
                inputReader.close();
            }
        }
    }
}