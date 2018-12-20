
public class MazeMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//초기 맵을 그린다.
		Maze m = new Maze();
	    System.out.println("current Map\n");
	    m.maz_print();
	    System.out.println("================\n");
	    stack_Element cStack;
	    int r = m.current.x;
	    int c = m.current.y;
	    //출구를 찾지못하면 while문 계속 실행
	    while(m.maz_Map[r][c]!=3){
	        m.maz_Map[r][c] = 4;//지나왔다고 표시하기위해 4라고 표시
	        m.jud1(r,c);//어떤길로 갈지 판단해주며 길이 맞다면 스택에넣는다.
	        m.stack_print();//jud 을통하여 쌓은 스택을 보여준다.
	        m.maz_print();//현재까지의 맵을 생성
	        cStack = m.pop();//쌓은 스택 위를 pop을 함으로써 길을찾아 간다.
	        r = cStack.x;//pop한 후의 값을 다시 현재 경로로 저장한다.
	        c = cStack.y;
	        System.out.println();
	    }
	}
}
