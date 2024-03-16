import com.google.inject.Guice;
import javax.inject.Inject;

public class Main {
    private final MyService myService;

    @Inject
    public Main(MyService myService) {
        this.myService = myService;
    }

    public String run() {
        return myService.getResourceName();
    }

    public static void main(String[] args) {
        Main main = new Main(Guice.createInjector(new MyAppModule()).getInstance(MyService.class));
        main.run();
    }
}

