package UI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Receipt extends JPanel {
	
	Maneger maneger;
	Receipt(Maneger maneger){
		this.revalidate();
		this.repaint();
		this.maneger = maneger;
		this.setLayout(null);
		JPanel panel= new JPanel();
		JLabel label = new JLabel();
	
		panel.setMaximumSize(new Dimension (150, 200));
		panel.setBorder(new LineBorder(new Color(0, 0, 0),2, false));
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		panel.setAlignmentX(Component.CENTER_ALIGNMENT);
		JButton backButton  = new JButton("Atpakaļ");
		backButton.setBounds(210, 270, 80, 25);
		backButton.setAlignmentX(Component.CENTER_ALIGNMENT );
		
		String str= "";
		for(int i=0;i<maneger.PizzaList.size();i++) {
			
			str+=maneger.PizzaList.get(i).getName()+" "+maneger.PizzaList.get(i).getCount()+" x \n";//+maneger.PizzaList.get(i).getName()+" "+maneger.PizzaList.get(i).getPrice()
			label.setAlignmentX(Component.CENTER_ALIGNMENT);
			}
		label.setText(str);
		panel.add(label);
		
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


