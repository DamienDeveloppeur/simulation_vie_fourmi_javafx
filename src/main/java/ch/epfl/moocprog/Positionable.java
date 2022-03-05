package ch.epfl.moocprog;

import ch.epfl.moocprog.gfx.AnimalsRenderer;
import ch.epfl.moocprog.gfx.JavaFXAntSimulationCanvas;

public class Positionable {
    private ToricPosition toricposition;

    public Positionable(){
        this.toricposition = new ToricPosition(0,0);
    }
    public Positionable(ToricPosition toricPosition){
        this.toricposition = toricPosition;
    }

    public ToricPosition getPosition() {
        return toricposition;
    }

    public void setPosition(ToricPosition toricposition) {
        this.toricposition = toricposition;
    }

    @Override
    public String toString() {
        return "Positionable{" +
                "toricposition=" + toricposition +
                '}';
    }

    public double getDirection() {
        return 2.0;
    }

    public void accept(AnimalsRenderer animalsRenderer, JavaFXAntSimulationCanvas canvas) {
    }
}
