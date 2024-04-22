public class Student {
//    private int id;
//    private String name;
//    private String email;
//    private double GPA;
//
//    public Student(int id, String name, String email, double GPA) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//        this.GPA = GPA;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public double getGPA() {
//        return GPA;
//    }
//
//    public void setGPA(double GPA) {
//        this.GPA = GPA;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", email='" + email + '\'' +
//                ", GPA=" + GPA +
//                '}';
//    }

    private int id ;
    private String name;
    private String email;
    private double GPa;

    public Student(int id, String name, String email, double GPa) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.GPa = GPa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getGPa() {
        return GPa;
    }

    public void setGPa(double GPa) {
        this.GPa = GPa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", GPa=" + GPa +
                '}';
    }
}
