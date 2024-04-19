package tablaEstudiantes.controladores;

import javax.persistence.EntityManager;
import tablaEstudiantes.entidades.Estudiante;

public class ControladorEstudiante extends SuperControlador {
	private static ControladorEstudiante instance = null;

	public ControladorEstudiante() {
		super("estudiante", Estudiante.class);
	}

	public static ControladorEstudiante getInstance() {
		if (instance == null)
			instance = new ControladorEstudiante();
		return instance;
	}
	
	/**
	 * 
	 * @param m
	 */
	
	public void update(int id, String nombre, String apellido1, String apellido2, String dni, String direccion, String Email, String Telefono) {
		EntityManager em = getEntityManager();
		Estudiante e = new Estudiante();
		em.getTransaction().begin();
		e.setId(id);
		e.setNombre(nombre);
		e.setApellido1(apellido1);
		e.setApellido2(apellido2);
		e.setDni(dni);
		e.setDireccion(direccion);
		e.setEmail(Email);
		e.setTelefono(Telefono);
		em.merge(e);
		em.getTransaction().commit();
	}
	
	/**
	 * 
	 * @param e
	 */
	
	public void persist(String nombre, String apellido1, String apellido2, String dni, String direccion, String Email, String Telefono) {
		Estudiante e = new Estudiante();
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		e.setNombre(nombre);
		e.setApellido1(apellido1);
		e.setApellido2(apellido2);
		e.setDni(dni);
		e.setDireccion(direccion);
		e.setEmail(Email);
		e.setTelefono(Telefono);
		em.persist(e);
		em.getTransaction().commit();
	}
}
