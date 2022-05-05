package com.bouncesite.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Statistics {
    @Id
    private int id;
    private int sphere_collision_count;
    private int wall_collision_count;
    private int sphere_count;

    public Statistics() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSphere_collision_count() {
        return sphere_collision_count;
    }

    public void setSphere_collision_count(int sphere_collision_count) {
        this.sphere_collision_count = sphere_collision_count;
    }

    public int getWall_collision_count() {
        return wall_collision_count;
    }

    public void setWall_collision_count(int wall_collision_count) {
        this.wall_collision_count = wall_collision_count;
    }

    public int getSphere_count() {
        return sphere_count;
    }

    public void setSphere_count(int sphere_count) {
        this.sphere_count = sphere_count;
    }
}


