class Student {
    int rollno;
    String Name;

    void Record(int r, String n) {
        rollno = r;
        Name = n;
    }

    void DisplayInformation() {
        System.out.println("Roll No = " + rollno + "  Name = " + Name);
    }
}

class TestStudent4 {
    public static void main(String[] args) {
        Student S1 = new Student();
        Student S2 = new Student();
        S1.Record(111, "Kabir");
        S2.Record(112, "Anis");
        S1.DisplayInformation();
        S2.DisplayInformation();
    }
}
