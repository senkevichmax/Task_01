package by.epamtc.senkevichmaxim.task0108.util;

public class Logic {
    public static double function(double x){
        if (x >= 3) {
            x = -x * x + 3 * x + 9;
        } else {
            x = 1 / (Math.pow(x, 3) - 6);
        }

        return x;
    }
}
