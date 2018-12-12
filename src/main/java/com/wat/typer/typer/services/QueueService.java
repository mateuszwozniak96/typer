package com.wat.typer.typer.services;

import com.wat.typer.typer.entities.Membership;
import com.wat.typer.typer.entities.Queue;
import com.wat.typer.typer.repositories.QueueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public Queue getQueue(int id) {
        return queueRepository.findById(id).get();
    }

    public void deleteQueue(int id) {
        queueRepository.deleteById(id);
    }

    public List<Queue> getQueuesByLeagues(int id) {
        List<Queue> queues = new ArrayList<>();
        queueRepository.findByLeagueLeagueId(id).forEach(queues::add);
        return queues;
    }
}
