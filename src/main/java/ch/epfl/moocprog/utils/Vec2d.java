package ch.epfl.moocprog.utils;

import java.util.Objects;

/**
 * ReprÃ©sente un simple vecteur sur le plan des {@code double}
 */
public final class Vec2d {
    private final double x;
    private final double y;

    /**
     * Construit un vecteur avec les coordonnÃ©es fournies
     *
     * @param x La coordonnÃ©e x du vecteur
     * @param y La coordonnÃ©e y du vecteur
     */
    public Vec2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Construit un nouveau vecteur correspondant Ã  l'adition
     * composante par composante entre {@code this} et {@code that}.
     *
     * @param that Le vecteur Ã  aditionner avec {@code this}
     * @return Un nouveau vecteur correspondant Ã  l'adition de {@code this}
     *         et {@code that}
     */
    public Vec2d add(Vec2d that) {
        return new Vec2d(this.x + that.x, this.y + that.y);
    }

    /**
     * Construit un nouveau vecteur Ã  partir de la diffÃ©rence
     * composante par composante de {@code this} par {@code that}.
     *
     * @param that Le vecteur Ã  soustraire de {@code this}
     * @return Un nouveau vecteur correspondant Ã  la soustraction
     *          de {@code this} par {@code that}
     */
    public Vec2d minus(Vec2d that) {
        return new Vec2d(this.x - that.x, this.y - that.y);
    }

    /**
     * Calcule la distance entre {@code this} et {@code that}.
     *
     * @param that Le vecteur distant de {@code this}
     * @return La distance entre {@code this} et {@code that}
     */
    public double distance(Vec2d that) {
        double diffX = this.x - that.x;
        double diffY = this.y - that.y;

        return Math.sqrt(diffX*diffX + diffY*diffY);
    }

    /**
     * Retourne la coordonnÃ©e x de ce vecteur.
     *
     * @return La coordonnÃ©e x de ce vecteur.
     */
    public double getX() {
        return x;
    }

    /**
     * Retourne la coordonnÃ©e y de ce vecteur.
     *
     * @return La coordonnÃ©e y de ce vecteur.
     */
    public double getY() {
        return y;
    }

    /**
     * Calcule la norme de ce vecteur.
     *
     * @return La norme de ce vecteur
     */
    public double length() {
        return Math.sqrt(x*x + y*y);
    }

    /**
     * Calcule l'angle que forme ce vecteur par rapport
     * Ã  l'axe x
     * @return L'angle que forme ce vecteur par rapport
     *         Ã  l'axe x
     */
    public double angle() {
        return Math.atan2(y, x);
    }

    /**
     * Calcule le produit scalaire entre {@code this} et {@code that}.
     *
     * @param that Le vecteur avec lequel le produit scalaire sera calculÃ©
     * @return Le produit scalaire entre {@code this} et {@code that}.
     */
    public double dotProduct(Vec2d that) {
        return this.x*that.x + this.y*that.y;
    }

    /**
     * Retourne un nouveau vecteur dont qui correspond
     * Ã  la multiplication de {@code this} par {@code scalar}
     * @param scalar Le scalaire avec lequel {@code this} sera multipliÃ©
     * @return un nouveau vecteur dont correspondant
     *         Ã  la multiplication de ce vecteur par {@code scalar}
     */
    public Vec2d scalarProduct(double scalar) {
        return new Vec2d(x*scalar, y*scalar);
    }

    /**
     * Retourne un nouveau vecteur correspondant Ã  ce vecteur
     * normalisÃ© (sa norme vaut 1)
     *
     * @return Un nouveau vecteur correspondant Ã  ce vecteur normalisÃ©
     */
    public Vec2d normalized() {
        return scalarProduct(1/length());
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Vec2d) {
            double epsilon = 1e-8;
            Vec2d that = (Vec2d)o;
            return Math.abs(this.x - that.x) <= epsilon && Math.abs(this.y - that.y) <= epsilon;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return String.format("Position : %.1f, %.1f", x, y);
    }

    /**
     * Construit un nouveau vecteur normalisÃ© Ã  partir de l'angle donnÃ©.
     *
     * @param angle L'angle (en radians) que doit former le vecteur avec l'axe x
     * @return Un nouveau vecteur unitaire formant l'angle donnÃ© avec l'axe x
     */
    public static Vec2d fromAngle(double angle) {
        return new Vec2d(Math.cos(angle), Math.sin(angle));
    }
}
