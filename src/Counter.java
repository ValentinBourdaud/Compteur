
public class Counter  {
	
	//Création variable state
	
	private int state;

	//Initialisation variable state
	
	public Counter () {
		this.state=0;
		
	}

	public int getValue() {
		return this.state;
	}

	public void inc() {
		this.state++;
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
}

