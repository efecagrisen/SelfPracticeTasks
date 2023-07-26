package day31_CustomClass_Construction.adress;

public class Adress {

    public String street, city, state;
    public int buildingNumber, zipCode;


    public Adress(String street, String city, String state, int buildingNumber, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.buildingNumber = buildingNumber;
        this.zipCode = zipCode;
    }


    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", buildingNumber=" + buildingNumber +
                ", zipCode=" + zipCode +
                '}';
    }
}

/*
Address Task:
	2.1 Create a class named Address
		    Attributes:
		         buildingNumber, street, city, state, zipCode;

		   	Add a constructor to set all the fields

		    Actions
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012
 */
