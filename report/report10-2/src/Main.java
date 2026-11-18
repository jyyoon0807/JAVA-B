import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student> {
    String name;
    double weight;

    public Student(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.weight, o.weight);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10;
        Student[] students = new Student[n];
        double totalWeight = 0;

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "번째 학생 이름과 몸무게 입력: ");
            String name = scanner.next();
            double weight = scanner.nextDouble();
            students[i] = new Student(name, weight);
            totalWeight += weight;
        }

        double average = totalWeight / n;
        int aboveAverageCount = 0;
        for (Student s : students) {
            if (s.weight >= average) {
                aboveAverageCount++;
            }
        }
        double ratio = (double) aboveAverageCount / n * 100;

        Arrays.sort(students);

        System.out.println("\n--- 결과 ---");
        System.out.println("평균 몸무게: " + average + " kg");
        System.out.println("평균 이상자 비율: " + ratio + "% (" + aboveAverageCount + "명)");
        System.out.println("몸무게 하위 2명: " + students[0].name + "(" + students[0].weight + "kg), " + students[1].name + "(" + students[1].weight + "kg)");
        System.out.println("몸무게 상위 2명: " + students[n-1].name + "(" + students[n-1].weight + "kg), " + students[n-2].name + "(" + students[n-2].weight + "kg)");

        scanner.close();
    }
}