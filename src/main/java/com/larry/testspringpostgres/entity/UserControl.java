package com.larry.testspringpostgres.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "user_control")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserControl {
    @Id
    private Long id;
    private Date date;
    private String email;
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    private String password;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "ava_url")
    private String avaUrl;
}
