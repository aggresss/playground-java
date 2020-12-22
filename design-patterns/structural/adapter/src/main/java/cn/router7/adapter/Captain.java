package cn.router7.adapter;

public final class Captain {

    private RowingBoat rowingBoat;

    public Captain() {
    }

    public Captain(final RowingBoat boat) {
        this.rowingBoat = boat;
    }

    void row() {
        rowingBoat.row();
    }
}
