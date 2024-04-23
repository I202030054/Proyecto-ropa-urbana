package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Productos")


public class Productos {
	

			@Id
			@Column(name = "id_producto")
			private int id_producto;
			@Column(name = "nombre")
			private String nombre;
			@Column(name = "descripcion")
			private String descripcion;
			@Column(name = " precio")
			private Double precio;
			@Column(name = "talla")
			private String talla;
			@Column(name = " color")
			private  String color;
			
			 
			public Productos() {
				
			}

			

			public int getId_producto() {
				return id_producto;
			}



			public void setId_producto(int id_producto) {
				this.id_producto = id_producto;
			}



			public String getNombre() {
				return nombre;
			}

			public void setNombre(String nombre) {
				this.nombre = nombre;
			}

			public String getDescripcion() {
				return descripcion;
			}

			public void setDescripcion(String descripcion) {
				this.descripcion = descripcion;
			}

			public Double getPrecio() {
				return precio;
			}

			public void setPrecio(Double precio) {
				this.precio = precio;
			}

			public String getTalla() {
				return talla;
			}

			public void setTalla(String talla) {
				this.talla = talla;
			}

			public String getColor() {
				return color;
			}

			public void setColor(String color) {
				this.color = color;
			}

			

}
