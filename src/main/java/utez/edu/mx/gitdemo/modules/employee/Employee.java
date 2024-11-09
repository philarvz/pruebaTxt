package utez.edu.mx.gitdemo.modules.employee;

import jakarta.persistence.*;
import utez.edu.mx.gitdemo.modules.role.Role;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "fullName")
    private String fullName;

    @ManyToOne
    @JoinColumn(name = "role")
    private Role role;




}
