package TestOne;

import org.junit.Assert;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = calculator.displayInfo(3, 4);
        System.out.println(a);
        Assert.assertEquals(7, a);

    
}
