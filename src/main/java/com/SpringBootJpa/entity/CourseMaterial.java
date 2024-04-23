package com.SpringBootJpa.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_course_material")
public class CourseMaterial {

    @Id
    @SequenceGenerator(
            name = "course_material_sequence",
            sequenceName = "course_material_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "course_material_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long courseMaterialId;
    private String url;

//    @OneToMany
//    @JoinColumn(
//            name = "course_id",
//            referencedColumnName = "courseId"
//    )
//    private Course course;
}
