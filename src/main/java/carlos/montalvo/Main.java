package carlos.montalvo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ec.inyeccion.dependencias.framework.Estudiante;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				ApplicationContext app = new ClassPathXmlApplicationContext("com/uce/edu/archivo/beans.xml");
				Estudiante estudi = (Estudiante) app.getBean("estu1");
				System.out.println(estudi.getNombre());
				System.out.println(estudi.getApellido());
				System.out.println(estudi.getEdad());

				
				Profesor profe = (Profesor) app.getBean("prof");
				System.out.println(profe.getNombre());
				System.out.println(profe.getApellido());
				System.out.println(profe.getProfesion());
				System.out.println(profe.getUniversidad());
		
	}

}
