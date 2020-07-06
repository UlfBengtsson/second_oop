package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ex2();
    }

    static void ex1() {
        int before = 9;

        System.out.println("Before: " + before);

        changePrimitive(before);

        int after = before;

        System.out.println("After: " + after);
    }

    static void changePrimitive(int number) {//will not change the variable in ex1
        number = -1;
    }

    static void ex2() {

        NumberHolder.setStaticNumber(666);//can access static from class, no need to create a object to use static

        NumberHolder holdNumber = new NumberHolder();

        System.out.println(holdNumber.info());

        holdNumber.setNumber(15);

        System.out.println(holdNumber.info());

        NumberHolder holderNr2 = new NumberHolder();

        System.out.println(holderNr2.info());

        System.out.println(holdNumber == holderNr2);

        holderNr2.setNumber(15);

        System.out.println(holdNumber == holderNr2);// Ex. NumberHolder@1b6d3586 == NumberHolder@4554617c is false, not the same

        System.out.println(holdNumber);
        System.out.println(holderNr2);

        System.out.println(holdNumber.equals(holderNr2));//only works if we done our override of the equals method in NumberHolder or if it is the same object
    }
}
