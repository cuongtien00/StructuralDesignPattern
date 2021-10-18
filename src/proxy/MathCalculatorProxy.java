package proxy;

public class MathCalculatorProxy implements Calculator{
    private MathCalculator mathCalculator;
    public MathCalculatorProxy(){
        mathCalculator = new MathCalculator();
    }
    @Override
    public double add(double first, double second) {
        if(first/2+second/2>=Double.MAX_VALUE/2){
            throw new RuntimeException("Out of range");
        }
        if(first/2+second/2<=Double.MIN_VALUE/2){
            throw new RuntimeException("Out of range");
        }
        return mathCalculator.add(first,second);
    }

    @Override
    public double sub(double first, double second) {
        if(first/2-second/2>=Double.MAX_VALUE/2){
            throw new RuntimeException("Out of range");
        }
        if(first/2-second/2<=Double.MIN_VALUE/2){
            throw new RuntimeException("Out of range");
        }return mathCalculator.sub(first,second);
    }

    @Override
    public double mul(double first, double second) {
        if(first/second==0){
            throw new RuntimeException("Out of range");
        }
        return mathCalculator.mul(first,second);
    }

    @Override
    public double div(double first, double second) {
        if (second==0){
            throw new RuntimeException("Can't divide by zero");
        }return mathCalculator.div(first,second);
    }
}