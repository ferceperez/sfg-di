package zeus.springframework.sfgdi.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import zeus.springframework.sfgdi.services.GreetingService;

@Controller
public class SetterInjectedController //ejemplo de depency injection sin usar spring,
{

    private GreetingService greetingService;

    @Autowired //necesito decirle a Spring que quiero una instancia del servicio
    @Qualifier("setterInjectedGreetingService")//con qualifier le indico cual implementacion del servicio requiero
    public void setGreetingService(GreetingService greetingService) // creo el controlador que va hacer una inyeccion de dependencias pero con setter
    {
        this.greetingService = greetingService;
    }

    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }
}
