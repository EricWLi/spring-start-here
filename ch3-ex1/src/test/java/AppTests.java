import com.ericwli.Parrot;
import com.ericwli.Person;
import com.ericwli.config.ProjectConfig;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { ProjectConfig.class })
public class AppTests {
    @Autowired
    private ApplicationContext context;

    @Test
    public void testGetPersonFromSpringContext() {
        Person person = context.getBean(Person.class);
        assertNotNull(person);
    }

    @Test
    public void testGetParrotFromSpringContext() {
        Parrot parrot = context.getBean(Parrot.class);
        assertNotNull(parrot);
    }

    @Test
    public void testPersonAndParrotRelationshipIsNotSetup() {
        Person person = context.getBean(Person.class);
        Parrot parrot = person.getParrot();

        assertNull(parrot);
    }
}
