class School {
    String schoolName = "未来IT専門学校";
    String schoolAddress = "那覇市久茂地";

    void showInfo() {
        System.out.println("学校名：" + schoolName);
        System.out.println("住所：" + schoolAddress);
    }
}

class Student extends School {
    String name = "26004 田中";

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("学生名：" + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.showInfo();
    }
}
