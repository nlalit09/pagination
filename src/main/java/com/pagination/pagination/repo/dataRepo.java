package com.pagination.pagination.repo;


import com.pagination.pagination.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface dataRepo extends JpaRepository<People, Integer> {
}
