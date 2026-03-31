package oop.park;

public class EntertainmentPark {
    Attraction attraction = null;

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    void maintain() {
        if (this.attraction != null) {
            this.attraction.service();
        }
    }

    void showInfo() {
        if (this.attraction != null) {
            this.attraction.info();
        }
    }
}
