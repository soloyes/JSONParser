package ru.geekbrains.stargame.substances;

import java.util.ArrayList;

import ru.geekbrains.stargame.engine.pool.Exterminable;
import ru.geekbrains.stargame.engine.pool.Pool;

/**
 * Created by raultaylor.
 */

public class SubstancePool extends Pool {

    @Override
    protected Substance newObject() {
        return new Substance();
    }

    @Override
    public Substance obtain() {
        return (Substance) super.obtain();
    }
}
