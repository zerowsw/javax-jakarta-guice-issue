import javax.inject.Singleton;
import javax.annotation.Generated;

@Singleton
public class MyServiceImpl implements MyService {
    @Override
    public void doSomething() {
        System.out.println("Doing something...");
    }

    @Override
    @Generated("MyServiceImpl")
    public String getResourceName() {
        return "ExampleResource";
    }
}

