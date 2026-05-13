import java.util.Scanner;

public class StudentsGradeReport {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 학생 수 입력
        System.out.print("Enter the number of students: ");
        int numStudents = in.nextInt();

        String[] names = new String[numStudents];
        double[] scores = new double[numStudents];
        String[] grades = new String[numStudents];

        double sum = 0;
        double maxScore = 0;

        // 이름 점수 입력받기
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name and score of student " + (i + 1) + ": ");
            names[i] = in.next();
            scores[i] = in.nextDouble();

            sum += scores[i];

            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }

        // GRADE DISTRIBUTION 계산하기
        int[] dist = new int[7];

        for (int i = 0; i < numStudents; i++) {
            if (scores[i] >= 90) {
                grades[i] = "A";
                dist[0]++;
            } else if (scores[i] >= 85) {
                grades[i] = "AB";
                dist[1]++;
            } else if (scores[i] >= 80) {
                grades[i] = "B";
                dist[2]++;
            } else if (scores[i] >= 75) {
                grades[i] = "BC";
                dist[3]++;
            } else if (scores[i] >= 70) {
                grades[i] = "C";
                dist[4]++;
            } else if (scores[i] >= 60) {
                grades[i] = "D";
                dist[5]++;
            } else {
                grades[i] = "F";
                dist[6]++;
            }
        }


        // 출력
        System.out.println("\nThe average score = " + (sum / numStudents));
        System.out.println("The maximum score = " + maxScore);
        
        System.out.println("The student(s) with the maximum score: ");
        for (int i = 0; i < numStudents; i++) {
            if (scores[i] == maxScore) {
                System.out.println(names[i]);
            }
        }

        System.out.println("\nGRADE REPORT");
        for (int i = 0; i < numStudents; i++) {
            System.out.println(names[i] + " - " + grades[i]);
        }

        System.out.println("\nGRADE DISTRIBUTION");
        System.out.println("# of As: " + dist[0]);
        System.out.println("# of ABs: " + dist[1]);
        System.out.println("# of Bs: " + dist[2]);
        System.out.println("# of BCs: " + dist[3]);
        System.out.println("# of Cs: " + dist[4]);
        System.out.println("# of Ds: " + dist[5]);
        System.out.println("# of Fs: " + dist[6]);

        in.close();
    }
}