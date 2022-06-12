import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void shouldCalculateForRegisteredAndUnderLimit(long amount, boolean registered, long expected) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void shouldCalculateForRegisteredAndOverLimit(long amount, boolean registered, long expected) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void shouldCalculateForUnRegisteredAndUnderLimit(long amount, boolean registered, long expected) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void shouldCalculateForUnRegisteredAndOverLimit(long amount, boolean registered, long expected) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);

    }

}
