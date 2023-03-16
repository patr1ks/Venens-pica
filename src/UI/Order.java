package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Order extends JPanel {
	Maneger maneger;
	int x=0, y=0, z=0;
	double a=9.5,b=8.3,c=7.5;
	Order(Maneger maneger){
		
		this.maneger = maneger;
		this.setLayout(null);
		
		JButton pica1Button= new JButton("Peperoni ("+a+"$)");
		pica1Button.setBounds(20, 50, 150, 25);
		pica1Button.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == pica1Button) {
					x++;
					pica1Button.setText("Peperoni ("+a+"$) "+x);
					pica1Button.revalidate();
						
				}
				
			}
			
		});
		this.add(pica1Button);
		
		JButton pica2Button = new JButton("Četru sieru ("+b+"$)");
		pica2Button.setBounds(20, 100, 150, 25);
		pica2Button.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == pica2Button) {
					y++;
					pica2Button.setText("Četru sieru ("+b+"$) "+y);
					pica2Button.revalidate();
						
				}
				
			}
			
		});
		this.add(pica2Button);
		
		JButton pica3Button = new JButton("Havaju ("+c+"$)");
		pica3Button.setBounds(20, 150, 150, 25);
		pica3Button.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == pica3Button) {
					z++;
					pica3Button.setText("Havaju ("+b+"$) "+z);
					pica3Button.revalidate();
						
				}
				
			}
			
		});
		this.add(pica3Button);
		
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
