package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MainMenu extends JPanel {
	Maneger maneger;
	MainMenu(Maneger maneger){
		this.maneger = maneger;
		this.setLayout(null);
		
		JButton orderButton= new JButton("Pasūtīt picu");
		orderButton.setBounds(40, 90, 110, 25);
		
		orderButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				maneger.showOrder();
				
			}
			
		});
		
		this.add(orderButton);
		
		JButton receiptButton = new JButton("Saņemt čeku");
		receiptButton.setBounds(180, 90, 110, 25);
		receiptButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				maneger.showReceipt();
				
			}
			
		});
		this.add(receiptButton);
		
		JButton receiptOrderButton = new JButton("Pasūtijumi");
		receiptOrderButton.setBounds(40, 160, 110, 25);
		receiptOrderButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				maneger.showReceiptOrder();
				
			}
			
		});
		this.add(receiptOrderButton);
		
		JButton registerButton = new JButton("Reģistrēties");
		registerButton.setBounds(180, 160, 110, 25);
		registerButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				maneger.showRegister();
				
			}
			
		});
		this.add(registerButton);
		
		
	}
}
