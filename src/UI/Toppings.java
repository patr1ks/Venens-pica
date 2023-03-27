package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Main.ToppingTypes;

public class Toppings extends JPanel {
	Maneger maneger;
	
	double Ss=0.7, Sh=0.7, H=0.8, Cc=0.8, Ts=0.5;
	Toppings(Maneger maneger){
		this.maneger = maneger;
		this.setLayout(null);
		
		JTextField count = new JTextField(20);
		count.setBounds(135,50,30,25);
		this.add(count);
		count.getText();
		
		JButton toppButton1= new JButton("Sark. sīpoli "+Ss+"$");
		toppButton1.setBounds(5, 50, 125, 25);
		toppButton1.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == toppButton1) {
					ToppingTypes toppingTypes = new ToppingTypes("Sarkanie sīpoli", 0.7, Integer.parseInt(count.getText()));
					maneger.ToppingList.add(toppingTypes);
					System.out.println(maneger.ToppingList.size());
						
				}
				
			}
			
		});
		this.add(toppButton1);
		
		JTextField count2 = new JTextField(20);
		count2.setBounds(135,100,30,25);
		this.add(count2);
		count2.getText();
		
		JButton toppButton2= new JButton("Šampinjoni "+Sh+"$");
		toppButton2.setBounds(5, 100, 125, 25);
		toppButton2.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == toppButton2) {
					ToppingTypes toppingTypes = new ToppingTypes("Šampinjoni", 0.7, Integer.parseInt(count2.getText()));
					maneger.ToppingList.add(toppingTypes);
					System.out.println(maneger.ToppingList.size());
						
				}
				
			}
			
		});
		this.add(toppButton2);
		
		JTextField count3 = new JTextField(20);
		count3.setBounds(135,150,30,25);
		this.add(count3);
		count3.getText();
		
		
		JButton toppButton3= new JButton("Halapenjo "+H+"$");
		toppButton3.setBounds(5, 150, 125, 25);
		toppButton3.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == toppButton3) {
					ToppingTypes toppingTypes = new ToppingTypes("Halapenjo", 0.8, Integer.parseInt(count3.getText()));
					maneger.ToppingList.add(toppingTypes);
					System.out.println(maneger.ToppingList.size());
						
				}
				
			}
			
		});
		this.add(toppButton3);
		
		JTextField count4 = new JTextField(20);
		count4.setBounds(300,50,30,25);
		this.add(count4);
		count4.getText();
		
		JButton toppButton4= new JButton("Čedara s. "+Cc+"$");
		toppButton4.setBounds(170, 50, 125, 25);
		toppButton4.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == toppButton4) {
					ToppingTypes toppingTypes = new ToppingTypes("Čedara siers", 0.8, Integer.parseInt(count4.getText()));
					maneger.ToppingList.add(toppingTypes);
					System.out.println(maneger.ToppingList.size());
						
				}
				
			}
			
		});
		this.add(toppButton4);
		
		JTextField count5 = new JTextField(20);
		count5.setBounds(300,100,30,25);
		this.add(count5);
		count5.getText();
		
		JButton toppButton5= new JButton("Tom. mērc "+Ts+"$");
		toppButton5.setBounds(170, 100, 125, 25);
		toppButton5.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == toppButton5) {
					ToppingTypes toppingTypes = new ToppingTypes("Tomātu mērce", 0.5, Integer.parseInt(count5.getText()));
					maneger.ToppingList.add(toppingTypes);
					System.out.println(maneger.ToppingList.size());
						
				}
				
			}
			
		});
		this.add(toppButton5);
		
		JButton backButton  = new JButton("Atpakaļ");
		backButton.setBounds(210, 270, 80, 25);
		backButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				maneger.showOrder();
				
			}
			
		});
		this.add(backButton);
		
		JButton menuButton  = new JButton("Uz izvēlni");
		menuButton.setBounds(60, 270, 130, 25);
		menuButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				maneger.showMainMenu();
				
			}
			
		});
		this.add(menuButton);
	}
	

}
