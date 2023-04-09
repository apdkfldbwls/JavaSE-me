package day10.mypac;

public class Sports {
	public String Kind;
	public boolean isGroup;
	
	public Sports(String kind, boolean isGroup) {
		this.Kind = kind;
		this.isGroup = isGroup;
	}
	
	@Override
	public String toString() { // toString 재정의 
		return Kind;
	}

}
