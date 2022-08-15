import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void testCheckFizzBuzz() {
        String expected = "khong dem duoc";
        String result = FizzBuzz.checkFizzBuzz(100);
        assertEquals(expected,result);
    }
}