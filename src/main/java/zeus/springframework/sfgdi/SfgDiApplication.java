package zeus.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import zeus.springframework.sfgdi.Controllers.MyController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args)
	{
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController"); // no hace falta crear el objecto controller,  nunca se usa el new, el appcontext nos trae el bean

		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}
