package actions.tutorial.entity;


import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "userdemo", schema = "tutorial")
@Data
public class UserDemo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;


    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;
}
