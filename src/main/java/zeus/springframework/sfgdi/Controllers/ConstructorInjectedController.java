package zeus.springframework.sfgdi.Controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import zeus.springframework.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController  //ejemplo de depency injection sin usar spring,
{
    private final GreetingService greetingService;
    //Aqui como se inyecta la dependencia en el constructor es opcional usar @Autowired, ya que spring sabe que se necesita una instancia del servicio si esta en una instancia del controlador
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) //con qualifier le indico cual implementacion del servicio requiero
    {
        this.greetingService = greetingService;
    }

    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }
}
