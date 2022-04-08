package zeus.springframework.sfgdi.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import zeus.springframework.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController //ejemplo de depency injection sin usar spring, creo el controlador que va hacer una inyeccion de dependencias en las propiedades
{
    @Qualifier("propertyInjectedGreetingService")//con qualifier le indico cual implementacion del servicio requiero
    @Autowired //necesito decirle a Spring que quiero una instancia del servicio
    public GreetingService greetingService;

    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }
}
