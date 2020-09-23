import api.Calc;

public class Main {
    public static void main(String[] args) {
        Calc calcConsole = new CalcConsole();
        Calc calcRandom = new CalcRandom();

        double sum = calcConsole.sum(calcConsole.getA(), calcConsole.getB());
        System.out.println("Сумма с консоли: "+sum);


        double minus = calcRandom.minus(calcRandom.getA(), calcRandom.getB());
        System.out.println("Разница через рэндом: "+minus);
    }
}
