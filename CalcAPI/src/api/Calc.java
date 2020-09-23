package api;

public interface Calc {
    double getA();
    double getB();
    default double sum(double a, double b){
        return a+b;
    }
    default double minus(double a, double b){
        return a-b;
    }
}
