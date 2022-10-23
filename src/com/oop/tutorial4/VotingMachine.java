package com.oop.tutorial4;

import java.util.Random;

public class VotingMachine {
    private int votesOfLabour;
    private int votesOfConservative;

    private int randomNum() {
        return new Random().nextInt(1000);
    }

    public int getVotesOfLabour() {
        return votesOfLabour;
    }

    public void setVotesOfLabour(int votesOfLabour) {
        this.votesOfLabour = votesOfLabour + randomNum();
    }

    public int getVotesOfConservative() {
        return votesOfConservative;
    }

    public void setVotesOfConservative(int votesOfConservative) {
        this.votesOfConservative = votesOfConservative;
    }
}
