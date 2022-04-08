package zeus.springframework.sfgdi.Controllers;

import zeus.springframework.sfgdi.services.GreetingService;

public class PorpertyInjectedController //ejemplo de depency injection sin usar spring, creo el controlador que va hacer una inyeccion de dependencias en las propiedades
{
    public GreetingService greetingService;

    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }
}
