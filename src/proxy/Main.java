package proxy;

public class Main {
    public static void main(String[] args) {
        MathCalculatorProxy mathCalculatorProxy = new MathCalculatorProxy();

        System.out.println(mathCalculatorProxy.add(5,6));

        System.out.println(mathCalculatorProxy.mul(1,0));

        System.out.println(mathCalculatorProxy.div(60,3));

        System.out.println(mathCalculatorProxy.div(55,0));
    }
}
