package by.epamtc.senkevichmaxim.task0106.util;

public class Logic {
    public static void time(int numberOfSeconds, int numberOfSeconds2, int hour, int min, int sec){
        if ((numberOfSeconds > 86400) || (numberOfSeconds < 0)) {
            System.out.println("Неверное значение.");
            return;
        }
        hour = numberOfSeconds / 3600;
        numberOfSeconds = numberOfSeconds - hour * 3600;
        min = numberOfSeconds / 60;
        numberOfSeconds = numberOfSeconds - min * 60;
        sec = numberOfSeconds;
        System.out.println("В " + numberOfSeconds2 + " секундах: " +
                hour + " ч. " + min + " мин. " + sec + " сек.");
    }
}
