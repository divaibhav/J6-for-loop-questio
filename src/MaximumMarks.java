import java.util.Scanner;

public class MaximumMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students");
        int noOfStudents = scanner.nextInt();
        scanner.nextLine();
        int maxScore = 0;
        String maxScoreName = null;

        for(int i = 1 ; i <= noOfStudents ; i++){

            System.out.println("Enter name of student");
            String name = scanner.nextLine();
            System.out.println("Enter score of student");
            int score = scanner.nextInt();
            if( score > maxScore ){
                maxScore = score;
                maxScoreName = name;
            }
            scanner.nextLine();
        }
        System.out.println("maxScoreName = " + maxScoreName);
        System.out.println("maxScore = " + maxScore);

    }
}
