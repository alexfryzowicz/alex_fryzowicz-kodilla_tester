package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private String stampSize;
    private boolean isStamped;

    public Stamp (String stampName, String stampSize, boolean isStamped) {
        this.stampName = stampName;
        this.stampSize = stampSize;
        this.isStamped = isStamped;
    }

    public String getStampName() {
        return stampName;
    }

    public String getStampSize() {
        return stampSize;
    }

    public boolean getIsStamper() {
        return isStamped;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Stamp stamp = (Stamp) o;
        return Objects.equals(stampName, stamp.stampName) && Objects.equals(stampSize, stamp.stampSize) && Objects.equals(isStamped, stamp.isStamped);
    }

    @Override public int hashCode() {
        return Objects.hash(stampName, stampSize, isStamped);
    }

    @Override public String toString() {
        return "Object{" + "stampName='" + stampName + '\'' + "stampSize ='" + stampSize + '\'' + ", isStamped=" + isStamped + '}';
    }
}
