//extends Thread
class Task1 extends Thread {
	@Override
	public void run() { //SIGNATURE
		System.out.print("\nTask1 Started");
		
		for(int i= 101; i <= 199; i++) {
			System.out.print(i + " ");
		}
		
		System.out.print("\nTask1 Done");
	}
}
	
public class ThreadBasicsRunner {
	
	public static void main(String[] args) {

		//Task1
		System.out.print("\nTask1 Kicked Off");
		
		Task1 task1 = new Task1();
		task1.start(); //※task1.done() X
		
		//Task2
		System.out.print("\nTask2 Kicked Off");
				
		for(int i= 201; i <= 299; i++) {
			System.out.print(i + " ");
		}
		
		System.out.print("\nTask2 Done");
		
		//Task3
		System.out.print("\nTask3 Kicked Off");
		
		for(int i= 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		
		System.out.print("\nTask3 Done");
		
		System.out.print("\nMain Done");
	} //main
}
