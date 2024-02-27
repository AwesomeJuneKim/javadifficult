package selfStudy;

import java.util.HashMap;

 class Student {
	String name="";
	int ban;
	int no;
	int kor;	
	int eng;
	int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
}
class Ex{
	public static void main(String[] args) {
//		ArrayList<Student> list= new ArrayList<Student>();
//		list.add(new Student("자바왕",1,1));
//		list.add(new Student("자바짱",2,2));
//		list.add(new Student("자바킹",2,3));
		
		HashMap<String,Student> map= new HashMap<>();
		map.put("자바왕",new Student("자바왕",1,1,100,100,100));
		Student s= map.get("자바왕");
		System.out.println(map.get("자바왕").name);
		
		
//		Iterator<Student> it = list.iterator();
//		
//		while(it.hasNext()) {
//			Student s=it.next();
//			System.out.println(s.name);
//		}
		
	}
}
