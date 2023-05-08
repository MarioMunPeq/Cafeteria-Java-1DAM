package caja;

import java.sql.Date;
import java.util.ArrayList;

import tiposProductos.Productos;

public class Ticket {

	private int id;
	private ArrayList<Productos> listaProductos = new ArrayList<Productos>();
	private boolean pagado;
	private Date fecha;
	public static final float IVA = 1.21f;
	
	
	/**
	 * Calcula el iva total del ticket
	 * @param precio total del precio sin iva del conjunto de productos del ticket
	 * @return precio total con iva del conjunto de productos del ticket
	 */
	public float calcularIVA(float precio) {
		
		return precio*IVA;
	}

	/**
	 * Este metodo sirve para calcular el total del coste de los productos de un
	 * ticket
	 * @param listaProductos1 contiene la lsita de productos de un ticket
	 * @return devuelve la suma de todos los prodcutos como float
	 */

	public float totalTicket(ArrayList<Productos> listaProductos1) {

		float precioSinIva = 0;

		for (Productos productos : this.listaProductos) {
			precioSinIva = precioSinIva + productos.getPrecio();
		}
		
		return calcularIVA(precioSinIva);
		
	}

	/**
	 * Metodo para añadir producto a un ticket
	 * 
	 * @param producto
	 */

	public void añadirProducto(Productos producto) {

		listaProductos.add(producto);
	}

	/**
	 * Metodo para borrar producto de un ticket
	 * 
	 * @param producto
	 */

	public void borrarProducto(Productos producto) {

		listaProductos.remove(producto);
	}

	/**
	 * Metodo para borrar todos los productos de un ticket
	 */

	public void borrarTicketEntero() {

		listaProductos.clear();

	}

	// CONSTRUCTOR GETTERS Y SETTERS
	public Ticket(int id, ArrayList<Productos> listaProductos, boolean pagado, Date fecha) {
		super();
		this.id = id;
		this.listaProductos = listaProductos;
		// MODIFICADO PARA QUE SIEMPRE QUE SE CREE UN TICKET PAGADO SEA FALSE Y
		// CAMBIARLO CON EL METODO.
		this.pagado = false;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Productos> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Productos> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public boolean isPagado() {
		return pagado;
	}

	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
