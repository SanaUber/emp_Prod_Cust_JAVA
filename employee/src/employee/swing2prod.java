package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.FlowLayout;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

//import org.omg.CosNaming.Binding;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.event.MouseInputAdapter;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.Panel;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.JTextPane;

public class swing2prod{
	JFrame frame;
	private JTable Product_details_table;
	private JScrollPane scrollPane;
	private JPanel panel;
	private Label label;
	private TextField Product_LOCtextField;
	private TextField Product_QuantitytextField;
	private TextField textField_5;
	private Label Product_Ratelabel;
	private Label Product_Taxlabel;
	private TextField Product_RatetextField;
	private TextField Product_TaxtextField;
	private Label Product_Quantitytlabel;
	private Label Product_LOClabel;
	private Label Product_Unitlabel;
	private Label Product_Discriptionlabel;
	private Label Product_Codelabel;
	private Label Product_SLlabel;
	private JButton update_product_id;
	/**
	 * @wbp.nonvisual location=890,-31
	 */
	private final JSeparator separator = new JSeparator();
	private JButton Update_Product_record;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing2prod window = new swing2prod();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
					
				}
			}
		});
	
	
	
	
	
	
	}
	

	/*

	/**
	 * Create the application.
	 */
public swing2prod() {
		initialize();
		show_product_details();
		
		//getcomputedtaxammount();

	}//CODING for Database



int lastidprod;
private JTextField Product_tax_Amounttextfield;
private TextField Product_UnittextField;







	
	public ArrayList<Product_details> ProductList()
	{
		ArrayList<Product_details> ProductList=new ArrayList<>();
	
	

	 
    
try(Connection connection = DriverManager.getConnection(Config.JDBC_URL);)
    
    {
	      System.out.println("Co");
    
    String selectQ="Select* from Product_details";
    Statement stselect= connection.createStatement();
   
    ResultSet rsselect=stselect.executeQuery(selectQ);
    Product_details Product_details;
    while(rsselect.next())
    {       Product_details=new Product_details(rsselect.getInt("Product_SL"),rsselect.getInt("Product_Code"),
    		rsselect.getInt("Product_Quantity"),rsselect.getInt("Product_Unit"),rsselect.getInt("Product_Tax"),rsselect.getString("Product_Discription"),
    		rsselect.getString("Product_LOC"),rsselect.getFloat("Product_Rate"),rsselect.getFloat("Product_Tax_Amount"));
    
    	
              ProductList.add(Product_details);
    }
    
    	
    
    	
    
    
    
    
    
    
    
    
connection.close();
      
    }

    catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null,e);
    }
