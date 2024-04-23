package com.SpringBootJpa.entity;


import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
        name = "tbl_student",
        uniqueConstraints = @UniqueConstraint(
                name = "studentEmail_unique",
                columnNames ="email_address"
  )

)
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName="student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy =  GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long studentId;
    private String firstName;
    private  String lastName;
    private  String studentMobile;

    @Column(name = "email_address", nullable = false)
    private String studentEmail;
}
