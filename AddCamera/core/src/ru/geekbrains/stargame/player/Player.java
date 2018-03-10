package ru.geekbrains.stargame.player;

import com.badlogic.gdx.math.Vector2;

import ru.geekbrains.stargame.engine.Movable;
import ru.geekbrains.stargame.substances.Substance;

/**
 * Created by raultaylor.
 */

public class Player extends Substance implements Movable{

    private float density;
    private float speed;
    private Vector2 direction;

    public Player(){
        super();
        density = 0f;
        speed = 2f;
        direction = new Vector2();
    }


    public void update(float delta){
        this.pos.mulAdd(direction,speed*delta);
        //System.out.println(this.getSize() + " " + this.pos + " "+ getVolume());
    }

    public void addSubstance(int weight, float volume){
        this.weight +=weight;
        this.volume +=volume;
        this.calcSize();
        density = weight/volume;
    }

    @Override
    public void set(Vector2 pos, int weight, float density, String myType) {
        this.density = density;
        super.set(pos, weight, density, myType);
    }

    public void setSpeed(float speed){
        this.speed = speed;
    }


    public float getDensity(){
        return this.density;
    }

    @Override
    public void move(Vector2 dst) {
        this.direction.set(dst);
        //System.out.println("move: " + dst);
        //System.out.println("pos: "+ pos);
    }

    @Override
    public void stop() {
        direction.setZero();
    }
}
