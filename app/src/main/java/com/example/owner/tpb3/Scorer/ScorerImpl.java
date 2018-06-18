package com.example.owner.tpb3.Scorer;

public class ScorerImpl implements Scorer {

    static int MAX_FRAMES = 10;
    static int MAX_POINTS = 10;
    static int TOTAL_NO_OF_ROLLS = 20;
    private int frameNumber;

    public int[] getRolls() {
        return rolls;
    }

    public void setRolls(int[] rolls) {
        this.rolls = rolls;
    }

    private int[] rolls;

    public ScorerImpl() {
        this.rolls = new int[TOTAL_NO_OF_ROLLS];
    }

    private int strikeBonus(int frame) {
        return sumOfRolls(frame + 1);
    }

    public int getFrameNumber() {
        return frameNumber;
    }

    private void setFrameNumber(int frameNumber) {
        this.frameNumber = frameNumber;
    }

    private int GetScoreForStrike(int frame) {
        return MAX_POINTS + strikeBonus(frame);
    }

    private boolean isSpare(int frame) {
        return sumOfRolls(frame) == 10;
    }

    private int GetScoreForSpare(int frame) {
        return MAX_POINTS + strikeBonus(frame);
    }

    private int sumOfRolls(int frame) {
        return rolls[frame] + rolls[frame + 1];
    }

    public int getScore() {
        int score = 0;
        int frame = 0;

        for (int i = 0; i < MAX_FRAMES; i++) {
            if (isStrike(frame)) {
                score += GetScoreForStrike(frame);
                frame++;
            } else if (isSpare(frame)) {
                score += GetScoreForSpare(frame);
                frame += 2;
            } else {
                score += sumOfRolls(frame);
                frame += 2;
            }
        }

        return score;
    }

    private boolean isStrike(int frame) {
        return rolls[frame] == 10;
    }
}
