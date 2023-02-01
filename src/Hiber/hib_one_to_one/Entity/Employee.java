package Hiber.hib_one_to_one.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@Table(name = "employees")
public class Employee {
    @Column
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private   int id;
    @Column(name = "name")
    private String name;
    @Column
    private String surname;
    @Column
    private String department;
    @Column
    private int salary;
    @OneToOne(cascade = CascadeType.ALL) // Если не прописать - по дефолту не раб. All - означат что при удалении удалятся и его связанные детали так и сохранение
    @JoinColumn(name = "details_id")
    private Detail empDetail;

    public Employee(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public Detail getEmpDetail() {
        return empDetail;
    }

    public void setEmpDetail(Detail empDetail) {
        this.empDetail = empDetail;
    }
}
