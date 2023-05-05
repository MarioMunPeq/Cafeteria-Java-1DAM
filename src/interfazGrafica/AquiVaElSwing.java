package interfazGrafica;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import caja.Cajero;
import caja.Ticket;
import tiposProductos.Cafe;
import tiposProductos.Comida;
import tiposProductos.Infusion;
import tiposProductos.OtrasBebidas;
import tiposProductos.Productos;

public class AquiVaElSwing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// todo insalar swing en eclipsa. una panel por cada una de las ventanas a saber: app principao; cafes, infusiones, refrescos, alcoholicas, dulce, salado
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AquiVaElSwing frame = new AquiVaElSwing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	// OBJETOS PARA HACER PRUEBAS
		
		ArrayList<Productos>listaProductos1 = new ArrayList<Productos>();
		ArrayList<Productos>listaProductos2 = new ArrayList<Productos>();
		Cafe cafeConLeche = new Cafe(1,"Cafe con leche",1.20f,400,null);
		Comida tostada = new Comida (2,"Tostada",0.49f,200,null);
		OtrasBebidas cocacola = new OtrasBebidas(3,"Cocacola",2.21f,300,null);
		Infusion manzanilla = new Infusion(1,"Manzanilla",1.10f,200,null);
		
		listaProductos1.add(cafeConLeche);
		listaProductos1.add(tostada);
		
		listaProductos2.add(cocacola);
		listaProductos2.add(manzanilla);
		
		ArrayList<Ticket>listaTicket = new ArrayList<Ticket>();
		Ticket ticketPrueba1 = new Ticket(1, listaProductos1, false , null);
		Ticket ticketPrueba2 = new Ticket(2, listaProductos2, false , null);
		
		listaTicket.add(ticketPrueba1);
		listaTicket.add(ticketPrueba2);
		Cajero cajeroPrueba = new Cajero(listaTicket,false);
		//Prueba de metodos calcular vuelta y sugerencia de cambio ✓
		cajeroPrueba.calcularVuelta(ticketPrueba1.totalTicket(listaProductos1),20);
		cajeroPrueba.calcularVuelta(ticketPrueba2.totalTicket(listaProductos2),20);
		//Prueba metodo cobrarTicket ✓
		System.out.println("pagado:" + cajeroPrueba.cobrarTicket(ticketPrueba1));
		
	}

	/**
	 * Create the frame.
	 */
	public AquiVaElSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
