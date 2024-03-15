import javax.annotation.Generated;

public interface MyService {
    void doSomething();

    @Generated("MyService")
    String getResourceName();
}

