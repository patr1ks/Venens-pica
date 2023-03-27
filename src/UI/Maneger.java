package UI;

import java.util.ArrayList;

import javax.swing.JFrame;

import Main.PizzaTypes;

public class Maneger extends JFrame {
	MainMenu mainMenu;
	Register register;
	Order order;
	Toppings toppings;
	Receipt receipt;
	ReceiptOrder receiptOrder;
	public Maneger(){
		mainMenu = new MainMenu(this);
		register = new Register(this);
		order = new Order(this);
		toppings = new Toppings(this);
		receipt = new Receipt(this);
		receiptOrder = new ReceiptOrder(this);
		showMainMenu();
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	ArrayList<PizzaTypes> PizzaList = new ArrayList<PizzaTypes>();

	private void clear(){
		this.getContentPane().removeAll();
	}

	public void showMainMenu(){
		clear();
		this.setTitle("Izvēlne");
		this.setSize(350, 350);
		this.add(mainMenu);
		this.revalidate();
		this.repaint();
	}
	public void showRegister() {
		clear();
		this.setTitle("Reģistrācijas dati");
		this.setSize(350, 350);
		this.add(register);
		this.revalidate();
		this.repaint();
	}
	public void showOrder() {
		clear();
		this.setTitle("Pasūtīt picu");
		this.setSize(350, 350);
		this.add(order);
		this.revalidate();
		this.repaint();
		
	}
	public void showToppings() {
		clear();
		this.setTitle("Izvēlēties piedevas");
		this.setSize(350, 350);
		this.add(toppings);
		this.revalidate();
		this.repaint();
		
	}
	
	public void showReceipt() {
		clear();
		this.setTitle("Čeks");
		this.setSize(350, 350);
		this.add(receipt);
		this.revalidate();
		this.repaint();
		
	}
	public void showReceiptOrder() {
		clear();
		this.setTitle("Pasūtijumi");
		this.setSize(350, 350);
		this.add(receiptOrder);
		this.revalidate();
		this.repaint();
		
	}
	
	

}
