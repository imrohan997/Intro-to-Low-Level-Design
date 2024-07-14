public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.put("a", 3);
        context.put("b", 5);
        context.put("c", 7);
        context.put("d", 9);

//        MultiplyNonTerminalExpression multiplyNonTerminalExpression =
//                new MultiplyNonTerminalExpression(
//                        new MultiplyNonTerminalExpression(
//                                new NumberTerminalExpression("a"),
//                                new NumberTerminalExpression("b")),
//                        new MultiplyNonTerminalExpression(
//                                new NumberTerminalExpression("c"),
//                                new NumberTerminalExpression("d")));
        BinaryNonTerminalExpression binaryNonTerminalExpression =
                new BinaryNonTerminalExpression(
                        new BinaryNonTerminalExpression(
                                new NumberTerminalExpression("a"),
                                new NumberTerminalExpression("b"),
                                "+"),
                        new BinaryNonTerminalExpression(
                                new NumberTerminalExpression("c"),
                                new NumberTerminalExpression("d"),
                                "+"),
                        "*");
        System.out.println(binaryNonTerminalExpression.interpret(context));
    }
}