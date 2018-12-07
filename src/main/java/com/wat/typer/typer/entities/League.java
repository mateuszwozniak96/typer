package com.wat.typer.typer.entities;

import javax.persistence.*;
import javax.swing.plaf.metal.MetalMenuBarUI;
import java.util.List;

@Entity
@Table(name="league")
public class League {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="league_id")
    private int leagueId;

    @Column(name="league_name")
    private String leagueName;

    @OneToMany(mappedBy = "league", cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Membership> memberships;

    @OneToMany(mappedBy = "league", cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Queue> queues;

    public League(){}
    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }
}
