package caja;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Cajero {

	public static final double VALOR_CAJA_CHICA_INICIAL = 300;

	public static ArrayList<Ticket> listaTickets = new ArrayList<Ticket>();
	private double cajaFinalMetalico;
	private double cajaFinalTarjeta;
	// private double cajaChica;

	public boolean anadirTicket(Ticket ticket) {

		return listaTickets.add(ticket);

	}

	/**
	 * Elimina un ticket de la lista de ticekts
	 * 
	 * @param ticket, ticket a eliminar
	 * @return devuelve true si se ha eliminado y false si no se ha eliminado
	 */
	public boolean eliminarTicket(Ticket ticket) {

		return listaTickets.remove(ticket);
	}

	/**
	 * Añade el dinero de los tickets pagados a sus respectivas cajas de metallico o
	 * con tarjeta
	 * 
	 * @param ticket parametro del que se coge la cantidad de dinero a añadir en la
	 *               caja
	 */

	public void pagarTicket(Ticket ticket) {
		ticket.setPagado(true);
		JPanel panel = new JPanel();
		// redondeamos el valor total del ticket a 2 decimales
		double totalDouble = redondear(ticket.totalTicket(ticket));
		JOptionPane.showMessageDialog(panel, "El total del ticket es: " + totalDouble);
		String[] options = { "Metalico", "Tarjeta" };
		int seleccion = JOptionPane.showOptionDialog(null, "¿Como ha pagado el cliente?", "Pago",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

		if (options[seleccion].equals("Metalico")) {
			ticket.setPagoTarjeta(false);
			// JOption pane para introducir el dinero que ha pagado el cliente
			// repetir el joption pane hasta que el dinero introducido sea mayor o igual que
			// el total del ticket

			String dineroPagado = JOptionPane.showInputDialog("Introduzca el dinero que ha pagado el cliente");
			while (Double.parseDouble(dineroPagado) < totalDouble) {
				JOptionPane.showMessageDialog(panel, "El dinero introducido es menor que el total del ticket");
				dineroPagado = JOptionPane.showInputDialog("Introduzca el dinero que ha pagado el cliente");
			}
			double dineroPagadoDouble = Double.parseDouble(dineroPagado);
			calcularVuelta(totalDouble, dineroPagadoDouble);
			JOptionPane.showMessageDialog(panel, "La vuelta es de: " + calcularVuelta(totalDouble, dineroPagadoDouble));
			sugerenciaCambio(calcularVueltaDouble(totalDouble, dineroPagadoDouble));

		} else {
			ticket.setPagoTarjeta(true);
		}

		if (ticket.isPagado() && ticket.isPagoTarjeta()) {
			cajaFinalTarjeta = redondear(cajaFinalTarjeta + ticket.totalTicket(ticket));
		} else if (ticket.isPagado() && ticket.isPagoTarjeta() == false) {
			cajaFinalMetalico = redondear(cajaFinalMetalico + ticket.totalTicket(ticket));
		}

	}

	/**
	 * Devuelve el valor de la caja total del dia.
	 * 
	 * @return total caja del dia.
	 */
	public double cajaTotal() {

		double sumaTotalCaja = cajaFinalTarjeta + cajaFinalMetalico + VALOR_CAJA_CHICA_INICIAL;

		return redondear(sumaTotalCaja);

	}

	/**
	 * Devuelve el valor total del beneficio diario calculando la caja total menos
	 * el valor inicial con el que empieza la caja chica para dar el cambio
	 * 
	 * @return beneficio total del dia.
	 */
	public double beneficioDiario() {

		// redondeamos el valor de la caja total a 2 decimales con math.round y lo
		// almacenamos en un double
		double beneficio = cajaTotal() - VALOR_CAJA_CHICA_INICIAL;
		return redondear(beneficio);

	}

	/**
	 * Metodo para calcular la cuantia de la vuelta del pago del cliente
	 * 
	 * @param precio valor que tiene el producto o productos comprados
	 * @param pagado valor aportado por el cliente para pagar el producto o
	 *               productos comprados
	 * @return Devuelve la cantidad a devolver
	 */

	public String calcularVuelta(double precio, double pagado) {
		double totalDevolver = pagado - precio;
		return "El cambio a devolver es: " + redondear(totalDevolver) + "€";

	}

	public double calcularVueltaDouble(double precio, double pagado) {
		double totalDevolver = pagado - precio;
		if (totalDevolver < 0) {
			return 0;
		}
		return redondear(totalDevolver);

	}

	// metodo para redondear con math.round a 2 decimales
	public static double redondear(double numero) {
		return Math.round(numero * 100.0) / 100.0;
	}

	/**
	 * Este metodo sirve para sugerir el cambio que hay que dar en monedas y
	 * billetes utilizando bucles para ir restando al cambio los distintos tipos de
	 * moneda de mayor a menor hasta que el resultado del cambio es 0 y almacenando
	 * la cantidad de billetes/monedas utilizados en sus respectivos arrays
	 * 
	 * @param cambio valor total del cambio a devolver.
	 */
	public static void sugerenciaCambio(double cambio) {

		int[] billetes = { 500, 200, 100, 50, 20, 10, 5 };
		double[] monedas = { 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01 };

		int[] cantidadBilletes = new int[billetes.length];
		int[] cantidadMonedas = new int[monedas.length];

		double cambioRedondeado = redondear(cambio);

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
		if (cambioRedondeado > 0.001) {
			cantidadMonedas[7]++;
		}
		// seleccionamos solo los billetes y monedas cuya cantidad sea mayor que 0 para
		// guardar su valores en un arraylist auxiliar y mostrarlos en JOptionPane
		// uno debajo de otro

		ArrayList<String> cambioSugerido = new ArrayList<String>();
		for (int i = 0; i < cantidadBilletes.length; i++) {
			if (cantidadBilletes[i] > 0) {
				cambioSugerido.add(cantidadBilletes[i] + " billetes de " + billetes[i] + "€");
			}
		}
		for (int i = 0; i < cantidadMonedas.length; i++) {
			if (cantidadMonedas[i] > 0) {
				cambioSugerido.add(cantidadMonedas[i] + " monedas de " + monedas[i] + "€");
			}
		}

		JOptionPane.showMessageDialog(null,
				cambioSugerido.toString().replace("[", "").replace("]", "").replace(",", "\n"));

	}

	// CONSTRUCTOR, GETTERS Y SETTERS

	// constructor
	public Cajero(ArrayList<Ticket> listaTickets) {
		super();
		Cajero.listaTickets = listaTickets;
		this.cajaFinalMetalico = 0;
		this.cajaFinalTarjeta = 0;
		// this.cajaChica = VALOR_CAJA_CHICA_INICIAL;
	}

	public Cajero() {

	}

	public ArrayList<Ticket> getListaTickets() {
		return listaTickets;
	}

	public void setListaTickets(ArrayList<Ticket> listaTickets) {
		Cajero.listaTickets = listaTickets;
	}

	public double getCajaFinalMetalico() {
		return cajaFinalMetalico;
	}

	public void setCajaFinalMetalico(double cajaFinalMetalico) {
		this.cajaFinalMetalico = cajaFinalMetalico;
	}

	public double getCajaFinalTarjeta() {
		return cajaFinalTarjeta;
	}

	public void setCajaFinalTarjeta(double cajaFinalTarjeta) {
		this.cajaFinalTarjeta = cajaFinalTarjeta;
	}

}