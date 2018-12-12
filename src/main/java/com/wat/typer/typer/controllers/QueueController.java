package com.wat.typer.typer.controllers;

import com.wat.typer.typer.entities.Queue;
import com.wat.typer.typer.services.QueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class QueueController {
    @Autowired
    private QueueService queueService;

    @GetMapping("/queues")
    private List<Queue> getQueues(){
        return queueService.getQueues();
    }

    @PostMapping("/queues")
    private void addQueue(@RequestBody Queue queue){
        queueService.addQueue(queue);
    }

    @GetMapping("/queues/{id}")
    public Queue getQueue(@PathVariable int id) {
        return queueService.getQueue(id);
    }

    @GetMapping("/leagues/{id}/queues/")
    public List<Queue> getQueuesByLeagues(@PathVariable int id) {
        return queueService.getQueuesByLeagues(id);
    }

    @PutMapping(value = "/queues/{id}")
    public void updateQueue(@RequestBody Queue queue, @PathVariable int id) {
        queueService.addQueue(queue);
    }

    @DeleteMapping(value = "/queues/{id}")
    public void deleteUser(@PathVariable int id) {
        queueService.deleteQueue(id);
    }

}
