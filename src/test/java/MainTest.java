import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testRun() {
        // Create a mock instance of MyService
        MyService myServiceMock = mock(MyService.class);

        // Mock the behavior of getResourceName() method
        when(myServiceMock.getResourceName()).thenReturn("MockedResource");

        // Create an instance of Main with the mock MyService
        Main main = new Main(myServiceMock);

        // Call the run method
        main.run();

        // Verify that the doSomething method of MyService is called
        verify(myServiceMock).doSomething();

        // Verify that the getResourceName method of MyService is called
        verify(myServiceMock).getResourceName();
    }
}
