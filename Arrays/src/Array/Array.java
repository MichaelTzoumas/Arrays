package Array;
import java.util.Scanner;  // Import the Scanner class

public class Array {
	 
	public static void main(String[] args) {
/*------------------------------ΜΟΝΟΔΙΑΣΤΑΤΟΙ ΠΙΝΑΚΕΣ-------------------------------------------*/
/*------------------------------ΠΙΝΑΚΑΣ ΜΕ ΑΥΤΟΚΙΝΗΤΑ-------------------------------------------*/
	    
	    System.out.println("----ΜΟΝΟΔΙΑΣΤΑΤΟΣ ΠΙΝΑΚΑΣ ΜΕ ΑΥΤΟΚΙΝΗΤΑ----");
	    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};					//Δημιουργεί Εναν πίνακα με ονομα cars, 4 θέσεων με 4 μάρκες μεσα
	    		for (int i = 0; i < cars.length; i++) {
	    			System.out.println(cars[i]);
	    		}
	    System.out.println("\n");
/*------------------------------ΤΕΛΟΣ ΠΙΝΑΚΑΣ ΜΕ ΑΥΤΟΚΙΝΗΤΑ-------------------------------------*/
/*--------------------ΠΙΝΑΚΑΣ ΜΕ ΙΝΤ (ΕΙΣΑΓΩΓΗ ΑΠΟ ΤΟ ΠΛΗΚΤΡΟΛΟΓΙΟ)------------------------------*/
	    System.out.println("----ΠΙΝΑΚΑΣ ΜΕ ΙΝΤ (ΕΙΣΑΓΩΓΗ ΑΠΟ ΤΟ ΠΛΗΚΤΡΟΛΟΓΙΟ)----\n");
	    			System.out.println("Δώστε τις διαστάσεις του πίνακα:");
	    Scanner in = new Scanner(System.in);  								//Δημιουργεί ενα Scanner object
	    int size=in.nextInt();												//Παίρνει απο το πληκτρολόγιο το μηκος του πίνακα
	    int[] myIntArray = new int[size]; 									//Δημιουργει εναν πίνακα myIntArray τύπου Int, μεγέθους size
	    		for (int i = 0; i < size; i++) {
	    			System.out.println("\nΔώστε το "+i+"o στοιχείο του πίνακα");
	    			myIntArray[i]=in.nextInt();								//Παίρνει απο το πληκτρολόγιο το i στοιχειο του πίνακα
	    		}
	    			System.out.println("\nΔωσατε τις παρακάτω τιμές στον πίνακα:");
			    for (int i = 0; i < size; i++) {							//Εμφανίζει τον πίνακα
					System.out.println(myIntArray[i]);
					
				}
	    
			    	System.out.println("\n");        
/*------------------------------ΤΕΛΟΣ ΙΝΤ (ΕΙΣΑΓΩΓΗ ΑΠΟ ΤΟ ΠΛΗΚΤΡΟΛΟΓΙΟ)------------------------------*/
/*--------------------ΠΙΝΑΚΑΣ ΜΕ STRING (ΕΙΣΑΓΩΓΗ ΑΠΟ ΤΟ ΠΛΗΚΤΡΟΛΟΓΙΟ)--------------------------------*/

	    System.out.println("----ΠΙΝΑΚΑΣ ΜΕ STRING (ΕΙΣΑΓΩΓΗ ΑΠΟ ΤΟ ΠΛΗΚΤΡΟΛΟΓΙΟ)----\n");
	    			System.out.println("Δώστε τις διαστάσεις του πίνακα:");
	    int sizeStr=in.nextInt();												//Παίρνει απο το πληκτρολόγιο το μηκος του πίνακα
	    String[] myStringArray = new String[sizeStr]; 							//Δημιουργει εναν πίνακα myIntArray τύπου Int, μεγέθους size
	    		for(int i=0; i<sizeStr; i++) {									// ----SOS----- Εδω υπάρχει πρόβλημα, πηδάει την πρώτη λούπα
	    			System.out.println("\nΔώστε το "+i+"o στοιχείο του πίνακα");
	    			myStringArray[i]=in.nextLine();
	    		}
	    		
	    			System.out.println("\nΔωσατε τις παρακάτω τιμές στον πίνακα:");
			    for (int i = 0; i < myStringArray.length; i++) {
					System.out.println(myStringArray[i]);
					
				}
			    	System.out.println("\n");
/*------------------------------ΤΕΛΟΣ ΠΙΝΑΚΑΣ ΜΕ STRING (ΕΙΣΑΓΩΓΗ ΑΠΟ ΤΟ ΠΛΗΚΤΡΟΛΟΓΙΟ)------------------------------*/
/*--------------------------------------------ΤΕΛΟΣ ΜΟΝΟΔΙΑΣΤΑΤΩΝ ΠΙΝΑΚΩΝ-------------------------------------------*/
		System.out.println("----ΠΟΛΥΔΙΑΣΤΑΤΟΣ ΠΙΝΑΚΑΣ ΜΕ STRING (ΕΙΣΑΓΩΓΗ ΑΠΟ ΤΟ ΠΛΗΚΤΡΟΛΟΓΙΟ)----\n");
		System.out.println("Δώστε τις διαστάσεις του πίνακα: \nΜήκος: ");
	    int sizeX=in.nextInt();												//Παίρνει απο το πληκτρολόγιο το μηκος του πίνακα
		System.out.println("Πλάτος:");
	    int sizeY=in.nextInt();												//Παίρνει απο το πληκτρολόγιο το πλατος του πίνακα
	    int[][] myStringDoubleArray = new int[sizeX][sizeY]; 				//<a> εναν πίνακα myIntArray τύπου Int, μεγέθους size
	    		for(int i=0; i<sizeX; i++) {
	    			for(int j=0; j<sizeY; j++) {	
	    				System.out.println("\nΓραμμή: "+i+",στήλη"+j);
	    				myStringDoubleArray[i][j]=in.nextInt();
	    		}
	    		}
	    				System.out.println("\nΔωσατε τις παρακάτω τιμές στον πίνακα:\n");
	    		int k;
	    		for(int i=0; i<sizeX; i++) {
		    		for(k=0; k<sizeY; k++) {	
	    				System.out.print( myStringDoubleArray[i][k] +"\t");
	    		}
			    	System.out.println("\n");


	    		}
	    
	    
	    
	    
		in.close();

	}
		
}
