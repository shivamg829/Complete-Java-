class Student {
    int id;
    String name;
    int age;
}
public class ArrayExample {
    public static void main(String[] args) {
        // 1D array initialization
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        // Another 1D array
        int arr1[] = new int[5];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        
        // 2D array
        int nums[][] = new int[2][3];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int)(Math.random() * 100);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        
        // Jagged array
        int jagged[][] = new int[3][];
        jagged[0] = new int[2];
        jagged[1] = new int[3];
        jagged[2] = new int[4];
        
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = (int)(Math.random() * 100);
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        // Array of objects
        Student[] students = new Student[3];
        students[0] = new Student();
        students[0].id = 1;
        students[0].name = "Alice";
        students[0].age = 20;
        students[1] = new Student();
        students[1].id = 2;
        students[1].name = "Bob";
        students[1].age = 22;
        students[2] = new Student();
        students[2].id = 3;
        students[2].name = "Charlie";
        students[2].age = 21;

        for (int i = 0; i < students.length; i++) {
            System.out.println("ID: " + students[i].id + ", Name: " + students[i].name + ", Age: " + students[i].age);
        }

        // Character array
        String str = "Hello";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
    }
}