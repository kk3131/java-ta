
import java.util.*;

class Person {

    protected String Name;
    protected String Date;

    public Person() {

    }

    public Person(String Name, String Date) {
        this.Name = Name;
        this.Date = Date;
    }

    public void info() {
        System.out.println("姓名:" + Name);
        System.out.println("生日:" + Date);
    }
}

class Student extends Person {

    protected String SchoolNum;
    protected String ClassNum;

    public Student() {

    }

    public Student(String Name, String Date, String SchoolNum, String ClassNum) {
        super(Name, Date);
        this.SchoolNum = SchoolNum;
        this.ClassNum = ClassNum;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("學號:" + SchoolNum);
        System.out.println("班級:" + ClassNum);
    }
}

class Teacher extends Person {

    protected String teach;

    public Teacher() {

    }

    public Teacher(String Name, String Date, String teach) {
        super(Name, Date);
        this.teach = teach;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("教授科目" + teach);
    }
}

public class Inheritance01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入老師 + 學生總人數");
        int person = sc.nextInt();
        sc.nextLine();  // 清除緩衝區的換行符

        Person[] P = new Person[person];
        for (int i = 0; i < P.length; i++) {
            System.out.println("請輸入 1.老師/2.學生");
            int type = sc.nextInt();
            sc.nextLine();  // 清除緩衝區的換行符

            System.out.println("輸入姓名:");
            String name = sc.nextLine();

            System.out.println("輸入生日:");
            String date = sc.nextLine();

            if (type == 1) {
                System.out.println("輸入教授科目:");
                String teach = sc.nextLine();
                P[i] = new Teacher(name, date, teach);
            } else {
                System.out.println("輸入學號:");
                String schoolNum = sc.nextLine();

                System.out.println("輸入班級:");
                String classNum = sc.nextLine();
                P[i] = new Student(name, date, schoolNum, classNum);
            }
        }

        // 輸出所有人員資訊
        System.out.println("\n=== 所有人員資訊 ===");
        for (Person pp : P) {
            pp.info();
            System.out.println();  // 空行分隔
        }

        sc.close();  // 關閉 Scanner
    }
}
