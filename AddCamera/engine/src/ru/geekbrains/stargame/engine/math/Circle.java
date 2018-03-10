package ru.geekbrains.stargame.engine.math;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by raultaylor.
 */

public class Circle {


    private static Vector2 temp = new Vector2();

    synchronized public static Vector2 convertToPos(float radius, float angle){

        temp.set((float)(Math.cos(angle)*radius),(float) (Math.sin(angle)*radius));
        //System.out.println(radius+ " "+angle +" = " +temp);

        return temp;
    }


    protected float size;
    protected Vector2 pos;

    public Circle(){
        size = 0f;
        pos = new Vector2();
    }

    public Vector2 getPos(){
        return pos;
    }

    public float getSize(){
        return size;
    }
}
