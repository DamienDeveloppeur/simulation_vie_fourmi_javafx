package ch.epfl.moocprog;

import ch.epfl.moocprog.gfx.EnvironmentGraphicRenderer;
import ch.epfl.moocprog.utils.Time;

public class Environment {
    private int width;
    private int height;
    public Environment(){
        this.width = 10;
        this.height = 10;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void addAnthill(Anthill anthill) {
    }

    public void addAnimal(Termite t) {
    }

    public void update(Time dt) {
    }

    public void renderEntities(EnvironmentGraphicRenderer renderer) {
    }
}
