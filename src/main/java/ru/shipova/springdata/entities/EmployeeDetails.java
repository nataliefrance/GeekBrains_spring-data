package ru.shipova.springdata.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "employees_details")
public class EmployeeDetails implements Serializable {
    private static final long serialVersionUID = -3345483994643602633L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "city")
    private String city;

    // Если в этом классе убрать поле employee, то получится однонаправленная связь: сотрудник
    // сможет ссылаться на свои детали, а детали нет.
    // В данном же случае прописана двунаправленная связь
    @OneToOne(mappedBy = "details")
    private Employee employee;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeDetails() {
    }

    @Override
    public String toString() {
        return String.format("EmployeeDetails [id = %d, email = %s, city = %s, employee.name = %s]", id, email, city, employee.getName());
    }
}
