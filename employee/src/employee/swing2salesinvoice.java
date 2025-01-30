package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Label;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.TextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class swing2salesinvoice {

	public JFrame frame;
	private JTextField textField;
	private JTextField Customer_ID;
	private JTable salesinvoice_details_table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing2salesinvoice window = new swing2salesinvoice();
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
	public swing2salesinvoice() {
		initialize();
		 show_salesinvoice_details();
	}
	public ArrayList<Salesinvoice_details> SalesinvoiceList()
	{
		ArrayList<Salesinvoice_details> SalesinvoiceList=new ArrayList<>();
	
	

	 try(Connection connection = DriverManager.getConnection(Config.JDBC_URL);)
    
    {
	      System.out.println("Co");
    
    String selectQ="Select* from sales_invoice_details";
    Statement stselect= connection.createStatement();
   
    ResultSet rsselect=stselect.executeQuery(selectQ);
    Salesinvoice_details Salesinvoice_details;
    while(rsselect.next())
    {       Salesinvoice_details=new Salesinvoice_details(rsselect.getInt("sales_invoice_id"),rsselect.getString("sales_invoice_deptt"),rsselect.getString("sales_invoice_date"),rsselect.getInt("sales_invoice_Customer_id"));
    	
    	
              SalesinvoiceList.add(Salesinvoice_details);
    }
    
    	
    
    	
    
    
    
    
    
    
    
    
connection.close();
      
    }

    catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null,e);
    }
