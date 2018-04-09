
public class LinkedListMain {
	public static void main(String args[]) {
		
		/////////////////////////////////////////
		////	문제 1 ~ 6 번					/////
		/////////////////////////////////////////
		
		System.out.println("L1=(kim,Lee,Park) 만들기");
		LinkedList L1 = new LinkedList(); // 새로운 리스트 L을 만든다
		L1.addLastNode("Kim");
		L1.addLastNode("Lee");
		L1.addLastNode("Park");
		L1.printList();
		System.out.println("문제1 선두에 Cho를 삽입하라.)"); // 문제 1번
		L1.addFirstNode("Cho");
		System.out.println("문제:2 출력)");
		L1.printList();
		System.out.println("문제3 Yoo삽입)");
		L1.addLastNode("Yoo");
		L1.printList();
		System.out.println("문제4 'Kim'대신 'Song'으로 교체)");
		L1.replaceNode("kim", "Song");
		L1.printList();
		System.out.println("문제5 마지막 노드 삭제)");
		L1.deleteLastNode();
		L1.printList();
		System.out.println("문제6 원소의 개수 출력)");
		L1.printList();
		System.out.println("Number Of Node : " + L1.getNumberOfNode());

		/////////////////////////////////////////
		////	원래 있던 List					/////
		/////////////////////////////////////////
		
		System.out.println("L2=(durian, apple, pear, banana, orange) 만들기");
		LinkedList L2 = new LinkedList(); // 새로운 리스트 L을 만든다
		L2.addLastNode("durian");
		L2.addLastNode("apple");
		L2.addLastNode("banana");
		L2.addLastNode("orange");
		L2.printList();
		
		/////////////////////////////////////////
		////	정수형 으로 만들고				///// 
		////	평균값 계산할 List				/////
		/////////////////////////////////////////

		System.out.println("L3 = (10,20,30,40) 만들기");
		LinkedList L3 = new LinkedList();
		L3.addFirstNode(10);
		L3.addLastNode(20);
		L3.addLastNode(30);
		L3.addLastNode(40);
		L3.printList();
		System.out.println("평균 : " + L3.Calaverage());

		/////////////////////////////////////////
		////	정수형 으로 만들고				///// 
		////	최댓값 계산할 List				/////
		/////////////////////////////////////////
		
		LinkedList L4 = new LinkedList();
		L4.addFirstNode(20);
		L4.addLastNode(10);
		L4.addLastNode(40);
		L4.addLastNode(30);
		L4.printList();
		System.out.println("Max : " + L4.findMax());
		
		/////////////////////////////////////
		/////	문제 9.					/////
		/////			Shift.java		/////
		/////////////////////////////////////

		
		System.out.println("L5=(kim, Lee, Park, Yoo) 만들기");
		LinkedList L5 = new LinkedList(); // 새로운 리스트 L을 만든다
		L5.addLastNode("kim");
		L5.addLastNode("Lee");
		L5.addLastNode("Park");
		L5.addLastNode("Yoo");
		
		System.out.println("=== Shift ===");
		Shift sh = new Shift();
		L5 = sh.shiftNode(L5.findfirstNode());
		
		L5.printList();
		
		
		/////////////////////////////////////
		/////	문제 10.					/////
		/////			Shift.java		/////
		/////////////////////////////////////

		System.out.println("=== reverse ===");
		reverse re = new reverse();
		L5 = re.reverseNode(L5.findfirstNode());
		
		L5.printList();

		
		/////////////////////////////////////
		/////	문제 11.					/////
		/////			Assignments		/////
		/////////////////////////////////////

		
		System.out.println("=== Assignments ===\nL6 만들기");
		LinkedList L6 = new LinkedList();
		
		L6.addLastNode("홍길동",50);
		L6.addLastNode("김진",100);
		L6.addLastNode("김철수",85);
		L6.addLastNode("김영희",95);
		L6.addLastNode("황석진",100); // Make Linked List
		
		System.out.println("학생 성적 평균 : "+L6.Calaverage()); // Calaverage()
		System.out.println("학생중 가장 높은 성적을 받은 학생 이름 : "+L6.scoreName(L6.findMax())); // Find Student Name of Max Score
		
	}
}
