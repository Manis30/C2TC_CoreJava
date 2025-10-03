package day_3.constructor;

public class Constructor {
	private String clientName;
	private int clientId;
	private String clientCity;
	public Constructor(){
		System.out.println("Default constructor");
	}
	public Constructor(String name,int id,String city) {
		System.out.println("Parameterized constructor");
		clientName=name;
		clientId=id;
		clientCity=city;
	}
	public void setClientName(String name) {
		clientName=name;
	}
	public void setClientId(int id) {
		clientId=id;
	}
	public void setClientCity(String city) {
		clientCity=city;
	}
	public String getClientName() {
		return clientName;
	}
	public int getClientId() {
		return clientId;
	}
	public String getClientCity() {
		return clientCity;
	}
	@Override 
	public String toString() {
		return "Client [clientame: "+clientName+" ,clientId: "+clientId+" ,clientCity: "+clientCity+" ]";
	}
}
