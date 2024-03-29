package sch.nodar.gameengine.entity;

import sch.nodar.gameengine.Level;

/**
 * Abstract superclass for entities.
 */
public abstract class Entity {

    protected Level level;

    /**
     * Constructs a new entity with the given level and position.
     * It also registers the entity with the level.
     * @param level The level on which the entity will live.
     */
    Entity(Level level){
        this.level = level;
    }

    /**
     * Notifies the entity that it has been removed from the level.
     */
    public void notifyRemoval() {}

    /**
     * Returns the name of the entity.
     * This should be a lower-case shorthand for the entity.
     * The purpose of this is to be able to use entity-type switches.
     * @return The name of the entity.
     */
    public abstract String getName();

}
