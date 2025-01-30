package employee;
import employee.Config;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.SwingConstants;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing1andhalfprod {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing1andhalfprod window = new swing1andhalfprod();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public swing1andhalfprod() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		Label query = new Label("To view Product's detail");
		query.setAlignment(Label.CENTER);
		query.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		query.setForeground(Color.BLACK);
		query.setBackground(Color.WHITE);
		query.setBounds(31, 10, 269, 32);
		frame.getContentPane().add(query);
		
		JRadioButtonMenuItem viewProductdatabase = new JRadioButtonMenuItem("To view all products details");
		JRadioButtonMenuItem TogetProductID = new JRadioButtonMenuItem("To get a specic product's detail");
		viewProductdatabase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(viewProductdatabase.isSelected())
				{
					TogetProductID.setSelected(false);
					
				}
				if(TogetProductID.isSelected())
				{
					viewProductdatabase.setSelected(false);
					
				}
			}
		});
		viewProductdatabase.setHorizontalAlignment(SwingConstants.CENTER);
		viewProductdatabase.setBackground(Color.WHITE);
		viewProductdatabase.setBounds(69, 48, 215, 26);
		frame.getContentPane().add(viewProductdatabase);
		
		
		TogetProductID.setHorizontalAlignment(SwingConstants.TRAILING);
		TogetProductID.setBackground(Color.WHITE);
		TogetProductID.setBounds(69, 69, 231, 26);
		frame.getContentPane().add(TogetProductID);
		
		Button viewProductdatabasebutton = new Button("Enter");
		viewProductdatabasebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		viewProductdatabasebutton.setFont(new Font("Dialog", Font.PLAIN, 12));
		viewProductdatabasebutton.setForeground(Color.WHITE);
		viewProductdatabasebutton.setBackground(Color.BLACK);
		viewProductdatabasebutton.setBounds(101, 117, 70, 26);
		frame.getContentPane().add(viewProductdatabasebutton);
		
		Button cancelviewProductdatabasebutton = new Button("Cancel");
		cancelviewProductdatabasebutton.setForeground(Color.WHITE);
		cancelviewProductdatabasebutton.setFont(new Font("Dialog", Font.PLAIN, 12));
		cancelviewProductdatabasebutton.setBackground(Color.BLACK);
		cancelviewProductdatabasebutton.setBounds(214, 117, 70, 26);
		frame.getContentPane().add(cancelviewProductdatabasebutton);
		frame.setBounds(100, 100, 414, 206);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
