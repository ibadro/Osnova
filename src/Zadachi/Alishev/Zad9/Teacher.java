package Zadachi.Alishev.Zad9;

public class Teacher extends Human {
    private String predmet;

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public Teacher(String name, String predmet) {
        super(name);
        this.predmet = predmet;

    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот препод с именем " + getName());


    }
}
