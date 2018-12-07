package com.wat.typer.typer.controllers;

import com.wat.typer.typer.entities.Queue;
import com.wat.typer.typer.services.QueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
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

}
