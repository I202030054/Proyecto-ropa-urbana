package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Empleados;

public class testEmpleados {

	EntityManagerFactory emf= Persistence.createEntityManagerFactory("JPA_Urbana");
	EntityManager em = emf .createEntityManager();
	
public testEmpleados() {}

public void Insertar_Empleados() {
		Empleados insertarEmpleados = new Empleados();
		insertarEmpleados.setNombre("Jorge");
		insertarEmpleados.setApellido("Juarez");
		insertarEmpleados.setCargo("gerente");
		
		em.getTransaction().begin();
		em.persist(insertarEmpleados);
		em.getTransaction().commit();
	}
 public void Actualizar_Empleados() {
	 em.getTransaction().begin();
	 Empleados actualizarEmpleados= em.find(Empleados.class, 7);
	 
	 System.out.println("nombre"+ actualizarEmpleados.getNombre());
	 System.out.println("cargo"+ actualizarEmpleados.getCargo());
	 actualizarEmpleados.setNombre("Pablito");
	 actualizarEmpleados.setCargo("Vendedor");
	 em.merge(actualizarEmpleados);
	 em.getTransaction().commit();
 }
 
  public void Eliminar_Empleados() {
	  em.getTransaction().begin();
	  Empleados eliminarEmpleados = em.find(Empleados.class , 7);
	  System.out.println("id_producto" + eliminarEmpleados.getId_empleado());
	  System.out.println("nombre" + eliminarEmpleados.getNombre());
	  em.remove(eliminarEmpleados);
	  em.getTransaction().commit();
	  } 
	  public static void main(String[] args) {
		  testEmpleados TestEmpleados = new 	testEmpleados();
		  TestEmpleados.Eliminar_Empleados();
	  }

}
