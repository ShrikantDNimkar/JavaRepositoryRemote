package com.hcl.java.collection.map;
import java.util.HashMap;
import java.util.Map.Entry;
class Customer{
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public String getAddress() {
		return address;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public String getPassword() {
		return password;
	}

	private int custId;
	private String custName;
	private String address;
	private long contactNumber;
	private String password;
	
	public Customer(String custName, String address, long contactNumber, String password) {
		this.custName=custName;
		this.address=address;
		this.contactNumber=contactNumber;
		this.password=password;
		
	}
}
public class MainHashMap {

	public static void main(String[] args) {
		
		HashMap<Object, Customer> hashMapObj = new HashMap<>();
		
		hashMapObj.put(1123, new Customer("James", "Hyd", 987564311L, "pw1"));
		hashMapObj.put(1122, new Customer("Gavin", "Hyd", 9875435132L, "pw2"));
		hashMapObj.put(1121, new Customer("Jhonson", "Hyd", 6871213878L, "pw3"));
		
		System.out.println("Hash Map Elements: " + hashMapObj);
		System.out.println("Key"+"\t"+"Customer ID"+"\t"+"Address"+"\t"+"Contact Number"+"\t"+"Password"+"\t");
		for(Entry<Object,Customer> obj:hashMapObj.entrySet()) {
			System.out.println(obj.getKey()+"\t"+obj.getValue().getCustId()+"\t"+obj.getValue().getAddress()+"\t"+obj.getValue().getContactNumber()+"\t"+obj.getValue().getPassword()+"\t");
			
		}
		
		/*HashMap<Object, Object> hashMapObj = new HashMap<>();
		
		hashMapObj.put(109721 , "India");
		hashMapObj.put(+109721, "USA");
		hashMapObj.put("+1", "USA");
		hashMapObj.put("+4", "UK");
		hashMapObj.put(+1, "USA");
		hashMapObj.put(null, "Japan");
		hashMapObj.put(null, null);
		hashMapObj.put('U', "UK");
		hashMapObj.put('3', null);
		System.out.println("Hash Map  " + hashMapObj);
		
		hashMapObj.put("password", "James");
		hashMapObj.put("password", "Gavin");
		hashMapObj.put(1123,new Customer("james","Hyd", 987456321L, "Java"));
		for(Entry<Object,Object> obj:hashMapObj.entrySet()) {
			System.out.println(obj.getKey()+"\t"+obj.getValue());
		}*/
	}

}
