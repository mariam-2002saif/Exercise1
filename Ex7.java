public class Ex7 {
    public static void main(String[] args) {
        Student [] students=new Student[3];

        Student student1=new Student(1,"mariam",20);
        Student student2=new Student(2,"abrar",20);
        Student student3=new Student(2,"khawla",20);
        students[0]=student1;
        students[1]=student2;
        students[2]=student2;
        for (int i = 0; i <students.length ; i++) {
            System.out.println(students[i]);

        }
    }
}
