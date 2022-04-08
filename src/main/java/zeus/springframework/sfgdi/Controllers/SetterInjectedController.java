package zeus.springframework.sfgdi.Controllers;

import zeus.springframework.sfgdi.services.GreetingService;

public class SetterInjectedController //ejemplo de depency injection sin usar spring,
{
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) // creo el controlador que va hacer una inyeccion de dependencias pero con setter
    {
        this.greetingService = greetingService;
    }

    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }
}
