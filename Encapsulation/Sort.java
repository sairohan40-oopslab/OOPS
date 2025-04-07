import java.util.Arrays;

class StudentMarks {
    private int[] marks;

    public StudentMarks(int[] marks) {
        this.marks = marks;
    }

    public void sortMarks() {
        Arrays.sort(marks);
    }

    public void displayMarks() {
        System.out.print("Sorted Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        int[] data = {85, 72, 90, 66, 78};
        StudentMarks student = new StudentMarks(data);
        student.sortMarks();
        student.displayMarks();
    }
}
