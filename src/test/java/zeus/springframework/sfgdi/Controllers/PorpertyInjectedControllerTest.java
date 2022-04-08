package zeus.springframework.sfgdi.Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import zeus.springframework.sfgdi.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class PorpertyInjectedControllerTest //ejemplo de depency injection sin usar spring
{
    PorpertyInjectedController controller; //creo mi dependencia a ser inyectada

    @BeforeEach
    void setUp()
    {
        controller = new PorpertyInjectedController(); //aqui mi clase controlador esta inyectando mis dependencias en las propiedades

        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting()
    {
        System.out.println(controller.getGreeting());
    }
}