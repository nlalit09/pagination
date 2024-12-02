package com.pagination.pagination.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="people")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class People {
    @Id
    private int id;
    private String name;
    private int age;
    private String gender;
    private String country;
//    @UpdateTimestamp
//    private String updateAt;
//    @CreationTimestamp
//    private String createAt;

}
