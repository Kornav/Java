
public class MazeMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ʱ� ���� �׸���.
		Maze m = new Maze();
	    System.out.println("current Map\n");
	    m.maz_print();
	    System.out.println("================\n");
	    stack_Element cStack;
	    int r = m.current.x;
	    int c = m.current.y;
	    //�ⱸ�� ã�����ϸ� while�� ��� ����
	    while(m.maz_Map[r][c]!=3){
	        m.maz_Map[r][c] = 4;//�����Դٰ� ǥ���ϱ����� 4��� ǥ��
	        m.jud1(r,c);//���� ���� �Ǵ����ָ� ���� �´ٸ� ���ÿ��ִ´�.
	        m.stack_print();//jud �����Ͽ� ���� ������ �����ش�.
	        m.maz_print();//��������� ���� ����
	        cStack = m.pop();//���� ���� ���� pop�� �����ν� ����ã�� ����.
	        r = cStack.x;//pop�� ���� ���� �ٽ� ���� ��η� �����Ѵ�.
	        c = cStack.y;
	        System.out.println();
	    }
	}
}
