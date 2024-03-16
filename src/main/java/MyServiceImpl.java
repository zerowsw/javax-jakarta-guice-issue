import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
public class MyServiceImpl implements MyService {
    @Inject
    @Named("Test")
    private String privateValue;

    @Override
    public void doSomething() {
        System.out.println("Doing something...");
    }

    @Override
    public String getResourceName() {
        return privateValue;
    }
}

