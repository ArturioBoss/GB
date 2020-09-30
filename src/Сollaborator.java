public class Сollaborator {
    private String name;
    private String position;
    private String email;
    private int tel;
    private int salary;
    private int age;

    public Сollaborator(String name, String position, String email, int tel, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.println(name+ " "+position+" "+email+" "+tel+" "+salary+" "+age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
