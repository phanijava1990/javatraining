//Encapsulation: Binding of fields and methods

public class Student {

    private Integer id;
    private String name;
    private String city;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

class StudentData{
    public static void main(String[] args) {
        Student s=new Student();
        s.setId(1);
        s.setName("Student1");
        s.setCity("Pune");

        System.out.println(s.getId()+" "+s.getName()+" "+s.getCity());
    }
}