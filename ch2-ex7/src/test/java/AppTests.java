import com.ericwli.Parrot;
import com.ericwli.config.ProjectConfig;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { ProjectConfig.class })
public class AppTests {
    @Autowired
    private ApplicationContext context;

    @Test
    public void testParrotIsNotNull() {
        Parrot p = context.getBean(Parrot.class);
        assertNotNull(p);
    }

    @Test
    public void testParrotNameIsKiki() {
        Parrot p = context.getBean(Parrot.class);
        assertEquals(p.getName(), "Kiki");
    }
}
