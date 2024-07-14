public class NumberTerminalExpression implements AbstractExpression {

    private String strValue;
    public NumberTerminalExpression(String strValue) {
        this.strValue = strValue;
    }

    @Override
    public int interpret(Context context) {
        return context.get(strValue);
    }
}
