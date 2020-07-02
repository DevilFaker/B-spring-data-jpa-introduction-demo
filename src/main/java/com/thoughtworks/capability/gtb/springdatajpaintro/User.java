package com.thoughtworks.capability.gtb.springdatajpaintro;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long age;
    private String avatar;
    private String description;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Education> educationList;

    public void addEducation(Education education){
        educationList.add(education);
    }
}
