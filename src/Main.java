public class Main {
    public static void main(String[] args) {
        CalculatorConundrum calculatorConundrum = new CalculatorConundrum();
        System.out.println("Add values: " + calculatorConundrum.calculate(+ 5, 5, "+"));
        System.out.println("Multiply values: " + calculatorConundrum.calculate(+ 5, 5, "*"));
        System.out.println("Divided values: " + calculatorConundrum.calculate(+ 5, 5, "/"));
    }
}