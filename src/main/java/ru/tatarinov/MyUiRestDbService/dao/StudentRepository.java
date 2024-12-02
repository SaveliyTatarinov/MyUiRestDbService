package ru.tatarinov.MyUiRestDbService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.tatarinov.MyUiRestDbService.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
