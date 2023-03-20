
public class Box<T> {
	
	private T thing;
	private int thingCount;
		
	public Box(T firstThing) {
		this.thing = firstThing;
		this.thingCount = 1;		
	}
	
	public T getContents() {
		return thing;
	}
	public int getCount() {
		return thingCount;
	}
	
	public void replaceContents(T newThing) {
		this.thing = newThing;
		thingCount++;
	}
	
	@Override
	public String toString() {
		return thing.toString() + " (item " + thingCount + ")";
	}
	
	@Override
	public boolean equals(Object other) {
		if(other instanceof Box<?>) {
			Box<?> otherBox = (Box<?>) other;
			
			boolean sameThing = this.thing.equals(otherBox.thing);
			boolean sameCount = this.thingCount==otherBox.thingCount;
			
			return sameThing && sameCount;
			
		} else {
			return false;
		}
	}
	

}
