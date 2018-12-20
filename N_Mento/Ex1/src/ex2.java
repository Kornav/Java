import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String join_id=null, sign_id;
		String join_pass=null, sign_pass;
		int choice;
		int count=0;
		
		while (true) {
			System.out.println("======================");
			System.out.println("\t기능 선택\n 1.회원가입\n 2.로그인\n 3.종료");
			System.out.println("======================");
			choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.println("가입할 아이디를 입력해주세요.");
				join_id = in.next();
				System.out.println("비밀번호를 입력해주세요. (12자리 이상)");
				join_pass = in.next();
				if(join_pass.length()<12) {
					System.out.println("12자리가 아닙니다. 메인 메뉴로 돌아갑니다.");
					continue;
				}
				break;
			case 2:
				System.out.println("로그인 하실 아이디를 입력해주세요 : ");
				sign_id = in.next();
				System.out.println("로그인 하실 비밀번호를 입력해주세요 : ");
				sign_pass = in.next();
				if(!(join_id.equals(sign_id))|| !(join_pass.equals(sign_pass)) ) {
					System.out.println("아이디 또는 비밀번호가 틀립니다. 다시 입력해주세요");
					continue;
				}
				else {
					System.out.println("로그인 되었습니다.");
				}
				break;
			case 3:
				System.out.println("종료 합니다.");
				return ;
				default :
					System.out.println("메뉴 오류 다시 입력해주세요.");
					break;
			}
		}
		
	}
}
