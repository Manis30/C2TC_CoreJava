package Assignment_2;

public class Commission {
	private String name,address;
	private int phone,sales_amount;
	public void calculateCalculation(Commission commission) {
		int sales=commission.sales_amount;
		if(sales>= 100000) {
			System.out.print("10%");
		}
		else if( 50000 <= sales &&  sales < 100000) {
			System.out.print("5%");
		}
		else if(30000 <=sales && sales<50000) {
			System.out.print("3%");	
		}
		else if(sales < 30000) {
			System.out.print("No Commission");	
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getSales_amount() {
		return sales_amount;
	}
	public void setSales_amount(int sales_amount) {
		this.sales_amount = sales_amount;
	}
	@Override
	public String toString() {
		return "Employee [Name: "+name+" ,Address: "+address+" ,Phone: "+phone+" ,Sales Amount:"+sales_amount+" ]";
	}
}
