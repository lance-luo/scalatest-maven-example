package net.lockney.dao;

public class SimpleDAO {

    private boolean isStarted;

    public SimpleDAO(boolean state) {
        this.isStarted = state;
    }

    public SimpleDAO() {
        this(true);
    }

    public boolean started() {
        return isStarted;
    }

    public void stop() {
        if (this.isStarted) {
            this.isStarted = false;
        } else {
            throw new UnsupportedOperationException("You can't stop me when I'm not started!");
        }

    }
}
