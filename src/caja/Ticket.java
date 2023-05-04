package caja;

import java.sql.Date;
import java.util.ArrayList;

import tiposProductos.Productos;

public class Ticket {

    private int id;
    private ArrayList<Productos> listaProductos = new ArrayList<Productos>();
    private boolean pagado;
    private Date fecha;
    
    
    
	public Ticket(int id, ArrayList<Productos> listaProductos, boolean pagado, Date fecha) {
		super();
		this.id = id;
		this.listaProductos = listaProductos;
		this.pagado = pagado;
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
	/**
	 * Este metodo sirve para calcular el total del coste de los productos de un ticket
	 * @param listaProductos contiene la lsita de productos de un ticket
	 * @return devuelve la suma de todos los prodcutos como double
	 */
	
	public double totalTicket(Productos listaProductos ) {
		
		double suma = 0;
		for (Productos productos : this.listaProductos) {
			suma = suma + productos.getPrecio();
		}
		
		return suma;
	}
	
}
