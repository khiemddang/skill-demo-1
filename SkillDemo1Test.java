import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemo1Test {
    
    @Test
    public void multiplication() {
        assertEquals(5, SkillDemo1.multiply(2, 3));     // Test fails initially
    }
}
