package com.SpringBootJpa.entity;


import jakarta.persistence.*;
import lombok.*;



@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "tbl_guardian")
public class Guardian {


    @Id
    @SequenceGenerator(
            name = "guardian_sequence",
            sequenceName = "guardian_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "guardian_sequence",
            strategy = GenerationType.SEQUENCE
    )
    @Column(name = "guardian_id")
    private Long guardianId;

    @Column(name = "guardian_name")
    private String guardianName;

    @Column(name = "guardian_email")
    private String guardianEmail;

    @Column(name = "guardian_mobile")
    private String guardianMobile;
}
