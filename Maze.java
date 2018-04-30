
public class Maze {

	
	public static final int MAX_SIZE = 10; // 배열(게임 타일의 수 가로 또는 세로의 수)
	public static final int MAX_STACK = 20;// 보관할 스택 사이즈

	int element;

	stack_Element current = new stack_Element(1,0); // 현재값을 나타낼 current 정의 (1,0) 이 초기값
	stack_Element entry = new stack_Element(1,0); // 입구를 entry 정의 및 (1,0)으로 초기화
	stack_Element[] maz_Stack = new stack_Element[MAX_STACK];
	char tile[] = {'□','■','Δ','▣','♀'}; // 숫자를 모양으로 바꿔줄 배열
	int top = -1; //스택의 top
	// 0 : 길, 1 : 블록, 2 : 현재위치, 3 : 출구, 4 : 지나온 길
	int maz_Map[][] = {
	    {1,1,1,1,1,1,1,1,1,1},
	    {2,0,1,0,0,0,0,1,1,1},
	    {1,0,0,0,1,1,1,1,1,1},
	    {1,1,1,0,1,1,1,1,1,1},
	    {1,1,1,0,1,1,1,0,0,0},
	    {1,1,1,0,0,0,0,0,1,0},
	    {1,1,1,1,1,1,1,1,0,0},
	    {1,1,1,1,1,0,0,0,0,1},
	    {1,1,1,1,1,0,1,1,1,1},
	    {1,1,1,1,1,0,0,0,0,3},
	};
	
	// Default 생성자
	public Maze() {
		
	}
	
	// 비었다면 true 아니면 false 을 리턴
	public boolean is_empty()
	{
	    return (top == -1);
	}
	// 꽉찼다면 true 아니면 false 을 리턴
	public boolean is_full()
	{
	    return (top==MAX_STACK-1);
	}
	//스택에다가 (x,y)를 저장한다.
	public void push(int _x, int _y)
	{
	    stack_Element nStack = new stack_Element(_x,_y);
	    //스택이 꽉찼다면 error를 보이며 종료
	    if(is_full()){
	        System.out.println("Stack error");
	        return;
	    }
	    else
	    {
	        maz_Stack[++top] = nStack;
	    }
	}
	//스택의 pop역할이랑 같다.
	public stack_Element pop()
	{
	    if(is_empty()){
	        System.out.println("Stack error");
	        System.exit(1);
	    }
	    
	    return maz_Stack[top--];
	    
	}
	
	//jud1에서 받은 방향을 분석하여 스택에 쌓을지 여부를 결정한다.
	public void jud2(int a, int b)
	{
	    
	    if(a<0||b<0)//받은 a,b가 음수면 맵 밖에 있는 존재이므로 return
	        return;
	    else if(maz_Map[a][b]==0||maz_Map[a][b]==3)//출구 또는 길일때는 스택에 넣는다.
	        push(a,b);
	    else
	        return;
	}
	
	//4방향을 다 검사하기위해 위치변경우를 jud2로 넘긴다.
	public void jud1(int r, int c)
	{
		if(c+1<MAX_SIZE) {
			jud2(r,c+1);
		}
		if(r+1<MAX_SIZE) {
			jud2(r+1,c);
		}
		jud2(r-1,c);
		jud2(r,c-1);
	}
	
	void maz_print()
	{
	    int i,j;
	    for(i=0;i<MAX_SIZE;i++){
	        for(j=0;j<MAX_SIZE;j++){
	            //타일로 예쁘게 바꿔준다.
	            System.out.print(tile[maz_Map[i][j]]+" ");
	        }
	        System.out.println();
	    }
	}
	//쌓은 스택을 표현해준다.
	void stack_print()
	{
	    int i = top;
	    System.out.println("\n=============  <= 쌓은스택");
	    if(i==-1){
	        System.out.println("NO ANY STACK\n");
	        return;
	    }
	    else{
	        while(i!=-1){
	        	System.out.println(maz_Stack[i].x+", "+maz_Stack[i].y);
	            i--;
	        }
	    }
	    System.out.println("=============  <= 쌓은스택");
	}

}
