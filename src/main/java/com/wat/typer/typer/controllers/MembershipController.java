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
}

