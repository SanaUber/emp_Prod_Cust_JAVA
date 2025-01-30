package employee;
import employee.Config;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Label;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.TextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Choice;
import java.awt.List;
import javax.swing.table.DefaultTableModel;
import java.awt.ScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class swing2customer {

	public JFrame frame;
	private JTextField textField;
	private JTextField txtCustomer;
	private JTable Customer_details_table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing2customer window = new swing2customer();
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
	public swing2customer() {
		initialize();
		show_customer_details();
	}

	
	
	public ArrayList<Customer_details> CustomerList()
	{
		ArrayList<Customer_details> CustomerList=new ArrayList<>();
	
	

	 try(Connection connection = DriverManager.getConnection(Config.JDBC_URL);)
    
    {
	      System.out.println("Connected customer ");
    
    String selectQ="Select* from Customer_details";
    Statement stselect= connection.createStatement();
   
    ResultSet rsselect=stselect.executeQuery(selectQ);
    Customer_details  Customer_details;
    while(rsselect.next())
    {      Customer_details=new Customer_details(rsselect.getInt("Customer_id"),rsselect.getString("Customer_Name"),
    		rsselect.getString("Customer_phone"),rsselect.getString("Customer_Paytype"),
    		rsselect.getInt("Customer_salesinvoiceid"),rsselect.getInt("Customer_TRN"),
    		
    		
    		rsselect.getString("Customer_Address")
    		);
    
    
              CustomerList.add(Customer_details);
    }
    
    	
    
    	
    
    
    
    
    
    
    
    
//connection.close();
      
    }

    catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null,e);
    }
