import java.util.*;

public class Main {

    // Function to get grade based on marks
    public static char getGrade(int marks) {

        // Write your conditions here

        return 'X';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of students
        int n = sc.nextInt();

        // Count array for:
        // A B C D E F X
        int[] count = new int[7];

        // Priority order
        char[] grades = {'A', 'B', 'C', 'D', 'E', 'F', 'X'};

        // Read marks
        for (int i = 0; i < n; i++) {

            int marks = sc.nextInt();

            char grade = getGrade(marks);

            // Increase corresponding count
            switch (grade) {

                case 'A':
                    count[0]++;
                    break;

                case 'B':
                    count[1]++;
                    break;

                case 'C':
                    count[2]++;
                    break;

                case 'D':
                    count[3]++;
                    break;

                case 'E':
                    count[4]++;
                    break;

                case 'F':
                    count[5]++;
                    break;

                default:
                    count[6]++;
            }
        }

        // Find grade with maximum count
        int maxIndex = 0;

        for (int i = 1; i < 7; i++) {

            // Strictly greater because
            // earlier index already has higher priority
            if (count[i] > count[maxIndex]) {
                maxIndex = i;
            }
        }

        // Print answer
        System.out.println(grades[maxIndex]);

        sc.close();
    }
}