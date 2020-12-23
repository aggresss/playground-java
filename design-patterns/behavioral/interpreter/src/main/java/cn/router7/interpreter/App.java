package cn.router7.interpreter;

import java.util.Stack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Interpreter pattern is a design pattern that specifies how to evaluate
 * sentences in a language. The basic idea is to have a class for each symbol
 * (terminal or nonterminal) in a specialized computer language. The syntax tree
 * of a sentence in the language is an instance of the composite pattern and is
 * used to evaluate (interpret) the sentence for a client.
 *
 * <p>
 * In this example we use the Interpreter pattern to break sentences into
 * expressions ({@link Expression}) that can be evaluated and as a whole form
 * the result.
 */
public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    /**
     * Program entry point.
     *
     * <p>
     * Expressions can be evaluated using prefix, infix or postfix notations This
     * sample uses postfix, where operator comes after the operands.
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        var tokenString = "4 3 2 - 1 + *";
        var stack = new Stack<Expression>();

        var tokenList = tokenString.split(" ");
        for (var s : tokenList) {
            if (isOperator(s)) {
                var rightExpression = stack.pop();
                var leftExpression = stack.pop();
                log.info("popped from stack left: {} right: {}", leftExpression.interpret(),
                        rightExpression.interpret());
                var operator = getOperatorInstance(s, leftExpression, rightExpression);
                log.info("operator: {}", operator);
                var result = operator.interpret();
                var resultExpression = new NumberExpression(result);
                stack.push(resultExpression);
                log.info("push result to stack: {}", resultExpression.interpret());
            } else {
                var i = new NumberExpression(s);
                stack.push(i);
                log.info("push to stack: {}", i.interpret());
            }
        }
        log.info("result: {}", stack.pop().interpret());
    }

    public static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*");
    }

    /**
     * Get expression for string.
     */
    public static Expression getOperatorInstance(String s, Expression left, Expression right) {
        switch (s) {
            case "+":
                return new PlusExpression(left, right);
            case "-":
                return new MinusExpression(left, right);
            case "*":
                return new MultiplyExpression(left, right);
            default:
                return new MultiplyExpression(left, right);
        }
    }
}
