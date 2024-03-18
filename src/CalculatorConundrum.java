public class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        int value = 0;
        if(operation.equals("+")){
            value = operand1+operand2;
            return "" +operand1+" + " + operand2 + " = " + value;
        }else if(operation.equals("*")){
            value = operand1*operand2;
            return "" +operand1+" * " + operand2 + " = " + value;
        }else if(operation.equals("/")){
            value = operand1/operand2;
            return "" +operand1+" / " + operand2 + " = " + value;
        }
        return "0";
    }
}
