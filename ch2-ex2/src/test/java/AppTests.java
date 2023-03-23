import com.ericwli.Parrot;
import com.ericwli.config.ProjectConfig;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { ProjectConfig.class })
public class AppTests {
    @Autowired
    private ApplicationContext context;

    @Test
    public void testParrotInSpringContextIsNotNull() {
        Parrot p = context.getBean(Parrot.class);
        assertNotNull(p);
    }

    @Test
    public void testParrotInSpringContextGetName() {
        Parrot p = context.getBean(Parrot.class);
        assertEquals(p.getName(), "Polly");
    }

    @Test
    public void testHelloInSpringContext() {
        String text = context.getBean(String.class);
        assertEquals(text, "Hello");
    }

    @Test
    public void testTenInSpringContext() {
        int num = context.getBean(Integer.class);
        assertEquals(num, 10);
    }

    @Test
    public void testNoSuchBeanDefinitionException() {
        assertThrows(NoSuchBeanDefinitionException.class, () -> {
            context.getBean("ThisBeanShouldNotExist");
        });
    }
}
