package com.rucha.WorkerManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class WorkerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Worker_name")
    private String name;

    private String department;
    private String subDepartment;
    private String joinDate;
    private String evaluationDate;
    private String education;
    private Integer plant;

    private int skill1;
    private int skill2;
    private int skill3;
    private int skill4;
    private int skill5;
    private int skill6;
    private int skill7;
    private int skill8;
    private int skill9;
    private int skill10;
    private int skill11;

    private int rskill1;
    private int rskill2;
    private int rskill3;
    private int rskill4;
    private int rskill5;
    private int rskill6;
    private int rskill7;
    private int rskill8;
    private int rskill9;
    private int rskill10;
    private int rskill11;

}
