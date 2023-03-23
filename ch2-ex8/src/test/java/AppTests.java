import com.ericwli.Parrot;
import com.ericwli.config.ProjectConfig;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { ProjectConfig.class })
public class AppTests {

    private AnnotationConfigApplicationContext context;

    @BeforeEach
    void setup() {
        context = new AnnotationConfigApplicationContext();
        context.refresh();
    }

    @Test
    public void testRegisterBean() {
        Parrot x = new Parrot();
        x.setName("Kiki");

        Supplier<Parrot> parrotSupplier = () -> x;
        context.registerBean("parrot1", Parrot.class, parrotSupplier);
        //context.refresh();

        Parrot parrot = context.getBean(Parrot.class);
        assertEquals(parrot.getName(), "Kiki");
    }
}
