package employee;

public class Product_details {
	private int Product_SL,
	Product_Code,
	Product_Quantity,
	Product_Unit ;
private String Product_Discription,Product_LOC	;
private float Product_Rate,Product_Tax_Amount,Product_Tax;
public Product_details(int Product_SL,
		int Product_Code,
		int Product_Quantity,
		int Product_Unit,float Product_Tax, String Product_Discription, String Product_LOC,Float Product_Rate, Float Product_Tax_Amount)
{
	this.Product_SL=Product_SL;
this.Product_Code=Product_Code;
this.Product_Discription=Product_Discription;
this.Product_LOC=Product_LOC;
this.Product_Quantity=Product_Quantity;
this.Product_Rate=Product_Rate;
this.Product_Tax=Product_Tax;
this.Product_Tax_Amount=Product_Tax_Amount;
this.Product_Unit=Product_Unit;


}
public int getProduct_SL()
{return Product_SL;
}
public int getProduct_Code()
{return Product_Code;
}
public int getProduct_Quantity()
{return Product_Quantity;
}
public int getProduct_Unit()
{return Product_Unit;
}
public Float getProduct_Tax()
{return Product_Tax;
}
public String getProduct_Discription()
{return Product_Discription;
}
public String getProduct_LOC()
{return Product_LOC;
}
public Float getProduct_Rate()
{return Product_Rate;

}
public Float getProduct_Tax_Amount()
{return Product_Tax_Amount;

}





}
	
