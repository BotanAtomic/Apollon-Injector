import modules.DefaultModule;
import org.apollon.injector.core.Injector;

public class Main {

    public static void main(String[] args) {
        Injector injector = Injector.create(new DefaultModule());



    }

}
