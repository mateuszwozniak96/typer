package com.wat.typer.typer.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="membership")
public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="membership_id")
    private int membershipId;
    @Column(name="points")
    private int points;

    @Column(name="is_admin")
    private boolean isAdmin;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name="user_id")
    private User user;
    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name="league_id")
    private League league;


    @OneToMany(mappedBy = "membership", cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Bet> bets;

    public Membership(){}

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Membership(int points, boolean isAdmin, User user, League league) {
        this.points = points;
        this.isAdmin=isAdmin;

        this.user = user;
        this.league = league;
    }

    public int getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(int membershipId) {
        this.membershipId = membershipId;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }
}
