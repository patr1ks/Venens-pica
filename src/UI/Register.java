package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Register extends JPanel {
	Maneger maneger;

	Register(Maneger maneger) {
		this.maneger = maneger;
		this.setLayout(null);
		JLabel userLabel1 = new JLabel("Vārds");
		userLabel1.setBounds(10,50,80,25);
		this.add(userLabel1);
		
		JLabel userLabel2 = new JLabel("Epasta adrese");
		userLabel2.setBounds(10,80,110,25);
		this.add(userLabel2);
		
		JLabel userLabel3 = new JLabel("Telefona Nr.");
		userLabel3.setBounds(10,110,80,25);
		this.add(userLabel3);
		
		JTextField name = new JTextField(20);
		name.setBounds(100,50,165,25);
		this.add(name);
		name.getText();
		
		
		JTextField email = new JTextField(50);
		email.setBounds(100,80,165,25);
		this.add(email);
		email.getText();
		
		JTextField Nr = new JTextField(20);
		Nr.setBounds(100,110,165,25);
		this.add(Nr);
		Nr.getText();
		
		JButton loginButton = new JButton("Reģistrēties");
		loginButton.setBounds(10, 160, 110, 25);
		loginButton.addActionListener(new ActionListener(){
				
			@Override
			public void actionPerformed(ActionEvent e) {
				maneger.showMainMenu();
				/*Client client = new Client(name.getText(), email.getText(), Nr.getText());
				client.getName();
				client.getEmail();
				client.getNumber();*/
				
			}
			
		});
		this.add(loginButton);
		
		JButton backButton  = new JButton("Atpakaļ");
		backButton.setBounds(130, 160, 80, 25);
		backButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				maneger.showMainMenu();
				
			}
			
		});
		this.add(backButton);
		
		JButton listButt = new JButton("Klienti");
		listButt.setBounds(220, 160, 80, 25);
		listButt.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				maneger.showMainMenu();
				
			}
			
		});
		this.add(listButt);
    }
}
