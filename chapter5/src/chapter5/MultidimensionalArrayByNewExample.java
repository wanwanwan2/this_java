package chapter5;

public class MultidimensionalArrayByNewExample {

	public static void main(String[] args) {
		// 각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
		int[][] mathScores = new int[2][3];
		// 배열 항목 초기값 출력
		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.println("mathScores[" + i + "][" + j + "]: " + mathScores[i][j]);
			}
		}
		System.out.println();
		// 배열 항목 값 변경
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;

		// 전체 학생의 수학 평균 구하기
		int totalStudent = 0;
		int totalMathSum = 0;
		for (int i = 0; i < mathScores.length; i++) {
			totalStudent += mathScores[i].length;
			for (int j = 0; j < mathScores[i].length; j++) {
				totalMathSum += mathScores[i][j];
			}
		}
		double totalMathAvg = (double) totalMathSum / totalStudent;
		System.out.println("전체 학생의 수학 평균 : " + totalMathAvg);
		System.out.println();

		// 각 반의 학생 수가 다를 경우 점수 저장을 위한 2차원 배열 생성
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];

		// 배열 항목 초기화 값 출력
		for (int i = 0; i < englishScores.length; i++) {
			for (int j = 0; j < englishScores[i].length; j++) {

				System.out.println("englishScores[" + i + "][" + j + "]: " 
				+ englishScores[i][j]);
			}
		}
		System.out.println();
		
		//배열 항목 값 변경
		englishScores[0][0] = 90;
		englishScores[0][1] = 91;
		englishScores[1][0] = 92;
		englishScores[1][1] = 93;
		englishScores[1][2] = 94;
		
		//전체 학생의 영어 평균 구하기
		totalStudent = 0;
		int totalEnglishScores = 0;
		for (int i = 0; i < englishScores.length; i++) {
			totalStudent += englishScores[i].length;
			for (int j = 0; j < englishScores[i].length; j++) {
				totalEnglishScores += englishScores[i][j];
			}
		}
		
		double totalEnglishAvg = (double) totalEnglishScores / totalStudent;
		System.out.println("전체 학생의 영어 평균 : " + totalEnglishAvg);
		
	}

}
