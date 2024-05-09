package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static int num12 = 12;
    private static int num1m = -1;
    private static int num11 = 11;
    private int[] numbers = new int[num12];

    private int total = num1m;

    public static int getNum12() {
        return num12;
    }

    public static int getNum1m() {
        return num1m;
    }

    public static int getNum11() {
        return num11;
    }

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == num1m;
    }


    public boolean isFull() {
        return total == num11;
    }

    protected int peekaboo() {
        if (callCheck())
            return num1m;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return num1m;
        return numbers[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }
}
