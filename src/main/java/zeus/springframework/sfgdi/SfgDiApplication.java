package zeus.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import zeus.springframework.sfgdi.Controllers.ConstructorInjectedController;
import zeus.springframework.sfgdi.Controllers.MyController;
import zeus.springframework.sfgdi.Controllers.PropertyInjectedController;
import zeus.springframework.sfgdi.Controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args)
	{
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController"); // no hace falta crear el objecto controller,  nunca se usa el new, el appcontext nos trae el bean

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("------------ Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController"); //para traer el bean hace falta decirle a spring cual es el controlador con @Controller
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------------ Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------------ Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
