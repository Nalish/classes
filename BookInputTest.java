import java.util.Scanner;
public class BookInputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Book Book1=new Book();
System.out.println("Please enter the title of the book");
		Book1.title=input.nextLine();
		System.out.println("Please enter the author name");
		Book1.author=input.nextLine();
		System.out.println("Please enter the number OF Pages");
		Book1.numberOfPages=input.nextInt();
		
		System.out.println("The book title is:"+Book1.title);
		System.out.println("The book author is:"+Book1.author);
		System.out.println("The book  has:"+Book1.numberOfPages+" pages");
		
		

	}

}
