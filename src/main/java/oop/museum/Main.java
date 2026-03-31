package oop.museum;

public class Main {
    public static void main(String[] args) {
        Exhibit david = new Sculpture("Статуя Давида");
        Exhibit bible = new Manuscript("Библия");

        Museum museum = new Museum();

        museum.setExhibit(david);
        museum.showExhibit();

        museum.setExhibit(bible);
        museum.showExhibit();
    }
}
