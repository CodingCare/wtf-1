package codingcare.wtf1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgenceControllerTest {
    @Test
    void should_count() {
        AgenceController ctrl = new AgenceController();
        int count = ctrl.compterUtilisateurs(1, Role.SECRETAIRE);
        Assertions.assertEquals(1, count);
    }
}
