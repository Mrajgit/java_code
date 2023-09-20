class Student {
    private String name;
    private String regNumber;
    private String fatherName;
    private String address;
    private String email;
    private String mobileNumber;
    public Student(String name, String regNumber, String fatherName, String address, String email, String mobileNumber) {
        this.name = name;
        this.regNumber = regNumber;
        this.fatherName = fatherName;
        this.address = address;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRegNumber() {
        return regNumber;
    }
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }
    public String getFatherName() {
        return fatherName;
    }
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + regNumber);
        System.out.println("Father's Name: " + fatherName);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Mobile Number: " + mobileNumber);
    }
    public static void printDetailsByRegNumber(Student[] students, String regNumber) {
        for (Student student : students) {
            if (student.getRegNumber().equals(regNumber)) {
                student.printDetails();
                break;
            }
        }
    }
}
class UGStudent extends Student {
    private String qualifyingDegree;
    private double marks;
    public UGStudent(String name, String regNumber, String fatherName, String address, String email, String mobileNumber, String qualifyingDegree, double marks) {
        super(name, regNumber, fatherName, address, email, mobileNumber);
        this.qualifyingDegree = qualifyingDegree;
        this.marks = marks;
    }
    public String getQualifyingDegree() {
        return qualifyingDegree;
    }
    public void setQualifyingDegree(String qualifyingDegree) {
        this.qualifyingDegree = qualifyingDegree;
    }
    public double getMarks() {
        return marks;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Qualifying Degree: " + qualifyingDegree);
        System.out.println("Marks: " + marks);

    }
}
class PGStudent extends Student {
        private String qualifyingDegree;
        private double marks;
        public PGStudent(String name, String regNumber, String fatherName, String address, String email, String mobileNumber, String qualifyingDegree, double marks) {
            super(name, regNumber, fatherName, address, email, mobileNumber);
            this.qualifyingDegree = qualifyingDegree;
            this.marks = marks;
        }
        public String getQualifyingDegree() {
            return qualifyingDegree;
        }
        public void setQualifyingDegree(String qualifyingDegree) {
            this.qualifyingDegree = qualifyingDegree;
        }
        public double getMarks() {
            return marks;
        }
        public void setMarks(double marks) {
            this.marks = marks;
        }
        @Override
        public void printDetails() {
            super.printDetails();
            System.out.println("Qualifying Degree: " + qualifyingDegree);
            System.out.println("Marks: " + marks);
        }
    }
    public class studentData {
        public static void main(String[] args) {
            Student[] students = new Student[3];
            UGStudent ugStudent1 = new UGStudent("John Doe", "UG123", "John Doe Sr.", "123 Main St.", "johndoe@example.com", "1234567890", "Bachelor's Degree", 80.5);
            students[0] = ugStudent1;
            UGStudent ugStudent2 = new UGStudent("Jane Doe", "UG456", "John Doe Sr.", "123 Main St.", "janedoe@example.com", "0987654321", "Bachelor's Degree", 90.0);
            students[1] = ugStudent2;
            PGStudent pgStudent = new PGStudent("Bob Smith", "PG123", "Tom Smith", "456 Elm St.", "bobsmith@example.com", "9876543210", "Master's Degree", 85.0);
            students[2] = pgStudent;
            for (Student student : students) {
                student.printDetails();
                System.out.println();
            }
            System.out.println("Details of student with registration number UG123:");
            Student.printDetailsByRegNumber(students, "UG123");
        }
    }