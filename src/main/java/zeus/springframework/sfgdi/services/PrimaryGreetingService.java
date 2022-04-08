package zeus.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//ejemplo de la etiqueta primary

@Primary
@Service
public class PrimaryGreetingService implements GreetingService
{

    @Override
    public String sayGreeting() {
        return "Hello World - From the Primary Bean";
    }
}
