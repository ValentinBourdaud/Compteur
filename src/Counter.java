
public class Counter  {
	
	private int state;

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
	
	public boolean equals(Counter counter) {
		boolean eq= false;
		if (counter.getValue()==this.getValue()) {
			eq= true;
			;
}
		return eq;
		}

		
	

	public boolean equals2(Counter counter, Counter counter2) {
		boolean eq=false;
		if (counter.getValue()==this.getValue() && counter.getValue()==this.getValue()) {
			eq=true;
			}
		return eq;
	}
}

