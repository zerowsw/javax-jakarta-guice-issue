import javax.inject.Singleton;

@Singleton
public class MyServiceImpl implements MyService {
    @Override
    public void doSomething() {
        System.out.println("Doing something...");
    }
}

