package actions.tutorial.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "UserDemo", schema = "tutorial")
@Data
public class UserDemo {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;
}
