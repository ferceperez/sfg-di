package zeus.springframework.sfgdi.Controllers;

import org.springframework.stereotype.Controller;
import zeus.springframework.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController  //ejemplo de depency injection sin usar spring,
{
    private final GreetingService greetingService;
    //Aqui como se inyecta la dependencia en el constructor es opcional usar @Autowired, ya que spring sabe que se necesita una instancia del servicio si esta en una instancia del controlador
    public ConstructorInjectedController(GreetingService greetingService) // creo el controlador que va hacer una inyeccion de dependencias, la inyeccion ocurre cuando construyo el objeto
    {
        this.greetingService = greetingService;
    }

    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }
}
