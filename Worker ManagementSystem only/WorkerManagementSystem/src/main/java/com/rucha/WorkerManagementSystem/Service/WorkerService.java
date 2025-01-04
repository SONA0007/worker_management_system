package com.rucha.WorkerManagementSystem.Service;

import com.rucha.WorkerManagementSystem.Entity.WorkerEntity;
import com.rucha.WorkerManagementSystem.Repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkerService {

    @Autowired
    private WorkerRepository workerRepository;

    public WorkerEntity addWorker(WorkerEntity workerEntity) {
        return workerRepository.save(workerEntity);
    }

    public List<WorkerEntity> findWorkersByName(String name) {
        return workerRepository.findByName(name);
    }

    public List<WorkerEntity> findWorkersByDepartment(String department) {
        return workerRepository.findByDepartment(department);
    }

    public List<WorkerEntity> findWorkersBySkillLevel(int skillLevel) {
        return workerRepository.findBySkill1GreaterThanEqual(skillLevel);
    }

    public Optional<WorkerEntity> getWorkerById(Long id) {
        return workerRepository.findById(id);
    }
}
