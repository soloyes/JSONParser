package ru.geekbrains.stargame.world;

import java.util.ArrayList;
import java.util.List;
import ru.geekbrains.stargame.engine.math.Circle;
import ru.geekbrains.stargame.engine.Linkable;
import ru.geekbrains.stargame.physics.CollisionController;
import ru.geekbrains.stargame.player.Player;
import ru.geekbrains.stargame.substances.Substance;
import ru.geekbrains.stargame.substances.SubstanceEmmiter;
import ru.geekbrains.stargame.visual.VisualData;


/**
 * Created by raultaylor.
 */

public class World extends Circle implements Linkable{

    private long weight;
    private static final float DENSITY = 0.02f;

    private VisualData visualData;

    private List<Substance> allSubstance;

    private SubstanceEmmiter substanceEmmiter;

    private ArrayList<Player> players;

    private CollisionController collisionController;


    private final String myType = "world";


    public World(VisualData visualData){
        size = 59.16f;
        players = new ArrayList<Player>();
        substanceEmmiter = new SubstanceEmmiter(this);
        collisionController = new CollisionController(visualData);
        this.visualData = visualData;
        updateWorld();
    }

    public void addPlayer(Player player){
        players.add(player);
        updateWorld();
    }

    private void extendBound(){
    double volume = weight / DENSITY;
        size = (float)(Math.exp(Math.log(volume)/2.5f));
    }

    private void updateWeight(){
        long tempWeight = 0;
        for(Substance substance : allSubstance){
            tempWeight += substance.getWeight();
        }
        for(Player player: players){
            tempWeight += player.getWeight();
        }
        weight = tempWeight;
    }

    public void updateWorld(){

        collisionController.CollisionPlayerToWorld(players,this);
        collisionController.CollisionPlayerToSubstance(players,allSubstance);
        substanceEmmiter.addSubstance();
        allSubstance = substanceEmmiter.getActiveSubstance();
        updateWeight();
        extendBound();

       // System.out.println("CurrentWeight World: "+weight+" Bounds: "+size+" FreeSubstance: " + allSubstance.size());
    }

    public float getBound(){
        return this.size;
    }

    @Override
    public String getNameType() {
        return myType;
    }

    public void getNewData(){
        visualData.cleanAll();
        visualData.add(this);
        visualData.addAll(players);
        visualData.addAll(allSubstance);
        //System.out.println("VD: "+visualData.getData().size());
    }

    public float getWeight(){
        //System.out.println("World weight: " + weight);
        return weight;
    }


}
