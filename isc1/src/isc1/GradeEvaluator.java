package isc1;

public class GradeEvaluator {
    public static void main(String[] args) {

        int score = 85;

        char grade;
        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'D';
                break;
        }
        System.out.println("Your score is " + grade);

    }
}
