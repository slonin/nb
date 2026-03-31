package oop.museum;

public class Museum {
    Exhibit exhibit = null;

    public void setExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    void showExhibit() {
        if (this.exhibit != null) {
            this.exhibit.showHistory();
            this.exhibit.preserve();
        }
    }
}
