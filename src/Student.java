public class Student {
	private int schoolNumber;//학번을 나타내는 필드
	private String name;//이름을 나타내는 필드
	private double grade;//성적을 나타내는 필드
	
	public void setNumber(int num) {//학번을 지정하는 메소드
		schoolNumber=num;
	}
	
	public int getNumber() {//학번을 리턴하는 메소드
		return schoolNumber;
	}
	
	public void setName(String str) {//이름을 지정하는 메소드
		name=str;
	}
	
	public String getName() {//이름을 리턴하는 메소드
		return name;
	}
	
	public void setGrade(double num) {//성적을 지정하는 메소드
		grade=num;
	}
	
	public double getGrade() {//성적을 리턴하는 메소드
		return grade;
	}
	
	public boolean pass(double p) {//기준성적을 매개변수로 받아서 합격여부를 알려주는 메소드
		boolean b=false;//합격여부를 나타내는 변수
		if(grade>=p) {//기준성적 이상일 때
			b=true;
		}
		else if(grade<p) {//기준성적 미만일 때
			b=false;
		}
		return b;//합격여부 변수 리턴
	}

}
