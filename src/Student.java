public class Student {
	private int schoolNumber;//�й��� ��Ÿ���� �ʵ�
	private String name;//�̸��� ��Ÿ���� �ʵ�
	private double grade;//������ ��Ÿ���� �ʵ�
	
	public void setNumber(int num) {//�й��� �����ϴ� �޼ҵ�
		schoolNumber=num;
	}
	
	public int getNumber() {//�й��� �����ϴ� �޼ҵ�
		return schoolNumber;
	}
	
	public void setName(String str) {//�̸��� �����ϴ� �޼ҵ�
		name=str;
	}
	
	public String getName() {//�̸��� �����ϴ� �޼ҵ�
		return name;
	}
	
	public void setGrade(double num) {//������ �����ϴ� �޼ҵ�
		grade=num;
	}
	
	public double getGrade() {//������ �����ϴ� �޼ҵ�
		return grade;
	}
	
	public boolean pass(double p) {//���ؼ����� �Ű������� �޾Ƽ� �հݿ��θ� �˷��ִ� �޼ҵ�
		boolean b=false;//�հݿ��θ� ��Ÿ���� ����
		if(grade>=p) {//���ؼ��� �̻��� ��
			b=true;
		}
		else if(grade<p) {//���ؼ��� �̸��� ��
			b=false;
		}
		return b;//�հݿ��� ���� ����
	}

}
