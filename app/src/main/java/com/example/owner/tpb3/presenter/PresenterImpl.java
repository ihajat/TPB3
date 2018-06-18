package com.example.owner.tpb3.presenter;


import com.example.owner.tpb3.Scorer.Scorer;
import com.example.owner.tpb3.contracts.MainContract;


public class PresenterImpl implements MainContract.Presenter {

    private Scorer scorer;
    private MainContract.View view;

    public PresenterImpl(Scorer scorer, MainContract.View view) {//
        this.scorer = scorer;
        this.view = view;
    }

    @Override
    public int scoreSoFar() {
        return scorer.getFrameNumber();
    }

    @Override
    public boolean gameIsOver() {
        return scorer.getFrameNumber() == 10;
    }

    @Override
    public int[] roll() {
        return scorer.getRolls();
    }

    @Override
    public void gameOver() {
        view.showGameOver();
    }
}
