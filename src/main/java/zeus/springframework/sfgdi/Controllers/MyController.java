package zeus.springframework.sfgdi.Controllers;


import org.springframework.stereotype.Controller;
import zeus.springframework.sfgdi.services.GreetingService;

@Controller
public class MyController
{
    //property que se usa para el ejemplo de primary
    //como no he declarado que implementacion de Greeting Service usar en el controlador se usara la que tenga la etiqueta Primary
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }
}
