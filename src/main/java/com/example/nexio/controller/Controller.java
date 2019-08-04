package com.example.nexio.controller;

import com.example.nexio.model.NexioEntity;
import com.example.nexio.repo.NexioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
public class Controller {


    @Autowired
    private NexioRepo nexioRepo;

    @GetMapping("health")
    String health() {
        return "Ok";
    }

    @GetMapping("allTask")
    public ResponseEntity<?> getAllTasks(){
        return ResponseEntity.ok(nexioRepo.findAll());
    }

    @GetMapping("createTask")
    public String createTask(@RequestParam("task") String task){
        NexioEntity entity = new NexioEntity();
        entity.setTask(task);
        nexioRepo.save(entity);
        return "created";
    }

    @GetMapping("deleteTask")
    public String deleteTask(@RequestParam("id") Long id){
        NexioEntity entity = new NexioEntity();
        entity.setId(id);
        nexioRepo.delete(entity);
        return "deleted";
    }

}
