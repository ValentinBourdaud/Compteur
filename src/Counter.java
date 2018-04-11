
public class Counter  {
	
	//Création variable state
	
	private int state;
	
	//Création de la variable statique globalCounter
	
	private static int globalCounter=-1;
	
	public static int getglobalCounter;

	//Constructeur
	
	public Counter () {
		this.state=0;
		if(globalCounter==-1) {
			globalCounter=0;
		}
		
	}

	public int getValue() {
		return this.state;
	}

	public void inc() {
		this.state++;
		globalCounter++;
	}
	
	public String toString(){
		return "Valeur de "+this.state+" incrémente de "+this.state;
		
	}
	
	//Comparaison des deux premiers compteurs
	
	public boolean equals(Counter counter) {
		boolean eq= false;
		if (counter.getValue()==this.getValue()) {
			eq= true;
			;
}
		return eq;
		}

		
	//Comparaison des trois compteurs

	public boolean equals2(Counter counter, Counter counter2) {
		boolean eq=false;
		if (counter.getValue()==this.getValue() && counter.getValue()==this.getValue()) {
			eq=true;
			}
		return eq;
	}

	public static int getglobalCounter() {
		
		return globalCounter;
	}
	
	
}

