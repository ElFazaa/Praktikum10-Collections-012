import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class StudentCollectionDemo {
    public static void main(String[] args) {
        // Step 2 & 3: Simpan 5 object Student pada ArrayList
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("S001", "Rina", "Computer Science", "Bandung"));
        students.add(new Student("S002", "Andi", 10, "Cimahi"));
        students.add(new Student("S003", "Dewi", "Information Systems", "Garut"));
        students.add(new Student("S004", "Budi", "Computer Science", "Bandung"));
        students.add(new Student("S005", "Citra", 20, "Sumedang"));

        System.out.println("=== ArrayList (Sebelum Sort) ===");
        System.out.println("Size ArrayList = " + students.size());
        for (Student s : students) {
            System.out.println(s);
        }

        // Step 4: Sort berdasarkan name
        Collections.sort(students, Comparator.comparing(Student::getName));

        System.out.println("\n=== ArrayList (Setelah Sort by Name) ===");
        for (Student s : students) {
            System.out.println(s);
        }

        // Step 5: Eksperimen operasi List (add setelah sort, get, remove)
        System.out.println("\n=== Eksperimen Operasi List (Step 5) ===");
        students.add(new Student("S006", "Ahmad", "Computer Science", "Jakarta"));
        System.out.println("Setelah add Ahmad (tidak otomatis terurut):");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Index " + i + ": " + students.get(i));
        }
        System.out.println("Membaca elemen dengan get(0): " + students.get(0));
        System.out.println("Size sebelum remove(5): " + students.size());
        Student removed = students.remove(5);
        System.out.println("Elemen yang dihapus: " + removed);
        System.out.println("Size sesudah remove(5): " + students.size());

        // Uji filter aman terhadap department campuran (String dan Integer) di ArrayList
        System.out.println("\n=== Filter Computer Science pada ArrayList (Ada Department Integer) ===");
        for (Student s : students) {
            if (s.getDepartment() instanceof String
                    && ((String) s.getDepartment()).equalsIgnoreCase("Computer Science")) {
                System.out.println(s);
            }
        }

        // Step 6: Simpan 5 object Student pada Vector
        Vector<Student> vector = new Vector<>();
        vector.add(new Student("V001", "Alya", "Computer Science", "Bandung"));
        vector.add(new Student("V002", "Raka", "Accounting", "Cimahi"));
        vector.add(new Student("V003", "Sinta", "Computer Science", "Bandung"));
        vector.add(new Student("V004", "Dimas", "Mechanical Engineering", "Garut"));
        vector.add(new Student("V005", "Nadia", "Computer Science", "Sumedang"));

        // Step 7: Filter Computer Science pada Vector
        System.out.println("\n=== Vector (Filter Department: Computer Science) ===");
        for (Student s : vector) {
            if (s.getDepartment() instanceof String
                    && ((String) s.getDepartment()).equalsIgnoreCase("Computer Science")) {
                System.out.println(s);
            }
        }
    }
}
