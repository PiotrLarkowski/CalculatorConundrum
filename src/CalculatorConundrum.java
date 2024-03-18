public class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) throws Exception {
        int value = 0;
        if(operation==null){
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if(operation.equals("")){
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        if(!operation.equals("+")&&!operation.equals("*")&&!operation.equals("/")){
            throw new Exception("Operation '"+operation+"' does not exist");
        }
        if (operation.equals("+")) {
            value = operand1 + operand2;
            return "" + operand1 + " + " + operand2 + " = " + value;
        } else if (operation.equals("*")) {
            value = operand1 * operand2;
            return "" + operand1 + " * " + operand2 + " = " + value;
        }else if(operation.equals("/")){
            try{
                if(operand1 == 0||operand2==0){
                    value = operand1/operand2;
                }
            }catch(ArithmeticException arithmeticException){
                System.out.println(("Division by zero is not allowed"));
            }
            value = operand1/operand2;
            return "" +operand1+" / " + operand2 + " = " + value;
        }
        return "0";
    }
}
