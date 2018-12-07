package com.wat.typer.typer.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "match_table")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "match_id")
    private int matchId;

    @Column(name="team_home")
    private String teamHome;
    @Column(name="team_away")
    private String teamAway;
    @Column(name="team_home_goals")
    private int teamHomeGoals;
    @Column(name="team_away_goals")
    private int teamAwayGoals;
    @Column(name="match_date")
    private Date matchDate;


    @OneToMany(mappedBy = "match", cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Bet> bets;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name="queue_id")
    private Queue queue;

    public Match(){}
    public Match(String teamHome, String teamAway, int teamHomeGoals, int teamAwayGoals, Date matchDate, Queue queue) {
        this.teamHome = teamHome;
        this.teamAway = teamAway;
        this.teamHomeGoals = teamHomeGoals;
        this.teamAwayGoals = teamAwayGoals;
        this.matchDate = matchDate;
        this.queue = queue;
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public String getTeamHome() {
        return teamHome;
    }

    public void setTeamHome(String teamHome) {
        this.teamHome = teamHome;
    }

    public String getTeamAway() {
        return teamAway;
    }

    public void setTeamAway(String teamAway) {
        this.teamAway = teamAway;
    }

    public int getTeamHomeGoals() {
        return teamHomeGoals;
    }

    public void setTeamHomeGoals(int teamHomeGoals) {
        this.teamHomeGoals = teamHomeGoals;
    }

    public int getTeamAwayGoals() {
        return teamAwayGoals;
    }

    public void setTeamAwayGoals(int teamAwayGoals) {
        this.teamAwayGoals = teamAwayGoals;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public Queue getQueue() {
        return queue;
    }

    public void setQueue(Queue queue) {
        this.queue = queue;
    }
}
