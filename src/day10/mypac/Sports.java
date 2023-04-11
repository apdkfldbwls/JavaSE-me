package day10.mypac;

public class Sports implements Cloneable {
	public String Kind;
	public boolean isGroup;
	public String kind;
	
	public Sports(String kind, boolean isGroup) {
		this.Kind = kind;
		this.isGroup = isGroup;
	}
	
	@Override
	public String toString() { // toString 재정의 
		return Kind;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public Object calllClone() throws CloneNotSupportedException {
		return clone();
	}

}
