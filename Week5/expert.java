/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5;

/**
 *
 * @author PRIX
 */
public class expert {
    
    static class student {
        String name;
        int[] quizzes;

        student(String studentname, int[] studentquizzes) {
            name = studentname;
            quizzes = studentquizzes;
        }

        double getaverage() {
            int sum = 0;

            for (int i = 0; i < quizzes.length; i++) {
                sum += quizzes[i];
            }

            return (double) sum / quizzes.length;
        }
    }

    public static void main(String[] args) {
        String[] names = {"John", "Mary", "Peter", "Anna", "Mark"};

        int[][] rawscores = {
            {85, 90, 88, 87},
            {95, 90, 92, 91},
            {80, 85, 82, 83},
            {95, 90, 92, 91},
            {88, 86, 89, 87}
        };

        student[] students = new student[names.length];

        for (int i = 0; i < students.length; i++) {
            students[i] = new student(names[i], rawscores[i]);
        }

      
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].getaverage() <
                    students[j + 1].getaverage()) {

                    student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

       
        System.out.println("===== Student Leaderboard =====");
        System.out.printf("%-8s %-10s %-10s%n",
                "Rank", "Name", "Average");

        int rank = 1;

        for (int i = 0; i < students.length; i++) {
            if (i > 0 &&
                students[i].getaverage() !=
                students[i - 1].getaverage()) {
                rank = i + 1;
            }

            System.out.printf("%-8d %-10s %-10.2f%n",
                    rank, students[i].name,
                    students[i].getaverage());
        }

      
        String targetname = "Peter";
        int foundindex = -1;

        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equalsIgnoreCase(targetname)) {
                foundindex = i;
                break;
            }
        }

        if (foundindex != -1) {
            int studentrank = 1;

            for (int i = 1; i <= foundindex; i++) {
                if (students[i].getaverage() !=
                    students[i - 1].getaverage()) {
                    studentrank = i + 1;
                }
            }

            System.out.println("\n" + targetname +
                    "'s rank: " + studentrank);
        } else {
            System.out.println("\nStudent not Found.");
        }
    }
}

