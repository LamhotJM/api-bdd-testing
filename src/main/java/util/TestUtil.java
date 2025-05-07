package util;

import org.testng.Assert;

public class TestUtil {

    public static void assertStatusCode(int actual, int expected) {
        Assert.assertEquals(expected, actual);
    }

    public static void assertResponseContains(String response, String expectedValue) {
        Assert.assertTrue(response.contains(expectedValue));
    }
}