return SalesinvoiceList;
	
	
	
	
	
		
	

  
	}
	public void show_salesinvoice_details()
	{
		
		ArrayList<Salesinvoice_details> list=SalesinvoiceList();
	
		DefaultTableModel modelsalesinvoice=(DefaultTableModel) salesinvoice_details_table.getModel();
		int i=0;
		Object[] row=new Object[4];
		
		System.out.println("showmj"+row[0]);
		for(i=0;i<list.size();i++)
{
			row[0]=list.get(i).getsales_invoice_id();
	        row[1]=list.get(i).getsales_invoice_deptt();
			row[2]=list.get(i).getsales_invoice_date();
			row[3]=list.get(i).getsales_invoice_Customer_id();
			
			
			modelsalesinvoice.addRow(row);
		}
	}
	
	
	
	
	
	
	
	

	private void setRowCount(int i) {
		// TODO Auto-generated method stub
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
		
	

  
	
	
	
	
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(0, 204, 153));
		frame.setBounds(100, 100, 1197, 463);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label Sales_invoice_details = new Label("Sales invoice details");
		Sales_invoice_details.setBounds(0, 0, 1182, 28);
		Sales_invoice_details.setForeground(Color.WHITE);
		Sales_invoice_details.setFont(new Font("Dialog", Font.BOLD, 17));
		Sales_invoice_details.setBackground(new Color(0, 206, 209));
		frame.getContentPane().add(Sales_invoice_details);
		
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
		panel_1.setBounds(0, 22, 1182, 82);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(127, 255, 212));
		frame.getContentPane().add(panel_1);
		
		TextField Sales_invoice_idtextfield = new TextField();
		Sales_invoice_idtextfield.setEnabled(false);
		Sales_invoice_idtextfield.setEditable(false);
		Sales_invoice_idtextfield.setBounds(123, 10, 101, 22);
		panel_1.add(Sales_invoice_idtextfield);
		
		TextField Sales_invoice_deptttextfield = new TextField();
		Sales_invoice_deptttextfield.setBounds(123, 57, 101, 22);
		panel_1.add(Sales_invoice_deptttextfield);
		
		TextField sales_invoice_Customer_idTextField = new TextField();
		sales_invoice_Customer_idTextField.setBounds(545, 57, 108, 22);
		panel_1.add(sales_invoice_Customer_idTextField);
		
		Label sales_invoice_Customer_idlabel = new Label("Sales invoice Customer id");
		sales_invoice_Customer_idlabel.setForeground(Color.WHITE);
		sales_invoice_Customer_idlabel.setFont(new Font("Dialog", Font.BOLD, 13));
		sales_invoice_Customer_idlabel.setBounds(340, 57, 182, 22);
		panel_1.add(sales_invoice_Customer_idlabel);
		
		Label Sales_invoice_datelabel = new Label("Sales invoice Date");
		Sales_invoice_datelabel.setForeground(Color.WHITE);
		Sales_invoice_datelabel.setFont(new Font("Dialog", Font.BOLD, 13));
		Sales_invoice_datelabel.setBounds(340, 10, 130, 22);
		panel_1.add(Sales_invoice_datelabel);
		
		Label Sales_invoice_depttlabel = new Label("Sales invoice deptt");
		Sales_invoice_depttlabel.setForeground(Color.WHITE);
		Sales_invoice_depttlabel.setFont(new Font("Dialog", Font.BOLD, 13));
		Sales_invoice_depttlabel.setBounds(9, 57, 121, 22);
		panel_1.add(Sales_invoice_depttlabel);
		
		Label Sales_invoice_idlabel = new Label("Sales invoice id");
		Sales_invoice_idlabel.setForeground(Color.WHITE);
		Sales_invoice_idlabel.setFont(new Font("Dialog", Font.BOLD, 13));
		Sales_invoice_idlabel.setBounds(9, 57, 121, 22);
		panel_1.add(Sales_invoice_idlabel);
		
		Customer_ID = new JTextField();
		Customer_ID.setText("Customer_ID");
		Customer_ID.setHorizontalAlignment(SwingConstants.CENTER);
		Customer_ID.setForeground(Color.BLACK);
		Customer_ID.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Customer_ID.setEnabled(false);
		Customer_ID.setEditable(false);
		Customer_ID.setColumns(10);
		Customer_ID.setBackground(new Color(224, 255, 255));
		Customer_ID.setBounds(979, 0, 203, 82);
		panel_1.add(Customer_ID);
		
		Label Sales_invoice_idlabel_1 = new Label("Sales invoice id");
		Sales_invoice_idlabel_1.setForeground(Color.WHITE);
		Sales_invoice_idlabel_1.setFont(new Font("Dialog", Font.BOLD, 13));
		Sales_invoice_idlabel_1.setBounds(9, 10, 121, 22);
		panel_1.add(Sales_invoice_idlabel_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(545, 10, 108, 20);
		panel_1.add(dateChooser);
		
		JButton sales_invoice_add = new JButton("Add");
		sales_invoice_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				 String date=sdf.format(dateChooser.getDate());
				 
				if(Sales_invoice_deptttextfield.getText().equals("")||
					date.equals("")) {
					
					JOptionPane.showMessageDialog(null,"Please  fill the form completely");
				}
				else {
			
			
			
			
			
			
			
			
			
			
		 	
			
			 try(Connection connection = DriverManager.getConnection(Config.JDBC_URL);)
			 { String  addQ="INSERT INTO sales_invoice_details "
					
						
					
						+ "(sales_invoice_deptt,"
						+ "sales_invoice_date,"
						+ "sales_invoice_Customer_id)"
						
					//	
						+ "Values(?,?,?)";
			try (PreparedStatement preparedStmt = connection.prepareStatement(addQ/*,Statement.RETURN_GENERATED_KEYS*/))
			{
			  System.out.println("Connectedcustomer ");
			  
				
				ArrayList<Salesinvoice_details> list=SalesinvoiceList();
			
				
				int i=list.size();

				System.out.println("PPPPPPPPPPP"+i);
				    
					
					          
			Object[] columns={"sales_invoice_id", "sales_invoice_deptt", "sales_invoice_date", "sales_invoice_Customer_id"};
			Object[] row=new Object[3];
			DefaultTableModel modelcustomer=(DefaultTableModel) salesinvoice_details_table.getModel();

			modelcustomer.setColumnIdentifiers(columns);
         
           System.out.println("  .............  "+i);
           
           String z=String.valueOf(i);
       
		   
           System.out.println("  .............  "+z);
           
           
         
          Sales_invoice_idtextfield.setText(i+"");
        
          Sales_invoice_idtextfield.getText();
      // 	System.out.println("add"+Customer_id_textField.getText());
       //	preparedStmt.setString(1,Customer_id_textField.getText());
		 preparedStmt.setString (1, (String) (row[0]=Sales_invoice_deptttextfield.getText()));
		
		 preparedStmt.setString (2,date);

			preparedStmt.setInt (3,Integer.parseInt((String)(row[2]=sales_invoice_Customer_idTextField.getText())));
			
			
			modelcustomer.addRow(row);

		preparedStmt.executeUpdate();

		modelcustomer.setRowCount(0);
	 
			show_salesinvoice_details();
			
			}
			catch (Exception e)
					{
				e.printStackTrace();
				
		        JOptionPane.showMessageDialog(null,"CUSTOMER ID NOT PRESNT");
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
		sales_invoice_add.setVerticalAlignment(SwingConstants.TOP);
		sales_invoice_add.setToolTipText("add this record of the product");
		sales_invoice_add.setForeground(Color.WHITE);
		sales_invoice_add.setFont(new Font("Dialog", Font.BOLD, 15));
		sales_invoice_add.setBackground(Color.BLACK);
		sales_invoice_add.setAlignmentX(1.0f);
		sales_invoice_add.setBounds(883, 183, 98, 29);
		frame.getContentPane().add(sales_invoice_add);
		
		JButton sales_invoice_delete = new JButton("Delete");
		sales_invoice_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel modelproduct=(DefaultTableModel) salesinvoice_details_table.getModel();	
				int row=salesinvoice_details_table.getSelectedRow();
			 	String value=(salesinvoice_details_table.getModel().getValueAt(row,0).toString());
				
				System.out.println("DeLETE");
				
				
				if(row>=0)
				{ try(Connection connection = DriverManager.getConnection(Config.JDBC_URL);)
					 { 
						 		   
					
					Statement stmt=connection.createStatement();
					stmt.execute("DELETE FROM sales_invoice_details "
					 		+ " WHERE sales_invoice_id="+Sales_invoice_idtextfield.getText()+"");  
		
					modelproduct.removeRow(row);
					JOptionPane.showMessageDialog(sales_invoice_delete, "Deleted record was at serial no. " +Sales_invoice_idtextfield.getText());
					// JOptionPane.showMessageDialog(null, "Record is deleted...");  
				        stmt.close();  
				        connection.close();
				        modelproduct.setRowCount(0);
					show_salesinvoice_details();
					
						
					 }
				catch(Exception e2)
				{e2.printStackTrace();
				
				}
					
				
				}
				else
					JOptionPane.showMessageDialog(sales_invoice_delete, "Please select coorrectly to delete");
			
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
				
			}
		});
		
			
			
			
				
							sales_invoice_delete.setVerticalAlignment(SwingConstants.TOP);
		sales_invoice_delete.setToolTipText("add this record of the product");
		sales_invoice_delete.setForeground(Color.WHITE);
		sales_invoice_delete.setFont(new Font("Dialog", Font.BOLD, 15));
		sales_invoice_delete.setBackground(Color.BLACK);
		sales_invoice_delete.setAlignmentX(1.0f);
		sales_invoice_delete.setBounds(883, 234, 98, 29);
		frame.getContentPane().add(sales_invoice_delete);
		
		JButton sales_invoice_update = new JButton("Update");
		sales_invoice_update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				DefaultTableModel modelproduct=(DefaultTableModel) salesinvoice_details_table.getModel();	
				 				try 
								( Connection connection = DriverManager.getConnection(Config.JDBC_URL);)

								{	
								      
								
								
								
								 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
								 String date=sdf.format(dateChooser.getDate());
								 
								 
								
							    
							      		
								 	
							    
							            
				                     
						         Statement  Stmt = connection.createStatement();
						         Stmt.execute("Update sales_invoice_details set sales_invoice_deptt='"
							    		  +Sales_invoice_deptttextfield.getText()+"',sales_invoice_date='"
							    		  
								    		 
				                    +date +"',sales_invoice_Customer_id='"+sales_invoice_Customer_idTextField.getText()
							      		+ "'Where sales_invoice_id="+Sales_invoice_idtextfield.getText() +" ");
						        	 
						        	 
						        	 
						        	 
						        	 
						        	 
						        	 
						        	 
						        	 
						        	 
						        	 
						        	 
						        	 
						         							
										 modelproduct.setRowCount(0);
											show_salesinvoice_details();

										 JOptionPane.showMessageDialog(	sales_invoice_update, "success in updation");
										 connection.close();	
										
								}
							  catch(Exception e2)
				            {e2.printStackTrace();
				         	   JOptionPane.showMessageDialog(	sales_invoice_update, "Please select to update");
				            }
							

			}
		});
		sales_invoice_update.setVerticalAlignment(SwingConstants.TOP);
		sales_invoice_update.setToolTipText("add this record of the product");
		sales_invoice_update.setForeground(Color.WHITE);
		sales_invoice_update.setFont(new Font("Dialog", Font.BOLD, 15));
		sales_invoice_update.setBackground(Color.BLACK);
		sales_invoice_update.setAlignmentX(1.0f);
		sales_invoice_update.setBounds(883, 289, 98, 29);
		frame.getContentPane().add(sales_invoice_update);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0), 5));
		scrollPane.setBounds(-2, 110, 850, 314);
		frame.getContentPane().add(scrollPane);
		
		salesinvoice_details_table = new JTable();
		salesinvoice_details_table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
				try {	
					
					
					DefaultTableModel modelsalesinvoice=(DefaultTableModel) salesinvoice_details_table.getModel();	

					
					
						
						int i= salesinvoice_details_table.getSelectedRow();
						System.out.println("dddd"+i);
						Sales_invoice_idtextfield.setText(modelsalesinvoice.getValueAt(i,0).toString());
						Sales_invoice_deptttextfield.setText(modelsalesinvoice.getValueAt(i,1).toString());
						
					
						try {
							int srow=salesinvoice_details_table.getSelectedRow();
							Date date=new SimpleDateFormat("yyyy-MM-dd").parse((String)modelsalesinvoice.getValueAt(srow,2));
							dateChooser.setDate(date);
						}
						
						catch(Exception e)
						{e.printStackTrace();
							JOptionPane.showMessageDialog(	salesinvoice_details_table,"date error");
						}

						sales_invoice_Customer_idTextField.setText(modelsalesinvoice.getValueAt(i,3).toString());
						Customer_ID.setText(sales_invoice_Customer_idTextField.getText());
						
					}
				
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(	salesinvoice_details_table,"Please click on the table");
				}

			
			
			
			
			}
			
			
		});
		scrollPane.setViewportView(salesinvoice_details_table);
		salesinvoice_details_table.setBorder(new LineBorder(new Color(0, 0, 0)));
		salesinvoice_details_table.setFillsViewportHeight(true);
		salesinvoice_details_table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"sales_invoice_id", "sales_invoice_deptt", "sales_invoice_date", "sales_invoice_Customer_id"
			}
		));
		
		JButton back = new JButton("Back");
		swing mainpage = new swing();
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
		back.setBounds(883, 342, 98, 29);
		frame.getContentPane().add(back);
	}
}
