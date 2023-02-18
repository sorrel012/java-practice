import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(3);

		List<CallableTask> tasks= List.of(new CallableTask("나무의 하루")
									, new CallableTask("Hanee")
									, new CallableTask("아침햇살"));
		
		List<Future<String>> results = executorService.invokeAll(tasks);
		
		for(Future<String> result:results) {
			System.out.println(result.get());
		}
		
		executorService.shutdown();

	} //main
	
}
