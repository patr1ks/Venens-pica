package UI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class Receipt extends JPanel {
	
	Maneger maneger;
	Receipt(Maneger maneger){
		this.revalidate();
		this.repaint();
		this.maneger = maneger;
		this.setLayout(null);
		
		JPanel panel= new JPanel();
		JTextArea text = new JTextArea();
		JTextArea text2 = new JTextArea();
		text.setLineWrap(true);
		text.setEditable(false);
	
		panel.setMaximumSize(new Dimension (150, 200));
		panel.setBorder(new LineBorder(new Color(0, 0, 0),2, false));
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		panel.setAlignmentX(Component.CENTER_ALIGNMENT);
		JButton backButton  = new JButton("Atpakaļ");
		backButton.setBounds(210, 270, 80, 25);
		backButton.setAlignmentX(Component.CENTER_ALIGNMENT );
		
		
		
		
		String pizzas= "";
		String toppings= "";
		for(int i=0;i<maneger.PizzaList.size();i++) {
			double priceP =maneger.PizzaList.get(i).getPrice();
			int countP=maneger.PizzaList.get(i).getCount();
			double sumP = priceP*countP;
			
			pizzas+=maneger.PizzaList.get(i).getName()+" "+maneger.PizzaList.get(i).getCount()+" x "+sumP+"\n";
			
			text.setAlignmentX(Component.CENTER_ALIGNMENT);
			for(int j=0;j<maneger.ToppingList.size();j++) {
				double priceT =maneger.ToppingList.get(j).getPrice();
				int countT=maneger.ToppingList.get(j).getCount();
				double sumT = priceT*countT;
				
				toppings+=maneger.ToppingList.get(j).getName()+" "+maneger.ToppingList.get(j).getCount()+" x "+sumT+"\n";
				text.setAlignmentX(Component.CENTER_ALIGNMENT);
			}
			}
		text.setText(pizzas);
		text2.setText(toppings);
		panel.add(text);
		panel.add(text2);
		
		/*for(int i=0;i<maneger.ToppingList.size();i++) {
			double priceT =maneger.ToppingList.get(i).getPrice();
			int countT=maneger.ToppingList.get(i).getCount();
			double sumT = priceT*countT;
			
			toppings+=maneger.ToppingList.get(i).getName()+" "+maneger.ToppingList.get(i).getCount()+" x "+sumT+"\n";
			text.setAlignmentX(Component.CENTER_ALIGNMENT);
		}
		text.setText(toppings);
		panel.add(text);*/
		
		backButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				maneger.showMainMenu();
				
			}
			
		});
		add(panel);
		add(backButton);
		
		
	}
}


