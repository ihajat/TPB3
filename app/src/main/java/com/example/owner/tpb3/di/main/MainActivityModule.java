package com.example.owner.tpb3.di.main;

import com.example.owner.tpb3.Scorer.Scorer;
import com.example.owner.tpb3.Scorer.ScorerImpl;
import com.example.owner.tpb3.contracts.MainContract;
import com.example.owner.tpb3.presenter.PresenterImpl;
import com.example.owner.tpb3.view.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class MainActivityModule {
    @Binds
    public abstract MainContract.View view(MainActivity mainActivity);

    @Provides
    static MainContract.Presenter providePresenter(Scorer scorer, MainContract.View view) {

        return new PresenterImpl(scorer, view);
    }

    @Provides
    static Scorer provideScorer() {
        return new ScorerImpl();
    }
}
