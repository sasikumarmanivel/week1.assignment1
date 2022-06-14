package myfirstjava;

public class TwoWheeler {
	
	
	int noOfWheels=2 ;
	short noOfMirrors=2;
	long chasiNumber=36786549;
	boolean isPunctured=true;
	double runningKm=5000.6;
	String bikeName="hondaShine";
	
	
	public static void main(String[] args) {
		TwoWheeler object = new TwoWheeler();
		int noOfWheels2 = object.noOfWheels;
		System.out.println("Number of Wheels is "  + noOfWheels2);
		short noOfMirrors2 = object.noOfMirrors;
		System.out.println("Number of mirror is " +noOfMirrors2);
		long chasiNumber2 = object.chasiNumber;
		System.out.println("Vehile chasi Number is "+chasiNumber2);
		boolean isPunctured2 = object.isPunctured;
		System.out.println("Is Puntured "+isPunctured2);
		double runningKm2 = object.runningKm;
		System.out.println("Vehile total running km is "+runningKm2);
		String companyName2 = object.bikeName;
		System.out.println("Bike name is "+companyName2);
	}
	 
		
	}
	
	
	


