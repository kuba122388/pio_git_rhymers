package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int num12 = 12;
    private static final int num1m = -1;
    private static final int num11 = 11;
    private final int[] numbers = new int[num12];

    private int total = num1m;

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
