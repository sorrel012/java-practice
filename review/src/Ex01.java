
public class Ex01 {
	void print() {
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", 5, i, 5*i);
		}
	}
	
	void print(int table, int from, int to) {
		for(int i = from; i < to + 1; i++) {
			System.out.printf("%d * %d = %d\n", table, i, table*i);
		}
	}

}
