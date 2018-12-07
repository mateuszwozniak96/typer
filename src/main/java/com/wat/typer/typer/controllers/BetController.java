package com.wat.typer.typer.controllers;

import com.wat.typer.typer.entities.Bet;
import com.wat.typer.typer.services.BetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class BetController {
    @Autowired
    private BetService betService;
    @GetMapping("/bets")
    private List<Bet> getBets(){
        return betService.getBets();
    }

    @PostMapping("/bets")
    private void addBet(@RequestBody Bet bet){
        betService.addBet(bet);
    }

}