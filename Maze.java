
public class Maze {

	
	public static final int MAX_SIZE = 10; // �迭(���� Ÿ���� �� ���� �Ǵ� ������ ��)
	public static final int MAX_STACK = 20;// ������ ���� ������

	int element;

	stack_Element current = new stack_Element(1,0); // ���簪�� ��Ÿ�� current ���� (1,0) �� �ʱⰪ
	stack_Element entry = new stack_Element(1,0); // �Ա��� entry ���� �� (1,0)���� �ʱ�ȭ
	stack_Element[] maz_Stack = new stack_Element[MAX_STACK];
	char tile[] = {'��','��','��','��','��'}; // ���ڸ� ������� �ٲ��� �迭
	int top = -1; //������ top
	// 0 : ��, 1 : ���, 2 : ������ġ, 3 : �ⱸ, 4 : ������ ��
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
	
	// Default ������
	public Maze() {
		
	}
	
	// ����ٸ� true �ƴϸ� false �� ����
	public boolean is_empty()
	{
	    return (top == -1);
	}
	// ��á�ٸ� true �ƴϸ� false �� ����
	public boolean is_full()
	{
	    return (top==MAX_STACK-1);
	}
	//���ÿ��ٰ� (x,y)�� �����Ѵ�.
	public void push(int _x, int _y)
	{
	    stack_Element nStack = new stack_Element(_x,_y);
	    //������ ��á�ٸ� error�� ���̸� ����
	    if(is_full()){
	        System.out.println("Stack error");
	        return;
	    }
	    else
	    {
	        maz_Stack[++top] = nStack;
	    }
	}
	//������ pop�����̶� ����.
	public stack_Element pop()
	{
	    if(is_empty()){
	        System.out.println("Stack error");
	        System.exit(1);
	    }
	    
	    return maz_Stack[top--];
	    
	}
	
	//jud1���� ���� ������ �м��Ͽ� ���ÿ� ������ ���θ� �����Ѵ�.
	public void jud2(int a, int b)
	{
	    
	    if(a<0||b<0)//���� a,b�� ������ �� �ۿ� �ִ� �����̹Ƿ� return
	        return;
	    else if(maz_Map[a][b]==0||maz_Map[a][b]==3)//�ⱸ �Ǵ� ���϶��� ���ÿ� �ִ´�.
	        push(a,b);
	    else
	        return;
	}
	
	//4������ �� �˻��ϱ����� ��ġ����츦 jud2�� �ѱ��.
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
	            //Ÿ�Ϸ� ���ڰ� �ٲ��ش�.
	            System.out.print(tile[maz_Map[i][j]]+" ");
	        }
	        System.out.println();
	    }
	}
	//���� ������ ǥ�����ش�.
	void stack_print()
	{
	    int i = top;
	    System.out.println("\n=============  <= ��������");
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
	    System.out.println("=============  <= ��������");
	}

}
