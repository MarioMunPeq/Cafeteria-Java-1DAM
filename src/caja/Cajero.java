package caja;

import java.util.ArrayList;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cajero {

	private final float caja_chica = 0;
	private ArrayList<Ticket> listaTickets = new ArrayList<Ticket>();
	private boolean pagoTarjeta;
	private float cajaFinalMetalico;
	private float cajaFinalTarjeta;

	// Valores de las monedas y billetes
	public static final float CENT_1 = 0.01f;

	public static final float CENT_2 = 0.02f;

	public static final float CENT_5 = 0.05f;
	
	public static final float CENT_10 = 0.1f;
	
	public static final float CENT_20 = 0.2f;
	
	public static final float CENT_50 = 0.5f;
	
	public static final float EURO_1 = 1;
	
	public static final float EURO_2 = 2;

	public static final float BILLETE_5 = 5;
	
	public static final float BILLETE_10 = 10;
	
	public static final float BILLETE_20 = 20;
	
	public static final float BILLETE_50 = 50;
	
	public static final float BILLETE_100 = 100;
	
	
	/**
	 * Metodo para añadir tiquet a la lista de tiquets
	 * 
	 * @param tiquet numero de tiquet
	 * @return devuelve si la operacion se ha realizado o no
	 */

	public boolean cobrarTicket(Ticket ticket) {
		
		boolean pagado = false;
		ticket.setPagado(true);
		
			if(ticket.isPagado()) {
				pagado = true;
			}
		return pagado;
	}

	/**
	 * Metodo para calcular la cuantia de la vuelta del pago del cliente
	 * 
	 * @param precio valor que tiene el producto o productos comprados
	 * @param pagado valor aportado por el cliente para pagar el producto o
	 *               productos comprados
	 * @return Devuelve la cantidad a devolver
	 */

	public void calcularVuelta(float precio, float pagado) {
	    float totalDevolver = pagado - precio;
	    totalDevolver = Math.round(totalDevolver * 100) / 100f; // redondeo a 2 decimales
	    System.out.println("El cambio a devolver es: " + totalDevolver);
	    sugerenciaCambio(totalDevolver);
	}
	
	/**
	 * Este metodo sirve para sugerir el cambio que hay que dar en monedas y billetes utilizando bucles
	 * para ir restando al cambio los distintos tipos de moneda de mayor a menor hasta que el resultado
	 * del cambio es 0 y almacenando la cantidad de billetes/monedas utilizados en sus respectivos arrays
	 * @param cambio valor total del cambio a devolver.
	 */
	public static void sugerenciaCambio(double cambio) {
	    
	    int[] billetes = {500, 200, 100, 50, 20, 10, 5};
	    double[] monedas = {2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};

	    int[] cantidadBilletes = new int[billetes.length];
	    int[] cantidadMonedas = new int[monedas.length];

	    BigDecimal bdCambio = new BigDecimal(cambio).setScale(2, RoundingMode.HALF_DOWN);
	    double cambioRedondeado = bdCambio.doubleValue();

	    for (int i = 0; i < billetes.length; i++) {
	        while (cambioRedondeado >= billetes[i]) {
	           cambioRedondeado -= billetes[i];
	            cantidadBilletes[i]++;
	        }
	    }

	    for (int i = 0; i < monedas.length; i++) {
	        while (cambioRedondeado >= monedas[i]) {
	            cambioRedondeado -= monedas[i];
	            cantidadMonedas[i]++;
	        }
	    }
	    if(cambioRedondeado > 0.001) {
	        cantidadMonedas[7]++;
	    }

	    System.out.println("Billetes:");
	    for (int i = 0; i < billetes.length; i++) {
	        if (cantidadBilletes[i] > 0) {
	            System.out.println(cantidadBilletes[i] + " billetes de " + billetes[i]);
	        }
	    }

	    System.out.println("Monedas:");
	    for (int i = 0; i < monedas.length; i++) {
	        if (cantidadMonedas[i] > 0) {
	            System.out.println(cantidadMonedas[i] + " monedas de " + monedas[i]);
	        }
	    }
	    
	}


	// CONSTRUCTOR, GETTERS Y SETTERS
	public Cajero(ArrayList<Ticket> listaTickets, boolean pagoTarjeta) {
		super();
		this.listaTickets = listaTickets;
		this.pagoTarjeta = pagoTarjeta;

	}

	public ArrayList<Ticket> getListaTickets() {
		return listaTickets;
	}

	public void setListaTickets(ArrayList<Ticket> listaTickets) {
		this.listaTickets = listaTickets;
	}

	public boolean isPagoTarjeta() {
		return pagoTarjeta;
	}

	public void setPagoTarjeta(boolean pagoTarjeta) {
		this.pagoTarjeta = pagoTarjeta;
	}

	public float getCajaFinalMetalico() {
		return cajaFinalMetalico;
	}

	public void setCajaFinalMetalico(float cajaFinalMetalico) {
		this.cajaFinalMetalico = cajaFinalMetalico;
	}

	public float getCajaFinalTarjeta() {
		return cajaFinalTarjeta;
	}

	public void setCajaFinalTarjeta(float cajaFinalTarjeta) {
		this.cajaFinalTarjeta = cajaFinalTarjeta;
	}

	public float getCaja_chica() {
		return caja_chica;
	}
}