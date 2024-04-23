package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Productos;

public class testProductos {

	

		EntityManagerFactory emf= Persistence.createEntityManagerFactory("JPA_Urbana");
		EntityManager em = emf .createEntityManager();
		
	public testProductos() {}

	public void Insertar_Productos() {
			Productos insertarProductos = new Productos();
			insertarProductos.setNombre("Pantalon de vestir");
			insertarProductos.setDescripcion("pantalon para terno");
			insertarProductos.setPrecio(40.20);
			
			em.getTransaction().begin();
			em.persist(insertarProductos);
			em.getTransaction().commit();
		}
	 public void Actualizar_Productos() {
		 em.getTransaction().begin();
		 Productos actualizarProductos= em.find(Productos.class, 12);
		 
		 System.out.println("nombre"+ actualizarProductos.getNombre());
		 System.out.println("descripcion"+ actualizarProductos.getDescripcion());
		 actualizarProductos.setNombre("ropa de playaaaa");
		 em.merge(actualizarProductos);
		 em.getTransaction().commit();
	 }
	 
	  public void Eliminar_Producto() {
		  em.getTransaction().begin();
		  Productos eliminarProductos = em.find(Productos.class , 15);
		  System.out.println("id_producto" + eliminarProductos.getId_producto());
		  System.out.println("nombre" + eliminarProductos.getNombre());
		  em.remove(eliminarProductos);
		  em.getTransaction().commit();
		  } 
		  public static void main(String[] args) {
			  testProductos TestProductos = new 	testProductos();
					TestProductos.Insertar_Productos();
		  }
	  
	}



