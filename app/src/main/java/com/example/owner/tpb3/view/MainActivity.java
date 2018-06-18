package com.example.owner.tpb3.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.owner.tpb3.R;
import com.example.owner.tpb3.contracts.MainContract;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity implements MainContract.View{

    @Inject
    MainContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void showScores() {

    }

    @Override
    public void showPlayerInfo() {

    }

    @Override
    public void showPlayersScores() {

    }

    @Override
    public void showGameOver() {

    }

    @Override
    public int[] showNewGame() {
        return new int[0];
    }
}
