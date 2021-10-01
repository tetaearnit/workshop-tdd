package th.co.cdg.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import th.co.cdg.tdd.badcode.ArgumentNullException;
import th.co.cdg.tdd.badcode.RegisterBusiness;
import th.co.cdg.tdd.badcode.Speaker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RegisterBusinessTest {

    @Test
    @DisplayName("")
    public void case1() {
        RegisterBusiness registerBusiness = new RegisterBusiness();
        Exception e = assertThrows(ArgumentNullException.class, () -> {
            registerBusiness.register(null, new Speaker());
        });
        assertEquals("First name is required.", e.getMessage());
    }

    @Test
    @DisplayName("")
    public void case2() {
        RegisterBusiness registerBusiness = new RegisterBusiness();
        Exception e = assertThrows(ArgumentNullException.class, () -> {
            registerBusiness.register(null, new Speaker());
        });
        assertEquals("First name is required.", e.getMessage());
//        registerBusiness.register(null, new Speaker());
    }
}
