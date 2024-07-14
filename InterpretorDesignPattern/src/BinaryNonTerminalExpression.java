public class BinaryNonTerminalExpression implements AbstractExpression {
    AbstractExpression leftExpression;
    AbstractExpression rightExpression;
    String operator;

    public BinaryNonTerminalExpression(AbstractExpression leftExpression, AbstractExpression rightExpression, String operator) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator = operator;
    }

    @Override
    public int interpret(Context context) {
        if(operator.equals("+")) {
            return leftExpression.interpret(context) + rightExpression.interpret(context);
        } else if(operator.equals("*")) {
            return leftExpression.interpret(context) * rightExpression.interpret(context);
        } else {
            return leftExpression.interpret(context) - rightExpression.interpret(context);
        }
    }
}
