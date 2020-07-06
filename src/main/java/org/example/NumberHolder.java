package org.example;

import java.util.Objects;

public class NumberHolder {

    private int number;
    private static int staticNumber;

    public String info() {
        return "Number: " + number + "\nStatic Number: " + staticNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static int getStaticNumber() {
        return staticNumber;
    }

    public static void setStaticNumber(int staticNumber) {
        NumberHolder.staticNumber = staticNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumberHolder that = (NumberHolder) o;
        return getNumber() == that.getNumber();
    }
}
