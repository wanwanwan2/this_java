package chapter5;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		// 2차원 배열 생성
		int[][] scores = {
				{ 80, 90, 96 },
				{ 76, 88}
		};
		
		// 배열의 길이
		System.out.println("1차원 배열 길이(반의 수): " + scores.length);
		System.out.println("2차원 배열의 길이(첫 번째 반의 학생 수): " + scores[0].length);
		System.out.println("2차원 배열의 길이(두 번째 반의 학생 수): " + scores[1].length);
	
		//첫 번째 반의 세번 째 학생의 점수 읽기
		System.out.println("scores[0][2]: " + scores[0][2]);
		//두 번째 반의 두번 째 학생의 점수 읽기
		System.out.println("scores[1][1]: " + scores[1][1]);
		
		//첫 번째 반의 평균 구하기
		int Class1sum = 0;
		for (int i = 0; i < scores[0].length; i++) {
			Class1sum += scores[0][i];
		}
		double Class1avg = (double) Class1sum / scores[0].length;
		System.out.println("첫 번째 반의 평균 : " + Class1avg);
		
		//두 번째 반의 평균 구하기
		int Class2sum = 0;
		for (int i = 0; i < scores[1].length; i++) {
			Class2sum += scores[1][i];
		}
		double Class2avg = (double) Class2sum / scores[1].length;
		System.out.println("두 번째 반의 평균 : " + Class2avg);
		
		
		//전체 학생의 평균 구하기
		int totalStudent = 0;
		int totalSum = 0;
		for (int i = 0; i < scores.length; i++) {
			totalStudent += scores[i].length;
			for (int j = 0; j < scores[i].length; j++) {
				totalSum += scores[i][j];
			}
		}
		double totalavg = (double)totalSum / totalStudent;
		System.out.println("전체 학생의 평균 : " + totalavg);
	}

}
