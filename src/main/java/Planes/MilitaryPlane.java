package Planes;

import models.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane {

    private final MilitaryType militaryType;

    public MilitaryPlane(String modelOfMilitaryPlane, int maxSpeed, int maxFlightDistance,
                         int maxLoadCapacity, MilitaryType militaryType) {
        super(modelOfMilitaryPlane, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.militaryType = militaryType;
    }

    public MilitaryType getMilitaryType() {
        return militaryType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + militaryType +
                        '}');
    }

    @Override
    public boolean equals(Object object) {
        if (Objects.equals(this, object)) return true;
        if ((!(object instanceof MilitaryPlane)) || (!super.equals(object))) return false;
        return militaryType == ((MilitaryPlane) object).militaryType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), militaryType);
    }
}