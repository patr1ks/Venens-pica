package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toppings extends JPanel {
	Maneger maneger;
	int a=0,b=0,c=0,d=0,f=0;
	double Ss=0.7, Sh=0.7, H=0.8, Cc=0.8, Ts=0.5;
	Toppings(Maneger maneger){
		this.maneger = maneger;
		this.setLayout(null);
		
		JButton toppButton1= new JButton("Sark. sīpoli ("+Ss+"$)");
		toppButton1.setBounds(5, 50, 160, 25);
		toppButton1.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == toppButton1) {
					a++;
					toppButton1.setText("Sark. sīpoli ("+Ss+"$) "+a);
					toppButton1.revalidate();
						
				}
				
			}
			
		});
		this.add(toppButton1);
		
		JButton toppButton2= new JButton("Šampinjoni ("+Sh+"$)");
		toppButton2.setBounds(5, 100, 160, 25);
		toppButton2.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == toppButton2) {
					b++;
					toppButton2.setText("Šampinjoni ("+Sh+"$) "+b);
					toppButton2.revalidate();
						
				}
				
			}
			
		});
		this.add(toppButton2);
		
		JButton toppButton3= new JButton("Halapenjo ("+H+"$)");
		toppButton3.setBounds(5, 150, 160, 25);
		toppButton3.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == toppButton3) {
					c++;
					toppButton3.setText("Halapenjo ("+H+"$) "+c);
					toppButton3.revalidate();
						
				}
				
			}
			
		});
		this.add(toppButton3);
		
		JButton toppButton4= new JButton("Čedara siers ("+Cc+"$)");
		toppButton4.setBounds(170, 50, 160, 25);
		toppButton4.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == toppButton4) {
					d++;
					toppButton4.setText("Čedara siers ("+Cc+"$) "+d);
					toppButton4.revalidate();
						
				}
				
			}
			
		});
		this.add(toppButton4);
		
		JButton toppButton5= new JButton("Tom. mērce ("+Ts+"$)");
		toppButton5.setBounds(170, 100, 160, 25);
		toppButton5.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == toppButton5) {
					f++;
					toppButton5.setText("Tom. mērce ("+Ts+"$) "+f);
					toppButton5.revalidate();
						
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
