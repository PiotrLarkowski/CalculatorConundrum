public class Main {
    public static void main(String[] args) throws Exception {
        CalculatorConundrum calculatorConundrum = new CalculatorConundrum();
        System.out.println("Add values: " + calculatorConundrum.calculate(+ 5, 5, "+"));
        System.out.println("Multiply values: " + calculatorConundrum.calculate(+ 5, 5, "*"));
        System.out.println("Divided values: " + calculatorConundrum.calculate(+ 5, 5, "/"));

//        System.out.println("Exceptions handling");
//        System.out.println("Add values: " + calculatorConundrum.calculate(+ 5, 5, null));
//        System.out.println("Multiply values: " + calculatorConundrum.calculate(+ 5, 5, ""));
//        System.out.println("Divided values: " + calculatorConundrum.calculate(+ 5, 5, "**"));

        System.out.println("Divided by 0 exception");
        System.out.println("Divided values: " + calculatorConundrum.calculate(+ 5, 0, "/"));
    }
}