package school;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentArray[] = new Student[3];
		
		studentArray[0] = new Student("홍길동", 15, 171, 81);
		studentArray[1] = new Student("한사람", 13, 183, 72);
		studentArray[2] = new Student("임걱정", 16, 175, 65);
		
		Student s = new Student();
		double sumAge = 0;
		double sumHeight = 0;
		double sumWeight = 0;
		for(int i = 0; i<studentArray.length; i++) {
			sumAge += studentArray[i].getAge();
			sumHeight += studentArray[i].getHeight();
			sumWeight += studentArray[i].getWeight();
		}
		System.out.printf("%s%.2f", "나이의 평균 : ", sumAge/studentArray.length);
		System.out.printf("\n%s%.2f", "신장의 평균 : ", sumHeight/studentArray.length);
		System.out.printf("\n%s%.2f", "몸무게의 평균 : ", sumWeight/studentArray.length);
	}

}
