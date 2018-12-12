package com.wat.typer.typer.services;

import com.wat.typer.typer.entities.Membership;
import com.wat.typer.typer.repositories.MembershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MembershipService {
    @Autowired
    private MembershipRepository membershipRepository;

    public List<Membership> getMemberships() {
        return membershipRepository.findAll();
    }

    public void addMembership(Membership membership) {
        membershipRepository.save(membership);
    }

    public Membership getMembership(int id) {
        return membershipRepository.findById(id).get();
    }

    public void deleteMembership(int id) {
        membershipRepository.deleteById(id);
    }

    public List<Membership> getMembershipsByLeagues(int id) {
        List<Membership> memberships = new ArrayList<>();
        membershipRepository.findByLeagueLeagueId(id).forEach(memberships::add);
        return memberships;
    }

    public List<Membership> getMembershipsByUsers(int id) {
        List<Membership> memberships = new ArrayList<>();
        membershipRepository.findByUserUserId(id).forEach(memberships::add);
        return memberships;
    }
}
