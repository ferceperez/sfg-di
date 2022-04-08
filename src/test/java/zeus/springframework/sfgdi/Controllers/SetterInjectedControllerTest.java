package zeus.springframework.sfgdi.Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import zeus.springframework.sfgdi.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest //ejemplo de depency injection sin usar spring
{
    SetterInjectedController controller; //creo mi dependencia a ser inyectada

    @BeforeEach
    void setUp()
    {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl()); //aqui mi clase controlador esta inyectando mis dependencias, pero usando un set para inyectarlas
    }

    @Test
    void getGreeting()
    {
        System.out.println(controller.getGreeting());
    }
}