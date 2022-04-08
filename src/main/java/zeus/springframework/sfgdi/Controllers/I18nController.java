package zeus.springframework.sfgdi.Controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import zeus.springframework.sfgdi.services.GreetingService;

@Controller
public class I18nController //example use for profiles in springs
{
    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }

}
