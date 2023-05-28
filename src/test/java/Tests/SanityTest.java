package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SanityTest {


    //@Test

    void test1() {

        System.out.println("SanityTest1");
    }
    @Test
    void test2() {
        System.out.println("SanityTest2");
        Assert.assertTrue(false);
    }

    @Test
    void test3() {
        System.out.println("SanityTest3");
    }
    @Test
    void test4() {
        System.out.println("SanityTest4");
    }

}
