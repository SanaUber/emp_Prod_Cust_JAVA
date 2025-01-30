package employee;

public class Customer_details {
	
	
	private int Customer_id,
	Customer_salesinvoiceid,
	Customer_TRN;
	
private String Customer_Name,Customer_phone,Customer_Paytype,Customer_Address	;

public Customer_details(int Customer_id,String Customer_Name, String Customer_phone,
		String Customer_Paytype,
		int Customer_salesinvoiceid,
		int Customer_TRN,
		String Customer_Address )
{
	this.Customer_id=Customer_id;
this.Customer_Name=Customer_Name;
this.Customer_phone=Customer_phone;
this.Customer_Paytype=Customer_Paytype;
this.Customer_salesinvoiceid=Customer_salesinvoiceid;
this.Customer_Address=Customer_Address;
this.Customer_TRN=Customer_TRN;


}
public int getCustomer_id()
{return Customer_id;
}
public int getCustomer_salesinvoiceid()
{return Customer_salesinvoiceid;
}
public int getCustomer_TRN()
{return Customer_TRN;
}

public String getCustomer_Name()
{return Customer_Name;
}
public String getCustomer_phone()
{return Customer_phone;
}
public String getCustomer_Paytype()
{return Customer_Paytype;
}
public String getCustomer_Address()
{return Customer_Address;
}



}
	


