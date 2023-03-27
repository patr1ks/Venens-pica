package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Main.PizzaTypes;

public class Order extends JPanel {
	Maneger maneger;
	
	double Pp=9.5,Cs=8.3,H=7.5;
	Order(Maneger maneger){
		
		this.maneger = maneger;
		this.setLayout(null);
		
		
		JTextField count = new JTextField(20);
		count.setBounds(150,50,30,25);
		this.add(count);
		count.getText();
		
		JButton Peperoni= new JButton("Peperoni "+Pp+"$");
		Peperoni.setBounds(20, 50, 125, 25);
		Peperoni.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == Peperoni) {
					PizzaTypes pizzaTypes = new PizzaTypes("Peperoni", 9.5, Integer.parseInt(count.getText()));
					maneger.PizzaList.add(pizzaTypes);
					System.out.println(maneger.PizzaList.size());
						
				}
				
			}
			
		});
		this.add(Peperoni);
		
		JTextField count2 = new JTextField(20);
		count2.setBounds(150,100,30,25);
		this.add(count2);
		count2.getText();
		
		JButton Cheese = new JButton("Četru sieru "+Cs+"$");
		Cheese.setBounds(20, 100, 125, 25);
		Cheese.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == Cheese) {
					PizzaTypes pizzaTypes = new PizzaTypes("Četru sieru", 8.3, Integer.parseInt(count2.getText()));
					maneger.PizzaList.add(pizzaTypes);
				}
				
			}
			
		});
		this.add(Cheese);
		
		JTextField count3 = new JTextField(20);
		count3.setBounds(150,150,30,25);
		this.add(count3);
		count3.getText();
		
		JButton Havaiian = new JButton("Havaju "+H+"$");
		Havaiian.setBounds(20, 150, 125, 25);
		Havaiian.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == Havaiian) {
					PizzaTypes pizzaTypes = new PizzaTypes("Havaju", 7.5, Integer.parseInt(count3.getText()));
					maneger.PizzaList.add(pizzaTypes);
				}
				
			}
			
		});
		this.add(Havaiian);
		
		JButton extraButton = new JButton("Extra piedevas");
		extraButton.setBounds(195, 50, 120, 25);
		extraButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				maneger.showToppings();
				
			}
			
		});
		this.add(extraButton);
		
		JButton backButton  = new JButton("Atpakaļ");
		backButton.setBounds(210, 270, 80, 25);
		backButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				maneger.showMainMenu();
				
			}
			
		});
		this.add(backButton);
	}
}
