package zeus.springframework.sfgdi.Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import zeus.springframework.sfgdi.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest //ejemplo de depency injection sin usar spring
{
    ConstructorInjectedController controller; //creo mi dependencia a ser inyectada

    @BeforeEach
    void setUp()
    {
        controller = new ConstructorInjectedController( new GreetingServiceImpl()); // al instanciar el objeto, ocurre la inyeccion de dependencias
    }

    @Test
    void getGreeting()
    {
        System.out.println(controller.getGreeting());
    }
}