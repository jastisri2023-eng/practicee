import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testNoTax() {
        assertEquals(0, App.calculateTax(200000));
    }

    @Test
    public void testFivePercentTax() {
        assertEquals(15000, App.calculateTax(300000));
    }

    @Test
    public void testTwentyPercentTax() {
        assertEquals(120000, App.calculateTax(600000));
    }

    @Test
    public void testThirtyPercentTax() {
        assertEquals(450000, App.calculateTax(1500000));
    }
}