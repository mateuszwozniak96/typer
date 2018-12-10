package com.wat.typer.typer.controllers;

import com.wat.typer.typer.entities.Membership;
import com.wat.typer.typer.services.MembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MembershipController {
    @Autowired
    private MembershipService membershipService;

    @GetMapping("/memberships")
    private List<Membership> getMemberships(){
        return membershipService.getMemberships();
    }

    @PostMapping("memberships")
    private  void addMembership(@RequestBody Membership membership){
        membershipService.addMembership(membership);
    }

    @GetMapping("/memberships/{id}")
    public Membership getMembership(@PathVariable int id) {
        return membershipService.getMembership(id);
    }

    @GetMapping("/leagues/{id}/memberships/")
    public List<Membership> getMembershipsByLeagues(@PathVariable int id) {
        return membershipService.getMembershipsByLeagues(id);
    }

    @GetMapping("/users/{id}/memberships/")
    public List<Membership> getMembershipsByUsers(@PathVariable int id) {
        return membershipService.getMembershipsByUsers(id);
    }


    @PutMapping(value = "/memberships/{id}")
    public void updateMembership(@RequestBody Membership membership, @PathVariable int id) {
        membershipService.addMembership(membership);
    }

    @DeleteMapping(value = "/memberships/{id}")
    public void deleteMembership(@PathVariable int id) {
        membershipService.deleteMembership(id);
    }
}

