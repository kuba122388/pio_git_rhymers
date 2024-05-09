package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int num12 = 12;
    public static final int num1m = -1;
    public static final int num11 = 11;
    private int[] numbers = new int[num12];

    public int total = num1m;

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

}
