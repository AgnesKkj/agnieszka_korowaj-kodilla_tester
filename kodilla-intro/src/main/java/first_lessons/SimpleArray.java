package first_lessons;

public class SimpleArray {
    public static void main(String[] args) {
        String[] waitingForGames = new String[5];
        waitingForGames[0] = "Baldur's Gate 3";
        waitingForGames[1] = "Assassin's Creed Valhalla";
        waitingForGames[2] = "CyberPunk 2077";
        waitingForGames[3] = "Horizon Forbidden West";
        waitingForGames[4] = "The Waylanders";

        String fourthGame = waitingForGames[3];
        System.out.println("Czwarty element tablicy: " + fourthGame);

        System.out.println("Moja tablica zawiera " + waitingForGames.length + " elementów.");

    }
}
