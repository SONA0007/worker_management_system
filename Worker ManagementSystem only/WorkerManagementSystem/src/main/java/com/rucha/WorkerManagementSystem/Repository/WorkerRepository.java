package com.rucha.WorkerManagementSystem.Repository;

import com.rucha.WorkerManagementSystem.Entity.WorkerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkerRepository extends JpaRepository<WorkerEntity, Long> {

    // Find workers by name
    List<WorkerEntity> findByName(String name);

    // Find workers by department
    List<WorkerEntity> findByDepartment(String department);

    // Find workers by skill level (e.g., filtering based on a certain skill)
    List<WorkerEntity> findBySkill1GreaterThanEqual(int skillLevel);

    // Example: Find workers who have evaluation due after a certain date
    List<WorkerEntity> findByEvaluationDateAfter(String evaluationDate);
}
