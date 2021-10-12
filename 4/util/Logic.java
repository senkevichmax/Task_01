package by.epamtc.senkevichmaxim.task0104.util;

public class Logic {
    public static boolean parityCheck(int a, int b, int c, int d){

        int check = 0;

        if(a%2 == 0)
            check++;
        if(b%2 == 0)
            check++;
        if(c%2 == 0)
            check++;
        if(d%2 == 0)
            check++;

        if(check>=2)
            return true;
        else return false;
    }
}
