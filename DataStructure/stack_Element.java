
public class stack_Element {
	int x;
	int y;
	
	public stack_Element() {
		
	} // Default 생성자
	
	public stack_Element(int _x) {
		this.x = _x;
		this.y = 0;
	} // 생성자 오버로딩 (x)
	
	public stack_Element(int _x, int _y) {
		this.x = _x;
		this.y = _y;
	} // 생성자 오버로딩 ( x, y )
}
