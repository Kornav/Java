import java.util.*;
public class MovieMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] moviename = {"Iron man","Thor","With God"};
		int num;
		char[][] seat = {
				{'O','O','O','O','O'},
				{'O','O','O','O','O'},
				{'O','O','O','O','O'},
				{'O','O','O','O','O'},
				{'O','O','O','O','O'}
				};
		Movie m = new Movie();
		m.PrintMovieList(moviename);
		while(true) {
			String choice_moviename = m.Input_moviename(input);
			if(choice_moviename.equals("quit")) {
				System.out.println("���� �մϴ�.");
				break;
			}
			boolean check = m.Check_movie(moviename, choice_moviename);
			if(check == false) {
				System.out.println("�ٽ� �������ּ���.");
				continue;
			}
			else {
				m.Showseat(seat);
				System.out.println("����̽Ű���?");
				num = input.nextInt();
				seat = m.Input_seat(seat,num);
				m.Showseat(seat);
				System.out.println("��ȭ ���Ű� �Ϸ� �Ǽ̽��ϴ�.");
				continue;
			}
		}
	}
	
	
}