return ProductList;
	
	
	
	
	
		
	

  
	}
	public void show_product_details()
	{
		
		ArrayList<Product_details> list=ProductList();
	
		DefaultTableModel modelproduct=(DefaultTableModel) Product_details_table.getModel();
		int i=0;
		Object[] row=new Object[9];
		
		System.out.println("showmj"+row[0]);
		for(i=0;i<list.size();i++)
{//i=list.get(i).getProduct_SL();
			row[0]=list.get(i).getProduct_SL();
	        row[1]=list.get(i).getProduct_Code();
			row[2]=list.get(i).getProduct_Discription();
			row[3]=list.get(i).getProduct_Unit();
			row[4]=list.get(i).getProduct_LOC();
			row[5]=list.get(i).getProduct_Quantity();
			row[6]=list.get(i).getProduct_Rate();
			row[7]=list.get(i).getProduct_Tax();
			row[8]=list.get(i).getProduct_Tax_Amount();
			
			modelproduct.addRow(row);
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
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(new Color(0, 204, 153));
		frame.setBounds(100, 100, 1055, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		panel=new JPanel();
		scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0), 3));
		scrollPane.setBounds(0, 106, 850, 322);
		frame.getContentPane().add(scrollPane);
		TextField Product_CodetextField = new TextField();
		Product_CodetextField.setBounds(136, 28, 62, 22);
		panel.add(Product_CodetextField);
		TextField Product_SLtextField = new TextField();
		Product_SLtextField.setEditable(false);
		Product_SLtextField.setEnabled(false);
		Product_SLtextField.setBounds(136, 0, 62, 22);
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
		
		Product_details_table = new JTable();
		Product_details_table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			try {	
				
				
				DefaultTableModel modelproduct=(DefaultTableModel) Product_details_table.getModel();	

				
				
					
					int i= Product_details_table.getSelectedRow();
					System.out.println("dddd"+i);
					Product_SLtextField.setText(modelproduct.getValueAt(i,0).toString());
					Product_CodetextField.setText(modelproduct.getValueAt(i,1).toString());
					Product_Discriptiontextfield.setText(modelproduct.getValueAt(i,2).toString());
					Product_UnittextField.setText(modelproduct.getValueAt(i,3).toString());
					Product_QuantitytextField.setText(modelproduct.getValueAt(i,5).toString());
					Product_LOCtextField.setText(modelproduct.getValueAt(i,4).toString());
					Product_RatetextField.setText(modelproduct.getValueAt(i,6).toString());
					Product_TaxtextField.setText(modelproduct.getValueAt(i,7).toString());
					Product_tax_Amounttextfield.setText(modelproduct.getValueAt(i,8).toString());
					
					
				}
			
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(	Product_details_table,"Please click on the table");
			}
			}
		});
	//1
		
		Product_details_table.setFillsViewportHeight(true);
		scrollPane.setViewportView(Product_details_table);
		Product_details_table.setBorder(new LineBorder(new Color(0, 0, 0)));
		Product_details_table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Product_SL", "Product_code", "Prod_Discription", "Product_Unit", "Product_LOC", "Product_Quantity", "Product_Rate", "Product_Tax", "Product_Tax_Amount"
			}
		));
		Product_details_table.setBackground(Color.WHITE);
		
		
		textField_5 = new TextField();
		scrollPane.setColumnHeaderView(textField_5);
		
		JButton enter_Product_id = new JButton("Add");
		enter_Product_id.setToolTipText("add this record of the product");
		enter_Product_id.setVerticalAlignment(SwingConstants.TOP);
		enter_Product_id.setBounds(860, 169, 98, 29);
		enter_Product_id.setAlignmentX(Component.RIGHT_ALIGNMENT);
		
		enter_Product_id.setFont(new Font("Dialog", Font.BOLD, 15));
		enter_Product_id.setForeground(Color.WHITE);
		enter_Product_id.setBackground(Color.BLACK);
		frame.getContentPane().add(enter_Product_id);
		
		//panel = new Panel();
		panel.setBackground(new Color(127, 255, 212));
		panel.setBounds(0, 24, 1039, 82);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Product_Ratelabel = new Label("Product_Rate");
		Product_Ratelabel.setFont(new Font("Dialog", Font.BOLD, 13));
		Product_Ratelabel.setForeground(Color.WHITE);
		Product_Ratelabel.setBounds(436, 10, 101, 22);
		panel.add(Product_Ratelabel);
		
		Product_Taxlabel = new Label("Product_Tax");
		Product_Taxlabel.setFont(new Font("Dialog", Font.BOLD, 13));
		Product_Taxlabel.setForeground(Color.WHITE);
		Product_Taxlabel.setBounds(436, 50, 101, 22);
		panel.add(Product_Taxlabel);
		
		
		
		
		Product_Quantitytlabel = new Label("Product_Quantity");
		Product_Quantitytlabel.setForeground(Color.WHITE);
		Product_Quantitytlabel.setFont(new Font("Dialog", Font.BOLD, 13));
		Product_Quantitytlabel.setBounds(213, 57, 120, 22);
		panel.add(Product_Quantitytlabel);
		
		Product_LOClabel = new Label("Product LOC");
		Product_LOClabel.setForeground(Color.WHITE);
		Product_LOClabel.setFont(new Font("Dialog", Font.BOLD, 13));
		Product_LOClabel.setBounds(213, 29, 101, 22);
		panel.add(Product_LOClabel);
		
		Product_Unitlabel = new Label("Product Unit");
		Product_Unitlabel.setForeground(Color.WHITE);
		Product_Unitlabel.setFont(new Font("Dialog", Font.BOLD, 13));
		Product_Unitlabel.setBounds(208, 0, 101, 22);
		panel.add(Product_Unitlabel);
		
		Product_Discriptionlabel = new Label("Product Discription");
		Product_Discriptionlabel.setForeground(Color.WHITE);
		Product_Discriptionlabel.setFont(new Font("Dialog", Font.BOLD, 13));
		Product_Discriptionlabel.setBounds(9, 57, 121, 22);
		panel.add(Product_Discriptionlabel);
		
		Product_Codelabel = new Label("Product Code");
		Product_Codelabel.setForeground(Color.WHITE);
		Product_Codelabel.setFont(new Font("Dialog", Font.BOLD, 13));
		Product_Codelabel.setBounds(9, 29, 101, 22);
		panel.add(Product_Codelabel);
		
		Product_SLlabel = new Label("Product SL#");
		Product_SLlabel.setForeground(Color.WHITE);
		Product_SLlabel.setFont(new Font("Dialog", Font.BOLD, 13));
		Product_SLlabel.setBounds(9, 0, 101, 22);
		panel.add(Product_SLlabel);
		
		Product_tax_Amounttextfield = new JTextField();
		Product_tax_Amounttextfield.setHorizontalAlignment(SwingConstants.CENTER);
		Product_tax_Amounttextfield.setForeground(new Color(0, 0, 0));
		Product_tax_Amounttextfield.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Product_tax_Amounttextfield.setText("Product Tax Amount");
		Product_tax_Amounttextfield.setEditable(false);
		Product_tax_Amounttextfield.setEnabled(false);
		Product_tax_Amounttextfield.setBackground(new Color(224, 255, 255));
		Product_tax_Amounttextfield.setBounds(846, 0, 193, 82);
		panel.add(Product_tax_Amounttextfield);
		Product_tax_Amounttextfield.setColumns(10);
		
		
		label = new Label("Product Details");
		label.setFont(new Font("Dialog", Font.BOLD, 17));
		label.setForeground(Color.WHITE);
		label.setBackground(new Color(0, 206, 209));
		label.setBounds(0, 0, 1039, 25);
		frame.getContentPane().add(label);
		
		JButton Delete_Product_details = new JButton("Delete");
		Delete_Product_details.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel modelproduct=(DefaultTableModel) Product_details_table.getModel();	
			 		int row=Product_details_table.getSelectedRow();
				String value=(Product_details_table.getModel().getValueAt(row,0).toString());
				
		
				
				if(row>=0)
				{ try(Connection connection = DriverManager.getConnection(Config.JDBC_URL);)
					 { 
					
					
					
					Statement stmt=connection.createStatement();
					stmt.execute("DELETE FROM Product_details "
					 		+ " WHERE Product_SL="+Product_SLtextField.getText()+"");  
				
	
					modelproduct.removeRow(row);
					JOptionPane.showMessageDialog(Delete_Product_details, "Deleted record was at serial no. " +Product_SLtextField.getText());
					// JOptionPane.showMessageDialog(null, "Record is deleted...");  
				        stmt.close();  
				        connection.close();
				        modelproduct.setRowCount(0);
					show_product_details();
					
						
					 }
				catch(Exception e2){e2.printStackTrace();}
				
					
					
				
				}
				else
					JOptionPane.showMessageDialog(Delete_Product_details, "Please select coorrectly to delete");
			
			}	});	
				
				
				
			
	
		Delete_Product_details.setVerticalAlignment(SwingConstants.TOP);
		Delete_Product_details.setToolTipText("delete the selected record");
		Delete_Product_details.setForeground(Color.WHITE);
		Delete_Product_details.setFont(new Font("Dialog", Font.BOLD, 15));
		Delete_Product_details.setBackground(Color.BLACK);
		Delete_Product_details.setAlignmentX(1.0f);
		Delete_Product_details.setBounds(860, 209, 98, 29);
		frame.getContentPane().add(Delete_Product_details);
		
		Update_Product_record = new JButton("Update");
		Update_Product_record.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				DefaultTableModel modelproduct=(DefaultTableModel) Product_details_table.getModel();	
 			
				
			try 
				( Connection connection = DriverManager.getConnection(Config.JDBC_URL);)

				{	
				      
				
				
				
		
	              float pr=Float.parseFloat((String)(Product_RatetextField.getText()));
					float pt=Float.parseFloat((String)(Product_TaxtextField.getText()));
					float pta=(((pr*pt)/100)+pr);
					
					Product_tax_Amounttextfield.setText(pta+"");
		        
				
			    
			      		
				 	
			    
			            
                     
		         Statement  Stmt = connection.createStatement();
		         Stmt.execute("Update Product_details set Product_Code='"+ Product_CodetextField.getText()+"',Product_Discription='"
			    		  +Product_Discriptiontextfield.getText()+"',Product_Unit='"
			    		  
				    		 
                    +Product_UnittextField.getText() +"',Product_LOC='"
         +Product_LOCtextField.getText()+"',Product_Quantity='"+Product_QuantitytextField.getText()
			    		  +"',Product_Rate='"+ Product_RatetextField.getText()+"',Product_Tax='"+Product_TaxtextField.getText()
			      		+ "'Where Product_SL="+Product_SLtextField.getText() +" ");
		        	 
		        	 
		        	 
		        	 
		        	 
		        	 
		        	 
		        	 
		        	 
		        	 
		        	 
		        	 
		        	 
		         							
						 modelproduct.setRowCount(0);
							show_product_details();

						 JOptionPane.showMessageDialog(	Update_Product_record, "success in updation");
						 connection.close();	
						
				}
			  catch(Exception e2)
            {e2.printStackTrace();
         	   JOptionPane.showMessageDialog(	Update_Product_record, "Please select to update");
            }
			
	} 
				 
				 
				 
				 
				 
		
				
			
			
			
		});
		Update_Product_record.setVerticalAlignment(SwingConstants.TOP);
		Update_Product_record.setToolTipText("delete the selected record");
		Update_Product_record.setForeground(Color.WHITE);
		Update_Product_record.setFont(new Font("Dialog", Font.BOLD, 15));
		Update_Product_record.setBackground(Color.BLACK);
		Update_Product_record.setAlignmentX(1.0f);
		Update_Product_record.setBounds(860, 249, 98, 29);
		frame.getContentPane().add(Update_Product_record);
		
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
		back.setBounds(860, 289, 98, 29);
		frame.getContentPane().add(back);
		
	
		enter_Product_id.addActionListener(new ActionListener() {
					
			public void actionPerformed(ActionEvent arg0) {
				if(Product_CodetextField.getText().equals("")||Product_Discriptiontextfield.getText().equals("")||
						Product_UnittextField.getText().equals("")||Product_LOCtextField.getText().equals("")||Product_QuantitytextField.getText().equals("")||
								Product_QuantitytextField.getText().equals("")||Product_TaxtextField.getText().equals("")) {
					
					
					
					JOptionPane.showMessageDialog(null,"Please  fill the form completely");
				}
				else {	
				 	
				
				
				 try(Connection connection = DriverManager.getConnection(Config.JDBC_URL);)
				 { String  addQ="INSERT INTO Product_details "
						
							//+ "(Product_SL,"
							+ "(Product_Code,"
							+ "Product_Discription,"
							+ "Product_Unit,"
							+ "Product_LOC,"
							+ "Product_Quantity,"
							+ "Product_Rate,"
							+ "Product_Tax)"
						//	+ "Product_Tax_Amount)"
							+ "Values(?,?,?,?,?,?,?)";
				try (PreparedStatement preparedStmt = connection.prepareStatement(addQ/*,Statement.RETURN_GENERATED_KEYS*/))
				{
				  System.out.println("Connectedq ");
				  
					
					ArrayList<Product_details> list=ProductList();
				
					
					int i=list.size();

					      
					    
						
						          
				Object[] columns={"Product_SL", "Product_code", "Prod_Discription", "Product_Unit", "Product_LOC",
						"Product_Quantity", "Product_Rate", "Product_Tax","Product_Tax_Amount"};
				Object[] row=new Object[9];
				DefaultTableModel modelproduct=(DefaultTableModel) Product_details_table.getModel();

				modelproduct.setColumnIdentifiers(columns);
             
               System.out.println("  .............  "+i);
               
               String z=String.valueOf(i);
           
			   
               System.out.println("  .............  "+z);
               
               
             
               Product_SLtextField.setText(i+"" 	);
            
           	String add=Product_SLtextField.getText();
           	System.out.println("add"+Product_SLtextField.getText());
           //	preparedStmt.setString(,Product_SLtextField.getText());
			 preparedStmt.setInt (1,Integer.parseInt((String) (row[0]=Product_CodetextField.getText())));

		//	 preparedStmt.setInt (2,Integer.parseInt((String) (row[1]=Product_CodetextField.getText())));
				 preparedStmt.setString (2,(String)(row[1]=Product_Discriptiontextfield.getText()));
				preparedStmt.setInt (3,Integer.parseInt((String)(row[2]=Product_UnittextField.getText())));
				preparedStmt.setString (4,(String)(row[3]=Product_LOCtextField.getText()));
				preparedStmt.setInt (5,Integer.parseInt((String)(row[4]=Product_QuantitytextField.getText())));
				preparedStmt.setFloat (6,Float.parseFloat((String)(row[5]=Product_RatetextField.getText())));
				preparedStmt.setFloat (7,Float.parseFloat((String)(row[6]=Product_TaxtextField.getText())));
				//preparedStmt.setFloat (9,pta);
				
				
				
					float pr=Float.parseFloat((String)(Product_RatetextField.getText()));
					float pt=Float.parseFloat((String)(Product_TaxtextField.getText()));
					float pta=(((pr*pt)/100)+pr);
					
					Product_tax_Amounttextfield.setText(pta+"");
	
	
				modelproduct.addRow(row);

			preparedStmt.executeUpdate();


		modelproduct.setRowCount(0);
		 
				show_product_details();
				
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
	


	}
}
