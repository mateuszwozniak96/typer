package com.wat.typer.typer.services;

import com.wat.typer.typer.entities.Membership;
import com.wat.typer.typer.repositories.MembershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
