package zeus.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service // le digo a spring que es un  servicio y lleva una instancia a su contexto
public class GreetingServiceImpl implements GreetingService //ejemplo de depency injection sin usar spring, necesito la implementacion de la interfaz
{
    @Override
    public String sayGreeting() {
        return "Hello world";
    }
}
