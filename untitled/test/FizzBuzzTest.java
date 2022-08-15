import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void testCheckFizzBuzz() {
        String expected = "hai ba";
        String result = FizzBuzz.checkFizzBuzz(23);
        assertEquals(expected,result);
    }
}