package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Clientes;

public class testClientes {

	EntityManagerFactory emf= Persistence.createEntityManagerFactory("JPA_Urbana");
	EntityManager em = emf .createEntityManager();
	
public testClientes() {}

public void Insertar_Clientes() {
		Clientes insertarClientes = new Clientes();
		insertarClientes.setNombre("Anghela");
		insertarClientes.setApellido("Salinas Aredo");
		insertarClientes.setDireccion("Rio seco");
		
		em.getTransaction().begin();
		em.persist(insertarClientes);
		em.getTransaction().commit();
	}
 public void Actualizar_Clientes() {
	 em.getTransaction().begin();
	 Clientes actualizarClientes= em.find(Clientes.class, 10);
	 
	 System.out.println("nombre"+ actualizarClientes.getNombre());
	 System.out.println("apellido"+ actualizarClientes.getApellido());
	 System.out.println("correo"+ actualizarClientes.getCorreo());
	 actualizarClientes.setApellido("El Kevin");
	 em.merge(actualizarClientes);
	 em.getTransaction().commit();
 }
 
  public void Eliminar_Clientes() {
	  em.getTransaction().begin();
	  Clientes eliminarClientes = em.find(Clientes.class , 10);
	  System.out.println("id_cliente" + eliminarClientes.getId_cliente());
	  System.out.println("nombre" + eliminarClientes.getNombre());
	  em.remove(eliminarClientes);
	  em.getTransaction().commit();
	  } 
	  public static void main(String[] args) {
		  testClientes TestClientes = new 	testClientes();
		  TestClientes.Eliminar_Clientes();
	  }

}