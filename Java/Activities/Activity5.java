package activities;

public class Activity5 {
	public static void main(String[] args) {
		String title = "Hover Car Race";
		Book newNovel = new MyBook();
		newNovel.setTitle(title);
		System.out.println("The title is" + newNovel.getTitle());
	}
}

abstract class Book {

	String title;

	public String getTitle() {
		return title;
	}

	abstract void setTitle(String s);

}

class MyBook extends Book {

	public void setTitle(String s) {
		title = s;
	}
}
