package tp1;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public final class PointOperator {
    // TODO appliquer la translation sur le vecteur d'entree.
    public static Double[] translate(Double[] vector, Double[] translateVector) {
        for (int i = 0; i < vector.length; i++) {
            vector [i] = vector[i] + translateVector[i];
        }

        return vector;
    }

    // TODO appliquer la rotation sur le vecteur d'entree.
    public static Double[] rotate(Double[] vector, Double[][] rotationMatrix) {
        for (int i=0; i<vector.length; i++) {
            vector[i] = vector[i];
        }
        return vector;
    }

    // TODO appliquer le facteur de division sur le vecteur d'entree.
    public static Double[] divide(Double[] vector, Double divider) {
        for (int i = 0; i < vector.length; i++) {
            vector [i] = vector[i]/divider;
        }
        return vector;
    }

    // TODO appliquer le facteur de multiplication sur le vecteur d'entree.
    public static Double[] multiply(Double[] vector, Double multiplier) {
        for (int i=0; i<vector.length; i++) {
            vector[i] = vector[i] * multiplier;
        }
        return vector;
    }

    // TODO appliquer le facteur d'addition sur le vecteur d'entree.
    public static Double[] add(Double[] vector, Double adder) {
        for (int i = 0; i < vector.length; i++) {
            vector [i] = vector[i] + adder;
        }
        return vector;
    }

    // TODO retourne la coordonnee avec les plus grandes valeurs en X et en Y.
    public static Point2d getMaxCoord(Collection<Point2d> coords) {
        double maxX, maxY;
        Point2d[] arrayCoords = coords.toArray(new Point2d[coords.size()]);

        maxX = arrayCoords[0].X();
        maxY = arrayCoords[0].Y();

        for (int i=0; i<arrayCoords.length; i++) {
            if (arrayCoords[i].X() > maxX) {
                maxX = arrayCoords[i].X();
            }
            if (arrayCoords[i].Y() > maxY) {
                maxY = arrayCoords[i].Y();
            }
        }
        Point2d pointMax= new Point2d(maxX, maxY);

        return pointMax;
    }

    // TODO retourne la coordonnee avec les plus petites valeurs en X et en Y.
    public static Point2d getMinCoord(Collection<Point2d> coords) {
        double minX, minY;
        Point2d[] arrayCoords = coords.toArray(new Point2d[coords.size()]);

        minX = arrayCoords[0].X();
        minY = arrayCoords[0].Y();

        for (int i=0; i<arrayCoords.length; i++) {
            if (arrayCoords[i].X() < minX) {
                minX = arrayCoords[i].X();
            }
            if (arrayCoords[i].Y() < minY) {
                minY = arrayCoords[i].Y();
            }
        }
        Point2d pointMin= new Point2d(minX, minY);

        return pointMin;
    }
}
