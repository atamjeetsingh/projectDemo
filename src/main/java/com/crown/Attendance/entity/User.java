package com.crown.Attendance.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TABLE_USER")
public class User {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;    
    @Column(length = 50, nullable = false)
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private UserType userType;
    private Boolean ISACTIVE ;
    private Date createDate;
    private Date updateDate;
}
/*
    CREATE TABLE USER (ID INT, FIRST_NAME VARCHAR(255),
 */
