
import first_lessons.HelloWorld;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.PrintStream;

public class ExampleMockSysOutPrintlnTest {

    @Test
    public void exampleMockSysOutPrintln() {
        PrintStream out = Mockito.mock(PrintStream.class);
        System.setOut(out);
        HelloWorld.main(new String[]{});
        Mockito.verify(out).println("Hello World!");
        Mockito.verify(out).println("Agnieszka");
        Mockito.verify(out).println("28");
        Mockito.verify(out).println("K");
    }

}