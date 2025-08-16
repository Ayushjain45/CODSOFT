import java.util.*;

class Subject {
    String name;
    int marks;

    Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentGradeCalculator {

    private static String getGrade(double percentage) {
        if (percentage >= 90) return "🟢 A+ (Outstanding)";
        else if (percentage >= 80) return "🟢 A (Excellent)";
        else if (percentage >= 70) return "🟡 B (Good)";
        else if (percentage >= 60) return "🟠 C (Average)";
        else if (percentage >= 50) return "🔴 D (Poor)";
        else return "⚫ F (Fail)";
    }

    public static void main(String[] args) {

        
        String studentName = "Ayush Jain";

                    
        List<Subject> subjects = Arrays.asList(
            new Subject("Mathematics", 95),
            new Subject("Physics", 88),
            new Subject("Chemistry", 76),
            new Subject("English", 82),
            new Subject("Computer", 91)
        );

        int totalMarks = 0;
        int maxMarks = 0;
        String topperSubject = "";

        for (Subject s : subjects) {
            totalMarks += s.marks;
            if (s.marks > maxMarks) {
                maxMarks = s.marks;
                topperSubject = s.name;
            }
        }

        double averagePercentage = (double) totalMarks / subjects.size();
        String grade = getGrade(averagePercentage);

        
        System.out.println("\n📘 STUDENT GRADE CARD 📘");
        System.out.println("==========================");
        System.out.println("Name of Student : " + studentName);
        System.out.println("Subjects & Marks:");

        for (Subject s : subjects) {
            System.out.printf(" - %-12s : %3d\n", s.name, s.marks);
        }

        System.out.println("--------------------------");
        System.out.println("Total Marks     : " + totalMarks + "/" + (subjects.size() * 100));
        System.out.printf("Average Percent : %.2f%%\n", averagePercentage);
        System.out.println("Overall Grade   : " + grade);
        System.out.println("Best Subject    : " + topperSubject + " (" + maxMarks + ")");
        System.out.println("==========================");
    }
}