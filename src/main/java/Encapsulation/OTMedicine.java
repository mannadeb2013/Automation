package Encapsulation;

public class OTMedicine {

	public static void main(String[] args) {
		
		Medicine obj = new Medicine();
		obj.setCapsule("The name of the capsule is Napa");
		obj.setPrice(40);
		obj.setSyrup("Delsyn");
		
		System.out.println(obj.getCapsule());
		System.out.println(obj.getPrice());
		System.out.println(obj.getSyrup());
	}
}

