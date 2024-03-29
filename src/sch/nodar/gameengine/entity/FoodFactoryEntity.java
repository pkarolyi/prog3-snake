package sch.nodar.gameengine.entity;

import sch.nodar.gameengine.Level;
import sch.nodar.gameengine.Tickable;

/**
 * Entity that generates FoodEntities on the given level
 */
public class FoodFactoryEntity extends Entity implements Tickable {

    private int foodAmount;
    private static final int MAX_FOOD_AMOUNT = 1;

    /**
     * Constructs a new food with the given level and position.
     * It also registers the entity with the level.
     * @param level The level on which the entity will live.
     */
    public FoodFactoryEntity(Level level){
        super(level);
        foodAmount = 0;
    }

    public void foodRemoved(){
        foodAmount--;
    }

    @Override
    public void tick() {
        if(foodAmount < MAX_FOOD_AMOUNT){
            new FoodEntity(level, level.getFreePosition(), this);
            foodAmount++;
        }
    }

    @Override
    public String getName() {
        return "food_factory";
    }
}
