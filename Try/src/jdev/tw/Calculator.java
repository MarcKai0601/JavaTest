package jdev.tw;

public class Calculator {
    int total = 0;

    public void setTotal(int initialValue) {
        total = initialValue;
    }

    public int getTotal() {
        return total;
    }

    public void add(int value) {
        total = total + value;
    }

    public void substract(int value) {
        total = total - value;
    }
}
