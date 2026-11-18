public class ArrayStackDemo {
    public static void main(String[] args) {
        System.out.println("=== Step 18: Uji ArrayStack<Integer> (Kapasitas 3) ===");
        ArrayStack<Integer> numbers = new ArrayStack<>(3);
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        System.out.println("Pop 1: " + numbers.pop());
        System.out.println("Pop 2: " + numbers.pop());
        System.out.println("Pop 3: " + numbers.pop());
        System.out.println("isEmpty(): " + numbers.isEmpty());

        System.out.println("\n=== Step 18: Uji ArrayStack<String> (Kapasitas 2) ===");
        ArrayStack<String> texts = new ArrayStack<>(2);
        texts.push("PBO");
        texts.push("Collection");
        System.out.println("Pop 1: " + texts.pop());
        System.out.println("Pop 2: " + texts.pop());
        System.out.println("isEmpty(): " + texts.isEmpty());

        System.out.println("\n=== Step 19: Uji Overflow Error (T10-08) ===");
        ArrayStack<Integer> stackTest = new ArrayStack<>(3);
        stackTest.push(10);
        stackTest.push(20);
        stackTest.push(30);
        System.out.println("Berhasil push: 10, 20, 30 ke stack kapasitas 3.");
        try {
            System.out.println("Mencoba push ke-4 (40)...");
            stackTest.push(40);
        } catch (ArrayStack.ArrayStackException e) {
            System.out.println("Exception tertangkap: " + e.getClass().getSimpleName() + ": " + e.getMessage());
        }

        System.out.println("\n=== Step 19: Verifikasi LIFO & Uji Underflow Error (T10-09) ===");
        System.out.println("Mengosongkan stack (urutan LIFO):");
        while (!stackTest.isEmpty()) {
            System.out.println("Pop: " + stackTest.pop());
        }
        System.out.println("isEmpty(): " + stackTest.isEmpty());
        try {
            System.out.println("Mencoba pop pada stack kosong...");
            stackTest.pop();
        } catch (ArrayStack.ArrayStackException e) {
            System.out.println("Exception tertangkap: " + e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }
}
