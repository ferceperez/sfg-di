package zeus.springframework.sfgdi.Controllers;

import zeus.springframework.sfgdi.services.GreetingService;

public class ConstructorInjectedController  //ejemplo de depency injection sin usar spring,
{
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) // creo el controlador que va hacer una inyeccion de dependencias, la inyeccion ocurre cuando construyo el objeto
    {
        this.greetingService = greetingService;
    }

    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }
}
