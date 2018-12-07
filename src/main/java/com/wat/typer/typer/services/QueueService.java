package com.wat.typer.typer.services;

import com.wat.typer.typer.entities.Queue;
import com.wat.typer.typer.repositories.QueueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueueService {
    @Autowired
    private QueueRepository queueRepository;

    public List<Queue> getQueues() {
        return queueRepository.findAll();
    }

    public void addQueue(Queue queue) {
        queueRepository.save(queue);
    }
}
