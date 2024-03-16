import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;

import javax.inject.Named;

public class MyAppModule extends AbstractModule {
    @Override
    protected void configure() {
        // Your configuration here
        bind(MyService.class).to(MyServiceImpl.class);
        bindConstant().annotatedWith(Names.named("Test")).to("TestValue");
    }
}