package employee;

import java.awt.EventQueue;
import employee.Config;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Canvas;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Component;
import java.awt.Label;
import java.awt.Button;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import java.awt.Dimension;

public class swing extends JFrame{

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing window = new swing();
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
	public swing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(300, 100, 763, 526);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton Customer_details = new JRadioButton("CUSTOMER DETAILS");
		JRadioButton Product_Detail = new JRadioButton("PRODUCT DETAILS");
		JRadioButton Sale_invoice_detail = new JRadioButton("SALE INVOICE");
		Sale_invoice_detail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(Sale_invoice_detail.isSelected())
				{
					Customer_details.setSelected(false);
					 Product_Detail.setSelected(false);
				}
			}
		});
		Product_Detail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(Product_Detail.isSelected())
				{
					Customer_details.setSelected(false);
					Sale_invoice_detail.setSelected(false);
				
				}
				
				
				
				
			}
		});
		
		Customer_details.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Customer_details.isSelected())
				{
					Product_Detail.setSelected(false);
					Sale_invoice_detail.setSelected(false);
					
				}
			}
		});
		Customer_details.setBackground(Color.WHITE);
		Customer_details.setBounds(120, 94, 180, 23);
		frame.getContentPane().add(Customer_details);
		
		
		Product_Detail.setBackground(Color.WHITE);
		Product_Detail.setBounds(122, 120, 141, 23);
		frame.getContentPane().add(Product_Detail);
		
		
		Sale_invoice_detail.setBackground(Color.WHITE);
		Sale_invoice_detail.setBounds(122, 146, 109, 23);
		frame.getContentPane().add(Sale_invoice_detail);
		
		Label label = new Label("SELECT ONE");
		label.setBounds(100, 66, 186, 22);
		frame.getContentPane().add(label);
		
		Button button = new Button("Enter");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 swing2prod prod=new swing2prod();
			 swing2customer customer=new swing2customer();
			 swing2salesinvoice salesinvoice=new swing2salesinvoice();
				if(Customer_details.isSelected())
				{
					System.out.println("You  selected Customer details");
					
					customer.frame.setVisible(true);
					frame.dispose();
					
					
				}
				if( Product_Detail.isSelected())
				{
					System.out.println("You  selected Product details");
					
					
					prod.frame.setVisible(true);
					frame.dispose();
					
					
					
				}if(Sale_invoice_detail.isSelected())
				{
					System.out.println("You  selected Sale-invoice details");
					salesinvoice.frame.setVisible(true);
					frame.dispose();
					
				}
				
					
			}
		});
		button.setFont(new Font("Dialog", Font.BOLD, 15));
		button.setForeground(SystemColor.text);
		button.setBackground(SystemColor.inactiveCaptionText);
		button.setBounds(230, 243, 200, 43);
		frame.getContentPane().add(button);
	}
}
