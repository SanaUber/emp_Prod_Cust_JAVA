package employee;


public class Salesinvoice_details {
	private int sales_invoice_id,sales_invoice_Customer_id;
	
	private String sales_invoice_deptt,
	sales_invoice_date;
	public Salesinvoice_details(int sales_invoice_id,
			String sales_invoice_deptt,
			String sales_invoice_date,
			int sales_invoice_Customer_id)
	{
		this.sales_invoice_id=sales_invoice_id;
		this.sales_invoice_deptt=sales_invoice_deptt;
		this.sales_invoice_date=sales_invoice_date;
		this.sales_invoice_Customer_id=sales_invoice_Customer_id;
	
}
	public int getsales_invoice_id()
	{return sales_invoice_id;
	}
	public String getsales_invoice_deptt()
	{return sales_invoice_deptt;
	}
	public String getsales_invoice_date()
	{return sales_invoice_date;
	}
	public int getsales_invoice_Customer_id()
	{return sales_invoice_Customer_id;
	}
}