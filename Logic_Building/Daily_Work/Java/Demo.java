class Laptop{
	
	int memory;
	float price;
	String processor;
	String modelName;
	String OS;//Instance Variable
	
	Laptop(){
		memory = 8;
		price = 5000.0f;
		processor = "i5";
		modelName = "Dell";
		
	}
	
	void clickPhoto(){
		System.out.println("Photo Clicked");
	}
	
	String typeNotepad(){
		return "Return from notepad";
	}
	
	void sound(){
		System.out.println("Sound");
	}
	
}

public class Demo{
	public static void main(String args[]){
		//inta  //local variable
		Laptop laptopObj = new Laptop();
		laptopObj.clickPhoto();
		
		System.out.println(laptopObj.memory);
	}
}