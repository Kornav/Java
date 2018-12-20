import java.util.*; // 라이브러리
public class Ex1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		int num2 = 2;
		int i=0;
		int k=1;
		int j=0;
		for(i=0;i<6;i++) {
			for(j=6;j>0+i;j--) {
				System.out.print(" ");
			}
			for(k=0;k<i;k++) {
				if(i%2==1) {
					System.out.print(num1+" ");
					num1+=2;
				}
				if(i%2==0) {
					System.out.print(num2+" ");
					num2+=2;
				}
			}
			System.out.println();
		}
	}
}
