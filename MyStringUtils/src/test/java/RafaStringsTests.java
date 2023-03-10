
import org.example.RafaStrings;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RafaStringsTests {
    @Test
    void delrevesTest(){
        assertEquals("hloa", RafaStrings.Delreves("hola", 1, 2));
        assertEquals("gdufao", RafaStrings.Delreves("gafudo", 1, 4));
        assertEquals("784565", RafaStrings.Delreves("548765", 0, 4));
        assertEquals("a", RafaStrings.Delreves("a", 3, 5));
        assertEquals("", RafaStrings.Delreves("", 4, 5));
        assertEquals(null, RafaStrings.Delreves(null, 7, 3));
    }

}
