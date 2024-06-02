package edu.kis.vh.nursery;

/**
 * The DefaultCountingOutRhymer class represents a stack-like data structure
 * that allows counting in and counting out operations.
 * It uses an array to store integer values and provides methods to manipulate
 * this array.
 */
public class DefaultCountingOutRhymer {

    /**
     * The size of the array used to store integer values.
     */
    private static int num12 = 12;

    /**
     * The initial value indicating an empty state.
     */
    private static int numMinus1 = -1;

    /**
     * The index value indicating the array is full.
     */
    private static int num11 = 11;

    /**
     * The array used to store integer values.
     */
    private int[] numbers = new int[num12];

    /**
     * Returns the size of the array.
     *
     * @return the size of the array.
     */
    public static int getNum12() {
        return num12;
    }

    /**
     * Sets the size of the array.
     *
     * @param num12 the size of the array to set.
     */
    public static void setNum12(int num12) {
        DefaultCountingOutRhymer.num12 = num12;
    }

    /**
     * Returns the initial value indicating an empty state.
     *
     * @return the initial value indicating an empty state.
     */
    public static int getNumMinus1() {
        return numMinus1;
    }

    /**
     * The current index in the numbers array.
     * Initialized to -1 to represent an empty state.
     */
    private int total = numMinus1;

    /**
     * Returns the current index in the numbers array.
     *
     * @return the current index in the numbers array.
     */
    public int getTotal() {
        return total;
    }

    /**
     * Adds a value to the stack if it is not full.
     *
     * @param in the value to be added to the stack.
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise.
     */
    public boolean callCheck() {
        return total == numMinus1;
    }

    /**
     * Checks if the stack is full.
     *
     * @return true if the stack is full, false otherwise.
     */
    public boolean isFull() {
        return total == num11;
    }

    /**
     * Returns the value from the top of the stack without removing it.
     *
     * @return the value from the top of the stack, or -1 if the stack is empty.
     */
    protected int peekaboo() {
        if (callCheck())
            return numMinus1;
        return numbers[total];
    }

    /**
     * Removes and returns the value from the top of the stack.
     *
     * @return the value from the top of the stack, or -1 if the stack is empty.
     */
    public int countOut() {
        if (callCheck())
            return numMinus1;
        return numbers[total--];
    }

    /**
     * Returns the array used to store integer values.
     *
     * @return the array used to store integer values.
     */
    public int[] getNumbers() {
        return numbers;
    }
}