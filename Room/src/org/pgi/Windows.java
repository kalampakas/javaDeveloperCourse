package org.pgi;

public class Windows {
    private boolean insulated;
    private Dimensions size;

    public Windows(boolean insulated, Dimensions size) {
        this.insulated = insulated;
        this.size = size;
    }

    public boolean isInsulated() {
        return insulated;
    }

    public Dimensions getSize() {
        return size;
    }
}
