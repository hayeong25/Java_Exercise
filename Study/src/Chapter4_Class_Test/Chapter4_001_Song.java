package Chapter4_Class_Test;

public class Chapter4_001_Song {

	String title;
	
	public Chapter4_001_Song(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public static void main(String[] args) {
		Chapter4_001_Song mySong = new Chapter4_001_Song("Nessun Dorma");
		Chapter4_001_Song yourSong = new Chapter4_001_Song("공주는 잠 못 이루고");
		
		System.out.println("내 노래는 " + mySong.getTitle());
		System.out.println("너 노래는 " + yourSong.getTitle());
	}
}