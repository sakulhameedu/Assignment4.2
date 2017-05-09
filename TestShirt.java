class Shirt{
	private int CollarSize;  //Private variables declaration 
    private int SleeveLength;
	private String material;
	
	public Shirt(int collar , int sleeve)   //Argumented constructor
	{
		CollarSize = collar;
		SleeveLength = sleeve;
		material = "Cotton";    //assigning "Cotton" as meterial value
		
	}
	public Shirt()         //constructor without arguments 
	{
		CollarSize = 0;
		SleeveLength = 0;
		material = "Cotton";       //assigning "Cotton" as meterial value
	}
	public void setMaterial(String value) //Get value 
	{
		material = value;;
		
	}
	public String getMaterial()  //REturn Value 
	{
		 return material;
	}
	
	public int getCollarSize()   //Get value 
	{
		return CollarSize;
	}
	public void setCollarSize(int value)  //REturn Value 
	{
		CollarSize = value;
	}
	
	public int getSleeveLength()    //Get value 
	{
		return SleeveLength;
	}
	public void setSleeveLength(int value)   //REturn Value 
	{
		SleeveLength = value;
	}
	
	public void shirtNew()   //Print values 
	{
		System.out.println("The Collar Size is " + CollarSize + "\n" + "The SleeveLength is" + SleeveLength + "\n" + "The Material is " + material );
	}
}

class TestShirt  //Main Class 
{
	public static void main(String[] args)
	{
		Shirt sr1 = new Shirt(); 
		Shirt sr2 = new Shirt(11,21);
		Shirt sr3 = new Shirt(12,22);
		sr1.setCollarSize(10);  //Passing value 
		sr1.setSleeveLength(20);  //Passing value 
		
		sr1.shirtNew();  //calling Method ShirtNew to print
		sr2.shirtNew();  //calling Method ShirtNew to print
		sr3.shirtNew();	  //calling Method ShirtNew to print
	}
}
