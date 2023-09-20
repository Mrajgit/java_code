class InvalidInputException extends Exception{
    public String toString(){
        return "cannot add 8 and 9";
    }
    public String getMessage(){
        return "i am getMessage()";
    }
}
class MaxInputException extends Exception{
    public String toString(){
        return "input cannot be greater than 100000";
    }
    public String getMessage(){
        return "i am getMessage()";
    }
}
class cannotDivideByZeroException extends Exception{
    public String toString(){
        return "cannot divide by 0";
    }
    public String getMessage(){
        return "i am getMessage()";
    }
}
class MaxMultiplyInputException extends Exception{
    public String toString(){
        return "input cannot be greater than 7000 while multiplying";
    }
    public String getMessage(){
        return "i am getMessage()";
    }
}

class customCalculator{
    double add(double a, double b) throws InvalidInputException, MaxInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        if(a==9 || b == 9){
            throw new InvalidInputException();
        }
        return a+b;
    }
    double subtract(double a, double b) throws  MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a - b;
    }
    double multiply(double a, double b) throws MaxInputException, MaxMultiplyInputException{
        if(a>100000 || b>100000){
            throw  new MaxInputException();
        }
        else if (a>7000 || b>7000){
            throw new MaxMultiplyInputException();
        }
        return a * b;
    }
    double divide(double a, double b) throws MaxInputException, cannotDivideByZeroException{
        if(a>100000 || b>100000){
            throw  new MaxInputException();
        }
        if(b==0){
            throw new cannotDivideByZeroException();
        }
        return a/b;
    }
}
public class custom_calculator {
    public static void main(String[] args) throws  InvalidInputException, MaxInputException, cannotDivideByZeroException, MaxMultiplyInputException {
        customCalculator c = new customCalculator();
//        c.add(8,9);
//        c.subtract(9,8);
//        c.multiply(5,70000);
//        c.divide(8,0);
    }
}
