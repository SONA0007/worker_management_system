package com.rucha.WorkerManagementSystem.Controller;

import com.rucha.WorkerManagementSystem.Entity.WorkerEntity;
import com.rucha.WorkerManagementSystem.Service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:9090")
@RequestMapping("/api")
public class WorkerDetailsController {

    @Autowired
    private WorkerService workerService;

    // Add worker
    //  localhost:9090/api/add
    @PostMapping("/add")
    public WorkerEntity addWorker(@RequestBody WorkerEntity workerEntity) {
        return workerService.addWorker(workerEntity);
    }

    // Search workers by name
    @GetMapping("/search")
    public List<WorkerEntity> searchWorker(@RequestParam String name) {
        return workerService.findWorkersByName(name);
    }

    // Search workers by department
    @GetMapping("/searchByDepartment")
    public List<WorkerEntity> searchByDepartment(@RequestParam String department) {
        return workerService.findWorkersByDepartment(department);
    }

    // Search workers by skill level
    @GetMapping("/searchBySkillLevel")
    public List<WorkerEntity> searchBySkillLevel(@RequestParam int skillLevel) {
        return workerService.findWorkersBySkillLevel(skillLevel);
    }
}
