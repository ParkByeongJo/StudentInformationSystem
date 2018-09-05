import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//입력받기 위한 변수 생성
		Student s1=new Student();//학생 객체 s1
		System.out.print("학번 입력:");
		int schoolNumber1=scan.nextInt();//s1학생의 학번을 입력받음
		scan.nextLine();
		System.out.print("이름 입력:");
		String name1=scan.nextLine();//s1학생의 이름을 입력받음
		System.out.print("성적 입력:");
		double grade1=scan.nextDouble();//s1학생의 성적을 입력받음
		s1.setNumber(schoolNumber1);//입력받은 학번을 s1학생의 학번으로 지정
		s1.setName(name1);//입력받은 이름을 s1학생의 이름으로 지정
		s1.setGrade(grade1);//입력받은 성적을 s1학생의 성적으로 지정
		
		System.out.println(" ");
		
		Student s2=new Student();//학생 객체 s2
		System.out.print("학번 입력:");
		int schoolNumber2=scan.nextInt();//s2학생의 학번 입력
		scan.nextLine();
		System.out.print("이름 입력:");
		String name2=scan.nextLine();//s2학생의 이름 입력
		System.out.print("성적 입력:");
		double grade2=scan.nextDouble();//s2학생의 성적 입력
		s2.setNumber(schoolNumber2);//입력받은 학번을 s2학생의 학번으로 지정
		s2.setName(name2);//입력받은 이름을 s2학생의 이름으로 지정
		s2.setGrade(grade2);//입력받은 성적을 s2학생의 성적으로 지정
		
		System.out.println(" ");
		/*s1학생과 s2학생의 학번을 비교하여 앞선 학번을 출력*/
		if(s1.getNumber()<s2.getNumber()) {
			System.out.println("앞선 학번:"+s1.getNumber());
		}
		
		else if(s2.getNumber()<s1.getNumber()) {
			System.out.println("앞선 학번:"+s2.getNumber());
		}
		
		/*s1학생과 s2학생의 이름을 비교하여 사전적으로 앞선 이름을 출력*/
		if(s1.getName().charAt(0)<s2.getName().charAt(0)) {
			System.out.println("사전적으로 앞선 이름:"+s1.getName());
		}
		
		else if(s2.getName().charAt(0)<s1.getName().charAt(0)) {
			System.out.println("사전적으로 앞선 이름:"+s2.getName());
		}
		
		/*s1학생과 s2학생의 성적을 비교하여 더 높은 성적을 출력*/
		if(s1.getGrade()<s2.getGrade()) {
			System.out.println("높은 성적:"+s2.getGrade());
		}
		
		else if(s2.getGrade()<s1.getGrade()) {
			System.out.println("높은 성적:"+s1.getGrade());
		}
	
		/*s1학생의 합격여부 출력*/
		if(s1.pass(1.5)==true) {
			System.out.println("s1학생은 합격입니다.");
		}
		
		else if(s1.pass(1.5)!=true) {
			System.out.println("s1학생은 불합격입니다.");
		}
		
		/*s2학생의 합격여부 출력*/
		if(s2.pass(1.5)==true) {
			System.out.println("s2학생은 합격입니다.");
		}
		
		else if(s2.pass(1.5)!=true) {
			System.out.println("s2학생은 불합격입니다.");
		}

	}

}
