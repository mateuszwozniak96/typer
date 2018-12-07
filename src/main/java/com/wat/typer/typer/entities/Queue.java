package com.wat.typer.typer.entities;

import org.springframework.data.querydsl.QuerydslUtils;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="queue")
public class Queue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="queue_id")
    private int queueId;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name="league_id")
    private League league;

    @OneToMany(mappedBy = "queue", cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Match> match;

    public Queue(){}
    public Queue(League league) {
        this.league = league;
    }

    public int getQueueId() {
        return queueId;
    }

    public void setQueueId(int queueId) {
        this.queueId = queueId;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

}
