import api.Calc;

import java.util.Random;
import java.util.Scanner;


public class CalcRandom implements Calc{



    @Override
    public double getA() {
        return Math.random()*101+1;
    }

    @Override
    public double getB() {
        return Math.random()*101+1;
    }

}
