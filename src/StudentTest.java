/*
 * ���ϸ�: StudentTest.java
 * �ۼ���: 2018.4.11
 * �ۼ���: �ں���
 * ����: Student Ŭ������ �̿��� ���α׷�
 */
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//�Է¹ޱ� ���� ���� ����
		Student s1=new Student();//�л� ��ü s1
		System.out.print("�й� �Է�:");
		int schoolNumber1=scan.nextInt();//s1�л��� �й��� �Է¹���
		scan.nextLine();
		System.out.print("�̸� �Է�:");
		String name1=scan.nextLine();//s1�л��� �̸��� �Է¹���
		System.out.print("���� �Է�:");
		double grade1=scan.nextDouble();//s1�л��� ������ �Է¹���
		s1.setNumber(schoolNumber1);//�Է¹��� �й��� s1�л��� �й����� ����
		s1.setName(name1);//�Է¹��� �̸��� s1�л��� �̸����� ����
		s1.setGrade(grade1);//�Է¹��� ������ s1�л��� �������� ����
		
		System.out.println(" ");
		
		Student s2=new Student();//�л� ��ü s2
		System.out.print("�й� �Է�:");
		int schoolNumber2=scan.nextInt();//s2�л��� �й� �Է�
		scan.nextLine();
		System.out.print("�̸� �Է�:");
		String name2=scan.nextLine();//s2�л��� �̸� �Է�
		System.out.print("���� �Է�:");
		double grade2=scan.nextDouble();//s2�л��� ���� �Է�
		s2.setNumber(schoolNumber2);//�Է¹��� �й��� s2�л��� �й����� ����
		s2.setName(name2);//�Է¹��� �̸��� s2�л��� �̸����� ����
		s2.setGrade(grade2);//�Է¹��� ������ s2�л��� �������� ����
		
		System.out.println(" ");
		/*s1�л��� s2�л��� �й��� ���Ͽ� �ռ� �й��� ���*/
		if(s1.getNumber()<s2.getNumber()) {
			System.out.println("�ռ� �й�:"+s1.getNumber());
		}
		
		else if(s2.getNumber()<s1.getNumber()) {
			System.out.println("�ռ� �й�:"+s2.getNumber());
		}
		
		/*s1�л��� s2�л��� �̸��� ���Ͽ� ���������� �ռ� �̸��� ���*/
		if(s1.getName().charAt(0)<s2.getName().charAt(0)) {
			System.out.println("���������� �ռ� �̸�:"+s1.getName());
		}
		
		else if(s2.getName().charAt(0)<s1.getName().charAt(0)) {
			System.out.println("���������� �ռ� �̸�:"+s2.getName());
		}
		
		/*s1�л��� s2�л��� ������ ���Ͽ� �� ���� ������ ���*/
		if(s1.getGrade()<s2.getGrade()) {
			System.out.println("���� ����:"+s2.getGrade());
		}
		
		else if(s2.getGrade()<s1.getGrade()) {
			System.out.println("���� ����:"+s1.getGrade());
		}
	
		/*s1�л��� �հݿ��� ���*/
		if(s1.pass(1.5)==true) {
			System.out.println("s1�л��� �հ��Դϴ�.");
		}
		
		else if(s1.pass(1.5)!=true) {
			System.out.println("s1�л��� ���հ��Դϴ�.");
		}
		
		/*s2�л��� �հݿ��� ���*/
		if(s2.pass(1.5)==true) {
			System.out.println("s2�л��� �հ��Դϴ�.");
		}
		
		else if(s2.pass(1.5)!=true) {
			System.out.println("s2�л��� ���հ��Դϴ�.");
		}

	}

}
