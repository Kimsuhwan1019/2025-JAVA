package week4;

public class IfNested {
	public static void main(String[] args) {
		//중첩 if 문
		//점수: 0~99 필요
		int score = (int)(Math.random() * 100);
		System.out.println("점수: " + score);
		
		String grade;
		
		if(score >= 90) {
			if(score > 95)
				grade = "A+";
			else if (score > 93) 
				//93 < score <= 95
				grade = "A0";
			else
				//90 <= score <= 93
				grade = "A-";
		}
		else if(score >= 80) {
			if(score > 85)
				grade = "B+";
			else if (score > 83) 
				//83 < score <= 85
				grade = "B0";
			else
				//80 <= score <= 83
				grade = "B-";
		}
		//score < 80
		else
			grade = "c";
		
		System.out.println("등급: " + grade);
			}		
	}