return CustomerList;
	
	
	
	
	
		
	

  
	}
	public void show_customer_details()
	{
		
		ArrayList<Customer_details> list=CustomerList();
	
		DefaultTableModel modelproduct=(DefaultTableModel) Customer_details_table.getModel();
		int i=0;
		Object[] row=new Object[9];
		
		
		for(i=0;i<list.size();i++)
{			row[0]=list.get(i).getCustomer_id();
	        row[1]=list.get(i).getCustomer_Name();
			row[2]=list.get(i).getCustomer_phone();
			row[3]=list.get(i).getCustomer_Paytype();
			row[4]=list.get(i).getCustomer_salesinvoiceid();
			row[5]=list.get(i).getCustomer_Address();
			row[6]=list.get(i).getCustomer_TRN();
			
			modelproduct.addRow(row);
		}
	}
	
	
	
	
	
	
	
	

	private void setRowCount(int i) {
		// TODO Auto-generated method stub
		
	}

		
	
		
	

  
	
	
	
	
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(new Color(0, 204, 153));
		frame.setBounds(100, 100, 1048, 463);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label Customer_Details_label = new Label("Customer Details");
		Customer_Details_label.setBounds(0, 0, 1039, 28);
		Customer_Details_label.setForeground(Color.WHITE);
		Customer_Details_label.setFont(new Font("Dialog", Font.BOLD, 17));
		Customer_Details_label.setBackground(new Color(0, 206, 209));
		frame.getContentPane().add(Customer_Details_label);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 291, 730, 1);
		panel.setBackground(new Color(127, 255, 212));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		TextField Product_CodetextField = new TextField();
		Product_CodetextField.setBounds(136, 28, 62, 22);
		panel.add(Product_CodetextField);
		
		TextField Product_SLtextField = new TextField();
		Product_SLtextField.setBounds(136, 0, 62, 22);
		Product_SLtextField.setEnabled(false);
		Product_SLtextField.setEditable(false);
		panel.add(Product_SLtextField);
		
		TextField Product_Discriptiontextfield = new TextField();
		Product_Discriptiontextfield.setBounds(136, 57, 62, 22);
		panel.add(Product_Discriptiontextfield);
		
		TextField Product_UnittextField = new TextField();
		Product_UnittextField.setBounds(339, 0, 62, 22);
		panel.add(Product_UnittextField);
		
		TextField Product_LOCtextField = new TextField();
		Product_LOCtextField.setBounds(339, 28, 62, 22);
		panel.add(Product_LOCtextField);
		
		TextField Product_QuantitytextField = new TextField();
		Product_QuantitytextField.setBounds(339, 57, 62, 22);
		panel.add(Product_QuantitytextField);
		
		TextField Product_TaxtextField = new TextField();
		Product_TaxtextField.setBounds(543, 50, 62, 22);
		panel.add(Product_TaxtextField);
		
		TextField Product_RatetextField = new TextField();
		Product_RatetextField.setBounds(543, 10, 62, 22);
		panel.add(Product_RatetextField);
		
		Label Product_Ratelabel = new Label("Product_Rate");
		Product_Ratelabel.setBounds(436, 10, 101, 22);
		Product_Ratelabel.setForeground(Color.WHITE);
		Product_Ratelabel.setFont(new Font("Dialog", Font.BOLD, 13));
		panel.add(Product_Ratelabel);
		
		Label Product_Taxlabel = new Label("Product_Tax");
		Product_Taxlabel.setBounds(436, 50, 101, 22);
		Product_Taxlabel.setForeground(Color.WHITE);
		Product_Taxlabel.setFont(new Font("Dialog", Font.BOLD, 13));
		panel.add(Product_Taxlabel);
		
		Label Product_Quantitytlabel = new Label("Product_Quantity");
		Product_Quantitytlabel.setBounds(213, 57, 120, 22);
		Product_Quantitytlabel.setForeground(Color.WHITE);
		Product_Quantitytlabel.setFont(new Font("Dialog", Font.BOLD, 13));
		panel.add(Product_Quantitytlabel);
		
		Label Product_LOClabel = new Label("Product LOC");
		Product_LOClabel.setBounds(213, 29, 101, 22);
		Product_LOClabel.setForeground(Color.WHITE);
		Product_LOClabel.setFont(new Font("Dialog", Font.BOLD, 13));
		panel.add(Product_LOClabel);
		
		Label Product_Unitlabel = new Label("Product Unit");
		Product_Unitlabel.setBounds(208, 0, 101, 22);
		Product_Unitlabel.setForeground(Color.WHITE);
		Product_Unitlabel.setFont(new Font("Dialog", Font.BOLD, 13));
		panel.add(Product_Unitlabel);
		
		Label Product_Discriptionlabel = new Label("Product Discription");
		Product_Discriptionlabel.setBounds(9, 57, 121, 22);
		Product_Discriptionlabel.setForeground(Color.WHITE);
		Product_Discriptionlabel.setFont(new Font("Dialog", Font.BOLD, 13));
		panel.add(Product_Discriptionlabel);
		
		Label Product_Codelabel = new Label("Product Code");
		Product_Codelabel.setBounds(9, 29, 101, 22);
		Product_Codelabel.setForeground(Color.WHITE);
		Product_Codelabel.setFont(new Font("Dialog", Font.BOLD, 13));
		panel.add(Product_Codelabel);
		
		Label Product_SLlabel = new Label("Product SL#");
		Product_SLlabel.setBounds(9, 0, 101, 22);
		Product_SLlabel.setForeground(Color.WHITE);
		Product_SLlabel.setFont(new Font("Dialog", Font.BOLD, 13));
		panel.add(Product_SLlabel);
		
		textField = new JTextField();
		textField.setBounds(846, 0, 193, 82);
		textField.setText("Product Tax Amount");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(224, 255, 255));
		panel.add(textField);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 28, 1039, 82);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(127, 255, 212));
		frame.getContentPane().add(panel_1);
		
		TextField Customer_id_textField = new TextField();
		Customer_id_textField.setEnabled(false);
		Customer_id_textField.setEditable(false);
		Customer_id_textField.setBounds(123, 10, 101, 22);
		panel_1.add(Customer_id_textField);
		
		TextField Customer_NameTextField = new TextField();
		Customer_NameTextField.setBounds(123, 57, 101, 22);
		panel_1.add(Customer_NameTextField);
		
		TextField Customer_PhoneTextField = new TextField();
		Customer_PhoneTextField.setBounds(414, 0, 80, 22);
		panel_1.add(Customer_PhoneTextField);
		
		TextField Customer_Salesinvoice_id_TextField = new TextField();
		Customer_Salesinvoice_id_TextField.setBounds(426, 57, 68, 22);
		panel_1.add(Customer_Salesinvoice_id_TextField);
		
		TextField Customer_TRN_TextField = new TextField();
		Customer_TRN_TextField.setBounds(629, 38, 62, 22);
		panel_1.add(Customer_TRN_TextField);
		
		TextField Customer_Address_TextField = new TextField();
		Customer_Address_TextField.setBounds(629, 10, 169, 22);
		panel_1.add(Customer_Address_TextField);
		
		Label Customer_Address_label = new Label("Customer Address");
		Customer_Address_label.setForeground(Color.WHITE);
		Customer_Address_label.setFont(new Font("Dialog", Font.BOLD, 13));
		Customer_Address_label.setBounds(500, 10, 123, 22);
		panel_1.add(Customer_Address_label);
		
		Label Customer_TRN_label = new Label("Customer TRN");
		Customer_TRN_label.setForeground(Color.WHITE);
		Customer_TRN_label.setFont(new Font("Dialog", Font.BOLD, 13));
		Customer_TRN_label.setBounds(500, 38, 101, 22);
		panel_1.add(Customer_TRN_label);
		
		Label Customer_Salesinvoice_id_label = new Label("Customer Sales invoice id#");
		Customer_Salesinvoice_id_label.setForeground(Color.WHITE);
		Customer_Salesinvoice_id_label.setFont(new Font("Dialog", Font.BOLD, 13));
		Customer_Salesinvoice_id_label.setBounds(248, 57, 191, 22);
		panel_1.add(Customer_Salesinvoice_id_label);
		
		Label Customer_Paytype_label = new Label("Customer Paytype");
		Customer_Paytype_label.setForeground(Color.WHITE);
		Customer_Paytype_label.setFont(new Font("Dialog", Font.BOLD, 13));
		Customer_Paytype_label.setBounds(248, 28, 123, 22);
		panel_1.add(Customer_Paytype_label);
		
		Label Customer_Phonelabel = new Label("Customer Phone");
		Customer_Phonelabel.setForeground(Color.WHITE);
		Customer_Phonelabel.setFont(new Font("Dialog", Font.BOLD, 13));
		Customer_Phonelabel.setBounds(248, 0, 116, 22);
		panel_1.add(Customer_Phonelabel);
		
		Label Customer_Namelabel = new Label("Customer Name");
		Customer_Namelabel.setForeground(Color.WHITE);
		Customer_Namelabel.setFont(new Font("Dialog", Font.BOLD, 13));
		Customer_Namelabel.setBounds(9, 57, 121, 22);
		panel_1.add(Customer_Namelabel);
		
		Label Customer_id_label = new Label("Customer ID");
		Customer_id_label.setForeground(Color.WHITE);
		Customer_id_label.setFont(new Font("Dialog", Font.BOLD, 13));
		Customer_id_label.setBounds(9, 10, 121, 22);
		panel_1.add(Customer_id_label);
		
		txtCustomer = new JTextField();
		txtCustomer.setText("Customer's Name");
		txtCustomer.setHorizontalAlignment(SwingConstants.CENTER);
		txtCustomer.setForeground(Color.BLACK);
		txtCustomer.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtCustomer.setEnabled(false);
		txtCustomer.setEditable(false);
		txtCustomer.setColumns(10);
		txtCustomer.setBackground(new Color(224, 255, 255));
		txtCustomer.setBounds(846, 0, 193, 82);
		panel_1.add(txtCustomer);
		
		JComboBox paytypecombo = new JComboBox();
		paytypecombo.setFont(new Font("Tahoma", Font.BOLD, 9));
		paytypecombo.setBackground(Color.WHITE);
		paytypecombo.setModel(new DefaultComboBoxModel(new String[] {"cash", "credit"}));
		paytypecombo.setBounds(424, 28, 70, 22);
		panel_1.add(paytypecombo);
		
		JButton enter_Customer_id = new JButton("Add");
		enter_Customer_id.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				
				
					if(Customer_NameTextField.getText().equals("")||
							Customer_PhoneTextField.getText().equals("")||paytypecombo.getSelectedItem().equals("")||Customer_Salesinvoice_id_TextField.getText().equals("")||
									Customer_Address_TextField.getText().equals("")||Customer_TRN_TextField.getText().equals("")) {
						
						
						
						JOptionPane.showMessageDialog(null,"Please  fill the form completely");
					}
					else {
				
				
				
				
				
				
				
				
				
				
				 	
				
				 try(Connection connection = DriverManager.getConnection(Config.JDBC_URL);)
				 { String  addQ="INSERT INTO Customer_details "
						
							
							//+ "(Customer_id,"
							+ "(Customer_Name,"
							+ "Customer_phone,"
							+ "Customer_paytype,"
							+ "Customer_salesinvoiceid,"
							+ "Customer_Address,"
							+ "Customer_TRN)"
						//	
							+ "Values(?,?,?,?,?,?)";
				try (PreparedStatement preparedStmt = connection.prepareStatement(addQ/*,Statement.RETURN_GENERATED_KEYS*/))
				{
				  System.out.println("Connectedcustomer ");
				  
					
					ArrayList<Customer_details> list=CustomerList();
				
					
					int i=list.size();

					System.out.println("PPPPPPPPPPP"+i);
					    
						
						          
				Object[] columns={"Customer_id", "Customer_Name", "Customer_phone", "Customer_paytype", "Customer_salesinvoiceid",
						"Customer_Address", "Customer_TRN"};
				Object[] row=new Object[8];
				DefaultTableModel modelcustomer=(DefaultTableModel) Customer_details_table.getModel();

				modelcustomer.setColumnIdentifiers(columns);
             
               System.out.println("  .............  "+i);
               
               String z=String.valueOf(i);
           
			   
               System.out.println("  .............  "+z);
               
               
             
              Customer_id_textField.setText(i+"");
            
              //Customer_id_textField.getText();
           	System.out.println("add"+Customer_id_textField.getText());
         //  preparedStmt.setString(1,Customer_id_textField.getText());
			 preparedStmt.setString (1, (String) (row[0]=Customer_NameTextField.getText()));
				 preparedStmt.setString (2,(String)(row[1]=Customer_PhoneTextField.getText()));
				preparedStmt.setString(3,(String) (row[2]=paytypecombo.getSelectedItem()));
				preparedStmt.setInt (4,Integer.parseInt((String)(row[3]=Customer_Salesinvoice_id_TextField.getText())));
				preparedStmt.setString (5,((String)(row[4]=Customer_Address_TextField.getText())));
				preparedStmt.setInt  (6,Integer.parseInt((String)(row[5]=Customer_TRN_TextField.getText())));
				
			
				
	
				modelcustomer.addRow(row);

			preparedStmt.executeUpdate();


			modelcustomer.setRowCount(0);
		 
				show_customer_details();
				
				}
				catch (Exception e)
						{
					e.printStackTrace();
			        JOptionPane.showMessageDialog(null,e);
						}
				
				 }
				 catch (Exception e)
					{
					 e.printStackTrace();
				        JOptionPane.showMessageDialog(null,e);
					}
					}
			}

			
		});
		enter_Customer_id.setVerticalAlignment(SwingConstants.TOP);
		enter_Customer_id.setToolTipText("add this record of the product");
		enter_Customer_id.setForeground(Color.WHITE);
		enter_Customer_id.setFont(new Font("Dialog", Font.BOLD, 15));
		enter_Customer_id.setBackground(Color.BLACK);
		enter_Customer_id.setAlignmentX(1.0f);
		enter_Customer_id.setBounds(883, 183, 98, 29);
		frame.getContentPane().add(enter_Customer_id);
		
		JButton delete_customer_record = new JButton("Delete");
		delete_customer_record.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			
			
			
			
			
				int row=Customer_details_table.getSelectedRow();

				DefaultTableModel modelproduct=(DefaultTableModel) Customer_details_table.getModel();	
			 		String value=(Customer_details_table.getModel().getValueAt(row,0).toString());
				
		
				
				if(row>=0)
				{ try(Connection connection = DriverManager.getConnection(Config.JDBC_URL);)
					 { /*String  deleteQ="DELETE * FROM Product_details "
					 		+ " WHERE Product_SL=?"+value;*/
						 		   
						 		
					
					
					
					Statement stmt=connection.createStatement();
					stmt.execute("DELETE FROM Customer_details "
					 		+ " WHERE Customer_id="+Customer_id_textField.getText()+"");  
				
	
					modelproduct.removeRow(row);
					JOptionPane.showMessageDialog(delete_customer_record, "Deleted record was at serial no. " +Customer_id_textField.getText());
					// JOptionPane.showMessageDialog(null, "Record is deleted...");  
				        stmt.close();  
				        connection.close();
				        modelproduct.setRowCount(0);
					show_customer_details();
					
						
					 }
				catch(Exception e2){e2.printStackTrace();
				JOptionPane.showMessageDialog(delete_customer_record, "Customer Id is presnt in the sales invoice details");}
				
					
					
				
				}
				else
					JOptionPane.showMessageDialog(delete_customer_record, "Please select coorrectly to delete");
			
	
			
			
			
			
			
			
			}
		});
		delete_customer_record.setVerticalAlignment(SwingConstants.TOP);
		delete_customer_record.setToolTipText("add this record of the product");
		delete_customer_record.setForeground(Color.WHITE);
		delete_customer_record.setFont(new Font("Dialog", Font.BOLD, 15));
		delete_customer_record.setBackground(Color.BLACK);
		delete_customer_record.setAlignmentX(1.0f);
		delete_customer_record.setBounds(883, 234, 98, 29);
		frame.getContentPane().add(delete_customer_record);
		
		JButton update_customer_record = new JButton("Update");
		update_customer_record.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				DefaultTableModel modelproduct=(DefaultTableModel) Customer_details_table.getModel();	
				 				try 
								( Connection connection = DriverManager.getConnection(Config.JDBC_URL);)

								{	
								      
								
								
								
						
								
							    
							      		
								 	
							    
							            
				                     
						         Statement  Stmt = connection.createStatement();
						         Stmt.execute("Update Customer_details set Customer_Name='"
							    		  +Customer_NameTextField.getText()+"',Customer_phone='"
							    		  
								    		 
				                    +Customer_PhoneTextField.getText() +"',Customer_Paytype='"
				         +paytypecombo.getSelectedItem()+"',Customer_salesinvoiceid='"+Customer_Salesinvoice_id_TextField.getText()
							    		  +"',Customer_Address='"+ Customer_Address_TextField.getText()+"',Customer_TRN='"+Customer_TRN_TextField.getText()
							      		+ "'Where Customer_id="+Customer_id_textField.getText() +" ");
						        	 
						        	 
						        	 
						        	 
						        	 
						        	 
						        	 
						        	 
						        	 
						        	 
						        	 
						        	 
						        	 
						         							
										 modelproduct.setRowCount(0);
											show_customer_details();

										 JOptionPane.showMessageDialog(	update_customer_record, "success in updation");
										 connection.close();	
										
								}
							  catch(Exception e2)
				            {e2.printStackTrace();
				         	   JOptionPane.showMessageDialog(	update_customer_record, "Please select to update");
				            }
							
					} 
								 
								 
								 
								 
								 
						
								

				
				
				
				
				
				
				
				
				
				
				
				
			
		});
		update_customer_record.setVerticalAlignment(SwingConstants.TOP);
		update_customer_record.setToolTipText("add this record of the product");
		update_customer_record.setForeground(Color.WHITE);
		update_customer_record.setFont(new Font("Dialog", Font.BOLD, 15));
		update_customer_record.setBackground(Color.BLACK);
		update_customer_record.setAlignmentX(1.0f);
		update_customer_record.setBounds(883, 289, 98, 29);
		frame.getContentPane().add(update_customer_record);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0), 2));
		scrollPane.setBounds(-2, 110, 850, 314);
		frame.getContentPane().add(scrollPane);
		
		Customer_details_table = new JTable();
		Customer_details_table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				try {	
					
					
					DefaultTableModel modelcustomer=(DefaultTableModel) Customer_details_table.getModel();	

					
					
						
						int i= Customer_details_table.getSelectedRow();
						System.out.println("dddd"+i);
						Customer_id_textField.setText(modelcustomer.getValueAt(i,0).toString());
						Customer_NameTextField.setText(modelcustomer.getValueAt(i,1).toString());
						Customer_PhoneTextField.setText(modelcustomer.getValueAt(i,2).toString());
						String paytype=modelcustomer.getValueAt(i,3).toString();
						
						switch(paytype) {
						case"cash":paytypecombo.setSelectedIndex(0);
						break;
						case"credit":paytypecombo.setSelectedIndex(1);
						break;
						
						}
						//paytypecombo.se
						Customer_Salesinvoice_id_TextField.setText(modelcustomer.getValueAt(i,4).toString());
						Customer_Address_TextField.setText(modelcustomer.getValueAt(i,5).toString());
						Customer_TRN_TextField.setText(modelcustomer.getValueAt(i,6).toString());
						txtCustomer.setText(Customer_NameTextField.getText());
				
						
					}
				
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(	Customer_details_table,"Please click on the table");
				}
			}
		});
		scrollPane.setViewportView(Customer_details_table);
		Customer_details_table.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		Customer_details_table.setFillsViewportHeight(true);
		Customer_details_table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"customer_id", "Customer_Name", "Customer_phone", "Customer_Paytype", "Customer_salesinvoiceid", "Customer_Address", "Customer_TRN"
			}
		));
		
		JButton back = new JButton("Back");
		swing mainpage = new swing();
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 mainpage.frame.setVisible(true);
					frame.dispose();
					
				
			}
		});
		back.setVerticalAlignment(SwingConstants.TOP);
		back.setToolTipText("delete the selected record");
		back.setForeground(Color.WHITE);
		back.setFont(new Font("Dialog", Font.BOLD, 15));
		back.setBackground(Color.BLACK);
		back.setAlignmentX(1.0f);
		back.setBounds(883, 346, 98, 29);
		frame.getContentPane().add(back);
	}
}
