package com.example.owner.tpb3.contracts;

public interface MainContract {

    interface View {

        public void showScores();

        public void showPlayerInfo();

        public void showPlayersScores();

        public void showGameOver();

        public int[] showNewGame();

    }

    interface Presenter {

        int scoreSoFar();

        boolean gameIsOver();

        int[] roll();

        void gameOver();

    }

}