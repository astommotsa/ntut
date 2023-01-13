import org.junit.Test;
import static org.junit.Assert.assertEquals;

public static char letterGrade(int score) {
    char grade;
    if (score <0 || score > 100)
        grade = 'X';
    else if (score>=90 && score <=100)
        grade = 'A';
    else if (score>=80 && score <90)
        grade = 'B';
    else if (score>=70 && score <80)
        grade = 'C';
    else if (score>=60 && score <70)
        grade = 'D';
    else
        grade ='F';
    return grade;
}

public static void main(String[] args) {
	System.out.print("Enetr the score = ");
	try {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		score = Integer.parseInt(br.readLine());
 		char grade = letterGrade(score);
 		System.out.println("The grade of " + score + " is " + grade);
	} catch (NumberFormatException ex) {
		System.out.println("Not an integer!");
	} catch (IOException e) {
		e.printStackTrace();
	}

	try {
		assertEquals(letterGrade(95), 'A');
        assertEquals(letterGrade(85), 'B');
        assertEquals(letterGrade(75), 'C');
        assertEquals(letterGrade(65), 'D');
        assertEquals(letterGrade(55), 'F');
        assertEquals(letterGrade(-5), 'X');
        assertEquals(letterGrade(105), 'X');
	}catch (IOException e) {
		e.printStackTrace();
	}

	try {
        assertEquals(letterGrade(-1), 'X');
        assertEquals(letterGrade(0), 'F');
        assertEquals(letterGrade(59), 'F');
        assertEquals(letterGrade(60), 'D');
        assertEquals(letterGrade(69), 'D');
        assertEquals(letterGrade(70), 'C');
        assertEquals(letterGrade(79), 'C');
        assertEquals(letterGrade(80), 'B');
        assertEquals(letterGrade(89), 'B');
        assertEquals(letterGrade(90), 'A');
        assertEquals(letterGrade(100), 'A');
        assertEquals(letterGrade(101), 'X');
	}catch (IOException e) {
		e.printStackTrace();
	}
}