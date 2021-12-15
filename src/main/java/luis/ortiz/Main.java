package luis.ortiz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app = new ClassPathXmlApplicationContext("com/uce/edu/archivo/beans.xml");
		Paciente paciente = (Paciente) app.getBean("paciente");
		System.out.println(paciente.getNombre());
		System.out.println(paciente.getApellido());
		System.out.println(paciente.getEdad());
		
	//	app.getBean(Cuenta.class);
		
		
	/*	Cuenta miCuentaPrueba = (Cuenta) app.getBean("cuenta");
		miCuentaPrueba.setNumero("23");
		miCuentaPrueba.setSaldo(10);
		
		Cuenta miCuentaPrueba = new Cuenta("1234",100);*/
		
		
		
		//JEE
		//CDI
		
		//IoC por constructor
		Profesor profe = (Profesor) app.getBean("profesor");
		//int edadTotal = estu.getEdad()+10;
		System.out.println(profe.getNombre() + " " + profe.getApellido()+ " " + profe.getProfesion()+" "+ profe.getUniversidad()+ "");
		
	}

	

}
