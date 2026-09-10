import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AccountTest {

    @Test
    void defaultConstructor_initializesValues() {
        Account account = new Account();

        assertAll(
                () -> assertNull(account.getName()),
                () -> assertEquals(0, account.getAccountNumber()),
                () -> assertNull(account.getPIN()),
                () -> assertEquals(0.0, account.getAmount())
        );
    }

    @Test
    void parameterizedConstructor_setsValuesCorrectly() {
        Account account = new Account("Alice", 12345678, "1234", 500);

        assertAll(
                () -> assertEquals("Alice", account.getName()),
                () -> assertEquals(12345678, account.getAccountNumber()),
                () -> assertEquals("1234", account.getPIN()),
                () -> assertEquals(1500, account.getAmount()) // 1000 + 500
        );
    }

    @Test
    void setters_updateValuesCorrectly() {
        Account account = new Account();

        account.setName("Bob");
        account.setAccountNumber(87654321);
        account.setPIN("4321");
        account.setAmount(2500);

        assertAll(
                () -> assertEquals("Bob", account.getName()),
                () -> assertEquals(87654321, account.getAccountNumber()),
                () -> assertEquals("4321", account.getPIN()),
                () -> assertEquals(2500, account.getAmount())
        );
    }
}