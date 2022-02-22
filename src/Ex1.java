
public class Ex1 {
	
	public static void main(String[] args) {
        //All I want you to do is just make a comment and explain whats going on in each line
        //Fix the issue -- Create a Dog...
		
        boolean amIHappy = false; // A boolean names amIHAppy is being declared and assigned false
        
        int weight = 30; //an integer confirming a weight
        
        String name = "Billy Bob"; //someone's name in a string
        
        Dog goodBoy = new Dog(name, weight); //getting the dogs name and weight on one line
        
        int x = weight - 10;  //calculating number of x
        
        if (x < 15) goodBoy.bark(); //if x is under 15 then the dog will bark
        
        while (x < 3) {
            goodBoy.play(); //if x is under 3 then the dog plays
        }            
        
        int[] numList = {1,2,3,4,5,6}; //list of numbers
        System.out.println("How are you"); //message to print how are you
        System.out.println("My " + name + " is doing great" //will print the name in this message
                + " how's yours");  
        String num = "305"; 
        int z =Integer.parseInt(num) ; 
        System.out.println(num);
    }

}
