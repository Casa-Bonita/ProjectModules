import api.Calc;

import java.util.Scanner;

public class CalcConsole implements Calc {
    private Scanner scn = new Scanner(System.in);

    @Override
    public double getA() {
        return readDigit();
    }

    @Override
    public double getB() {
        return readDigit();
    }

    private double readDigit(){
        while(true){
            try{
                System.out.println("Введите дробное число");
                return scn.nextDouble();
            }catch(Exception e){
                System.out.println("Неверный формат числа");
            }
        }
    }
}
