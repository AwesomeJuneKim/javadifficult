package homework;



	// 하나의 java file에 Student 객체를 정의하고 구현하는 실습
	/*
	 * static 멤버 함수 구현 toString() 함수 구현과 사용 객체 배열 사용
	 */
	abstract class InterfaceStudents {
		public abstract void showObject();
	}

	class Student extends InterfaceStudents {
		static int countStudents=0;// 객체수
		int sid=0;// 학번
		String sname=""; // 학생 이름
		String city=""; // 주소 도시

		public String toString() {
			return "sid=" + sid + ", sname=" + sname + ", city=" + city;
		}
		public Student() {
			
		}
		public Student(int sid) {
			this.sid=sid;
		}
		public Student(int sid, String name, String city) {
			this(sid);
			this.sname=name;
			this.city=city;
		}

		public void showObject() {
			System.out.println("[" + sid + ", " + sname + ", " + city + "]");
		}

		static void showNumberObjects() {// 생성된 객체수를 출력한다.
			System.out.println(" 생성객체수=" + countStudents);
		}
	}

	class WorkStudent extends Student {
		String eno;
		String company;
		
		public WorkStudent() {
			
		}
		public WorkStudent(int sid, String sname, String city, String eno, String company) {
			super(sid,sname,city);
			this.eno=eno;
			this.company=company;
		}

		
		public String toString() {
			 return super.toString()+"eno="+eno+"company="+company;
		 }

		public void showObject() {
			// Student 출력 코드 추가
			super.showObject();
			System.out.println("[" + eno + ", " + company + "]");
		}
	}

	class CodingWorkStudent extends WorkStudent {
		String language;

		public CodingWorkStudent(String language) {
			super();
			this.language = language;
		}
		public String toString() {
			 return super.toString()+"language="+language;
		 }


		public CodingWorkStudent() {
			// TODO Auto-generated constructor stub
		}

		public void showObject() {
			// WorkStudent 출력 코드 추가
			super.showObject();
			System.out.println("[" + language + "]");
		}
	}

	// 생성자 구현한다.
	public class Test_Object {
		static void showObjects(InterfaceStudents is) {
			is.showObject();
		}

		public static void main(String[] args) {
			
			Student arry[] = new Student[6];
			Student.showNumberObjects();
			arry[0] = new Student();
			arry[1] = new Student(202301);
			arry[2] = new Student(202301,"Hong","Busan");
			arry[3] = new WorkStudent(1234,"Hong","Busan","e1","naver");
			arry[4] = new CodingWorkStudent();
			arry[5] = new WorkStudent();
			Student.showNumberObjects();
			for (Student s : arry) {
				System.out.println(s.toString());
			}
			for (Student sx : arry) {
				showObjects(sx);
			}
		}

	}


