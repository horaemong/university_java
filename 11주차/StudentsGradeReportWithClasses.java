import java.util.Scanner;


class Student {
    private String name;
    private double score;
    private String grade;

    // 생성자
    public Student(String name, double score) {
        this.name = name;
        this.score = score;
        this.grade = calculateGrade(score);
    }

    // 학점 계산
    private String calculateGrade(double score) {
        if (score >= 90) return "A";
        else if (score >= 85) return "AB";
        else if (score >= 80) return "B";
        else if (score >= 75) return "BC";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";
    }

    // getter
    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public String getGrade() {
        return grade;
    }
}


public class StudentsGradeReportWithClasses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 학생 수 입력
        System.out.print("Enter the number of students: ");
        int numStudents = in.nextInt();

        Student[] students = new Student[numStudents];

        double sum = 0;
        double maxScore = -1;

        // 이름 점수 입력받기
        for (int i = 0; i < numStudents; i++) {
          System.out.print("Enter name and score of student " + (i + 1) + ": ");
          String name = in.next();
          double score = in.nextDouble();

          students[i] = new Student(name, score);

          sum += score; 

          if (score > maxScore) {
            maxScore = score;
          }
        }

        
        // GRADE DISTRIBUTION 계산하기
        int[] dist = new int[7];

        for (int i = 0; i < numStudents; i++) {
            String grade = students[i].getGrade(); // 객체의 getter 사용
            switch (grade) {
                case "A": dist[0]++; break;
                case "AB": dist[1]++; break;
                case "B": dist[2]++; break;
                case "BC": dist[3]++; break;
                case "C": dist[4]++; break;
                case "D": dist[5]++; break;
                case "F": dist[6]++; break;
            }
        }

        // 출력
        System.out.println("\nThe average score = " + (sum / numStudents));
        System.out.println("The maximum score = " + maxScore);
        
        System.out.println("The student(s) with the maximum score: ");
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getScore() == maxScore) {
                System.out.println(students[i].getName());
            }
        }

        System.out.println("\nGRADE REPORT");
        for (int i = 0; i < numStudents; i++) {
            System.out.println(students[i].getName() + " - " + students[i].getGrade());
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