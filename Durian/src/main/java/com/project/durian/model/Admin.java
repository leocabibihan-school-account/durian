package com.project.durian.model;

import javax.persistence.*;
//admin broken
@Entity
@Table(name="admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @OneToOne(mappedBy = "user", cascade = CascadeType.REMOVE)
    private Long id;

    public Admin(Long id) {
        this.id = id;
    }

    public Admin() {}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
