package access_modifiers;

public class GameSettings {
    static int maxPlayers;
    final String GAME_NAME;
    int currentPlayers;

    GameSettings(String gameName, int currentPlayers) {
//        Можно еще добавить проверку на максимальное кол-во игроков при создании объекта,
//        но тогда нужно будет инициализировать статическое поле maxPlayers
//
//        if (currentPlayers > maxPlayers) {
//            System.out.println("Заданное кол-во игроков превышает допустимое, установлено максимальное допустимое кол-во");
//            this.currentPlayers = GameSettings.maxPlayers;
//        } else {
//            this.currentPlayers = currentPlayers;
//        }

        this.currentPlayers = currentPlayers;
        this.GAME_NAME = gameName;
    }

    static void setMaxPlayers(int players) {
        GameSettings.maxPlayers = players;
    }

    void addPlayer() {
        if (currentPlayers < maxPlayers) {
            this.currentPlayers++;

            return;
        }

        System.out.println("Лимит игроков достигнут");
    }

    void printGameStatus() {
        System.out.println("Название игры: " + this.GAME_NAME + ". Текущее кол-во игроков: " + this.currentPlayers + ". Максимальное кол-во игроков: " + GameSettings.maxPlayers);
    }
}
