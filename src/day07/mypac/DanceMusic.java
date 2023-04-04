package day07.mypac;

public class DanceMusic implements Music, Singer{
	
	private String genre;
	private String name;
	private String composer;
	private String writer;
	private String groupName;
	
	public DanceMusic() {
		this.genre = "dance";
		this.name = "캔디";
		this.composer = "홍길동";
		this.writer = "홍길동";
		this.groupName = "NCT DREAM";
	}


	@Override
	public void setGenre(String genre) {
		this.genre = genre;
		
	}

	@Override
	public String getGenre() {
		
		return genre;
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public void setComposer(String composer) {
		this.composer = composer;
	}

	@Override
	public String getComposer() {
		
		return composer;
	}

	@Override
	public void setWriter(String writer) {
		this.writer = writer;
		
	}

	@Override
	public String getWriter() {
		
		return writer;
	}

	@Override  // 어노테이션 - 부가정보 또는 추가기능 제공. 명시적으로도 사용 가독성 up!
	public void listen() {
		System.out.println("신나는 댄스뮤직이 나와요");
		
	}

	@Override
	public void sing() {
		System.out.println("칼군무와 노래를 불러요");
		
	}

	@Override
	public String getGroupName() {
		
		return groupName;
	}

	@Override
	public void setGroupName(String groupName) {
		this.groupName = groupName;
		
	}

}
