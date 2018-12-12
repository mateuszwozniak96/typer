package com.wat.typer.typer.controllers;

import com.wat.typer.typer.entities.Bet;
import com.wat.typer.typer.services.BetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@CrossOrigin(origins = "http://localhost:4200")
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

    @GetMapping("/bets/{id}")
    public Bet getBet(@PathVariable int id) {
        return betService.getBet(id);
    }

    @GetMapping("/matches/{id}/bets/")
    public List<Bet> getBetsByMatches(@PathVariable int id) {
        return betService.getBetsByMatches(id);
    }

    @GetMapping("/membership/bets/{id}")
    public List<Bet> getBetsByMemberships(@PathVariable int id) {
        return betService.getBetsByMembership(id);
    }

    @PutMapping(value = "/bets/{id}")
    public void updateBet(@RequestBody Bet bet, @PathVariable int id) {
        betService.addBet(bet);
    }

    @DeleteMapping(value = "/bets/{id}")
    public void deleteBet(@PathVariable int id) {
        betService.deleteBet(id);
    }




}
