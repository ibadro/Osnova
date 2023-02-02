package Zadachi.Alishev.Zad9;

public class Student extends Human{
    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student(String name,String groupName) {
        super(name);
        this.groupName = groupName;
    }
    public void  printInfo(){
        //System.out.println("Этот человек с именем " + super.getName());
        super.printInfo();
        System.out.println("Этот студент с именем " + getName());


    }
}
