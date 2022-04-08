package zeus.springframework.sfgdi.Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import zeus.springframework.sfgdi.services.ConstructorGreetingService;

class PorpertyInjectedControllerTest //ejemplo de depency injection sin usar spring
{
    PropertyInjectedController controller; //creo mi dependencia a ser inyectada

    @BeforeEach
    void setUp()
    {
        controller = new PropertyInjectedController(); //aqui mi clase controlador esta inyectando mis dependencias en las propiedades

        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting()
    {
        System.out.println(controller.getGreeting());
    }
}