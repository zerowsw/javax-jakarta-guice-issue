import javax.annotation.Resource;

public interface MyService {
    void doSomething();

    @Resource
    String getResourceName();
}

