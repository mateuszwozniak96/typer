package com.wat.typer.typer.entities;

import javax.persistence.*;
import javax.websocket.ClientEndpoint;
import java.util.Date;

@Entity
@Table(name="bet")
public class Bet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bet_id")
    private int betId;

    @Column(name="team_home_goals")
    private int teamHomeGoals;

    @Column(name="team_away_goals")
    private int teamAwayGoals;

    @Column(name="end_date")
    private Date endDate;


    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name="match_id")
    private Match match;
    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name="membership_id")
    private Membership membership;

    public Bet(){

    }

    public Bet(int teamHomeGoals, int teamAwayGoals, Date endDate, Match match, Membership membership) {
        this.teamHomeGoals = teamHomeGoals;
        this.teamAwayGoals = teamAwayGoals;
        this.endDate = endDate;
        this.match = match;
        this.membership = membership;
    }

    public int getBetId() {
        return betId;
    }

    public void setBetId(int betId) {
        this.betId = betId;
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

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }
}
