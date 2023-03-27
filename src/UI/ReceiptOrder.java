package UI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ReceiptOrder extends JPanel {
	Maneger maneger;
	ReceiptOrder(Maneger maneger){
		this.maneger = maneger;
		this.setLayout(null);
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
