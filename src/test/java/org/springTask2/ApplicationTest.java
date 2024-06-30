package org.springTask2;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    void checkUser() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Application application = context.getBean(Application.class);
        application.getBankClientsApp().setOurСlients(true);
        application.checkUser();
        application.checkUser();
    }
}