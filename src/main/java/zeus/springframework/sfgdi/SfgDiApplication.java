package zeus.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import zeus.springframework.sfgdi.Controllers.*;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args)
	{
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController"); // no hace falta crear el objecto controller,  nunca se usa el new, el appcontext nos trae el bean

		System.out.println("------------ Primary Bean");
		System.out.println(myController.sayHello());

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
