package ch.epfl.moocprog;

import ch.epfl.moocprog.utils.Vec2d;

public class ToricPosition {
    private Vec2d vec2d;

    public ToricPosition(double x, double y){
        this.vec2d = new Vec2d(x,y);
    }
    public ToricPosition(Vec2d vec2d){
        this.vec2d = vec2d;
    }
    public ToricPosition(){
        this.vec2d = new Vec2d(0,0);
    }

    public ToricPosition add(ToricPosition that){
        return this;
    }
    public ToricPosition add(Vec2d vec){
        return this;
    }
    public Vec2d toVec2d(){
        return this.vec2d;
    }

    public Vec2d toricVector(ToricPosition that) {
        return this.vec2d;
    }

    public double toricDistance(ToricPosition that) {
        return 0.0;
    }

    @Override
    public String toString() {
        return "ToricPosition{" +
                "vec2d=" + vec2d +
                '}';
    }
    private static Vec2d clampedPosition(double x, double y) {
        return new Vec2d(x,y);
    }
}
