
public class Main {

	public static void main(String[] args) {
		int j =10;
		
		Counter counter = new Counter();
		System.out.println(counter.getValue());
		
		for(int i=0;i<j;i++) {
			counter.inc();
			System.out.println(counter.getValue());
		}
		
		System.out.println(counter);
		
		int k = 10;
		
		Counter counter2 = new Counter();
		System.out.println(counter2.getValue());
		
		for(int i=0;i<k;i++) {
			counter2.inc();
			System.out.println(counter2.getValue());
		}
		
		System.out.println(counter2);
		
		System.out.println(counter.equals(counter2));

}
}
