package ru.geekbrains.stargame.physics;

import com.badlogic.gdx.math.Vector2;

import java.util.List;

import ru.geekbrains.stargame.player.Player;
import ru.geekbrains.stargame.substances.Substance;
import ru.geekbrains.stargame.visual.VisualData;
import ru.geekbrains.stargame.world.World;

/**
 * Created by raultaylor.
 */

public class CollisionController {

    private Vector2 tempPToS;
    private Vector2 tempPToW;
    private VisualData visualData;

    private long deltaTimer;

    public CollisionController(VisualData visualData){
        tempPToS = new Vector2();
        tempPToW = new Vector2();
        this.visualData = visualData;
    }


    public void CollisionPlayerToSubstance(List<Player> players, List<Substance> substances){

        deltaTimer = System.currentTimeMillis();

        visualData.cleanAllOld();
        for(Player player: players){
            for(Substance substance: substances){
                tempPToS.set(player.getPos());
                if(!substance.isDestroyed() && tempPToS.sub(substance.getPos()).len() < player.getSize()+substance.getSize()){
                    substance.setDestroyed(true);
                    visualData.addOldData(substance);
                    player.addSubstance(substance.getWeight(),substance.getVolume());
                }
            }
        }

        System.out.println("Collision CollisionPTOS Time: "+(System.currentTimeMillis()-deltaTimer));
    }

    public void CollisionPlayerToWorld(List<Player> players, World world){

        for(Player player:players) {
            tempPToW.set(player.getPos());
            if (tempPToW.len()>world.getSize()-player.getSize()){
                player.getPos().set(tempPToW.nor().scl(world.getSize()-player.getSize()));
            }
        }
    }
}
