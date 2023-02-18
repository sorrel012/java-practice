import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new Task1());
		executorService.execute(new Thread(new Task2()));

		//Task3
		System.out.print("\nTask3 Kicked Off");

		for(int i= 301; i <= 399; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\nTask3 Done");

		System.out.print("\nMain Done");
		
		executorService.shutdown(); //프로그램을 멈춰줘야 함.

	} //main
}
