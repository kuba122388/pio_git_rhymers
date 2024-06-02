package edu.kis.vh.nursery;

/**
 * The DefaultCountingOutRhymer class represents a stack-like data structure
 * that allows counting in and counting out operations.
 * It uses an array to store integer values and provides methods to manipulate
 * this array.
 */
public class DefaultCountingOutRhymer {

    /**
     * The array used to store integer values.
     */
    private int[] numbers = new int[12];

    /**
     * The current index in the numbers array.
     * Initialized to -1 to represent an empty state.
     */
    public int total = -1;

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
        return total == -1;
    }

    /**
     * Checks if the stack is full.
     *
     * @return true if the stack is full, false otherwise.
     */
    public boolean isFull() {
        return total == 11;
    }

    /**
     * Returns the value from the top of the stack without removing it.
     *
     * @return the value from the top of the stack, or -1 if the stack is empty.
     */
    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    /**
     * Removes and returns the value from the top of the stack.
     *
     * @return the value from the top of the stack, or -1 if the stack is empty.
     */
    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}