
public class Main {

	public static void main(String[] args) {
		int j =10;
		
		//Cr�ation de l'objet counter
		
		Counter counter = new Counter();
		System.out.println(counter.getValue());
		
		for(int i=0;i<j;i++) {
			counter.inc();
			System.out.println(counter.getValue());
		}
		
		System.out.println(counter);
		
		int k = 10;
		
		//Cr�ation de l'objet counter2

		
		Counter counter2 = new Counter();
		System.out.println(counter2.getValue());
		
		for(int i=0;i<k;i++) {
			counter2.inc();
			System.out.println(counter2.getValue());
		}
		
		System.out.println(counter2);
		

		int l=10;
		
		//Cr�ation de l'objet counter3

		
		Counter counter3 = new Counter();
		System.out.println(counter3.getValue());
		
		for(int i=0;i<l;i++) {
			counter3.inc();
			System.out.println(counter3.getValue());
		}
		
		System.out.println(counter3);
		
		//Comparaison des 3 compteurs
		
		System.out.println(counter.equals2(counter2, counter3));

}
}
