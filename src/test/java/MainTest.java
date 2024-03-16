import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.inject.Guice;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testRun() {

        // Create an instance of Main with the mock MyService
        MyService myService = Guice.createInjector(new MyAppModule()).getInstance(MyService.class);
        assertEquals("TestValue", myService.getResourceName());
    }
}
