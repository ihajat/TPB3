package com.example.owner.tpb3.presenter;

import android.content.Context;

import com.example.owner.tpb3.Scorer.Scorer;
import com.example.owner.tpb3.contracts.MainContract;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PresenterImplTest {
    private PresenterImpl presenter;
    private int[] thisIsADummyArray = new int[2];

    @Mock
    Context mMockContext;
    @Mock
    MainContract.View view;
    @Mock
    Scorer scorer;

    @Before
    public void setUp() throws Exception {
        presenter = new PresenterImpl( scorer,  view);//
        thisIsADummyArray[0] = 10;
        thisIsADummyArray[1] = 30;
    }

//    @After
//    public void tearDown() throws Exception {
//
//    }

    @Test
    public void testScoreSoFar() {
        when(scorer.getFrameNumber()).thenReturn(3);
        assertEquals(presenter.scoreSoFar(), 3);
    }

    @Test
    public void testGameIsOver() {
        when(scorer.getFrameNumber()).thenReturn(10);
        assertEquals(presenter.gameIsOver(), true);
    }

    @Test
    public void testRoll() {
        when(scorer.getRolls()).thenReturn(thisIsADummyArray);
        assertEquals(presenter.roll(), thisIsADummyArray);
    }

    @Test
    public void testGameOver() {
     //   when(scorer.getFrameNumber()).thenReturn(10);
        presenter.gameOver();
        Mockito.verify(view).showGameOver();
    }
}