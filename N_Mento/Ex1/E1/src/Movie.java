import java.util.Scanner;

public class Movie {
	public void PrintMovieList(String[] moviename) {
		System.out.println("====== Movie List ======");
		for(int i=0;i<moviename.length;i++) {
			System.out.println((i+1)+". "+moviename[i]);
		}
		System.out.println("���� : quit");
	}
	public String Input_moviename(Scanner in) {
		String choice_moviename;
		System.out.println("��ȭ�� �������ּ���.");
		choice_moviename = in.nextLine();
		return choice_moviename;
	}
	public boolean Check_movie(String[] moviename, String choice) {
		boolean bool=false;
		for(int i=0;i<moviename.length;i++) {
			if(choice.equals(moviename[i])) {
				bool = true;
			}
		}
		return bool;
	}
	public void Showseat(char[][] ch) {
		System.out.println("======== �¼� ========");
		System.out.println("    1  2  3  4  5");
		for(int i=0;i<ch.length;i++) {
			System.out.print((char)(i+65)+"�� ");
			for(int j=0;j<ch[0].length;j++) {
				System.out.print(" "+ch[i][j]+" ");
			}
			System.out.println();
		}
	}
	public char[][] Input_seat(char[][] ch, int choice){
		Scanner in = new Scanner(System.in);
		char row;
		int col;
		for(int i=0;i<choice;i++) {
			System.out.println("�¼��� ���� �������ּ���");
			row = in.next().charAt(0);
			System.out.println("�¼� ��ȣ�� �Է����ּ���.");
			col = in.nextInt();
			System.out.println(row+"�� "+col+"�� �ڸ��� �����ϼ̽��ϴ�.");
			ch[(char)(row-65)][col-1] = 'X';
		}
		return ch;
	}
}
