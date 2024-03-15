import javax.inject.Singleton;
import javax.annotation.Resource;

@Singleton
public class MyServiceImpl implements MyService {
    @Override
    public void doSomething() {
        System.out.println("Doing something...");
    }

    @Override
    @Resource
    public String getResourceName() {
        return "ExampleResource";
    }
}

