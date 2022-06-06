import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {

    @Test
    public void test() {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;

        Assertions.assertEquals(amount, registered);

    }
}
