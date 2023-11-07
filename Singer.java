public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    static int totalPerformances = 0;

    public Singer(String name) {
        this.name = name;
        this.noOfPerformances = 0;
        this.earnings = 0.0;
        this.favoriteSong = null;
    }

    public String getName() {
        return name;
    }

    public int getNoOfPerformances() {
        return noOfPerformances;
    }

    public static int getTotalPerformances() {
        return totalPerformances;
    }

    public double getEarnings() {
        return earnings;
    }

    public Song getFavoriteSong() {
        return favoriteSong;
    }

    public void setFavoriteSong(Song favoriteSong) {
        this.favoriteSong = favoriteSong;
    }

    public void changeFavSong(Song newFavoriteSong) {
        this.favoriteSong = newFavoriteSong;
    }

    public void performForAudience(int people) {
        double profitPerPerson = 100.0;
        this.noOfPerformances++;
        this.earnings += people * profitPerPerson;
        totalPerformances++;
    }

    public void performForAudience(int people, Singer collaborator) {
        double profitPerPerson = 100.0;
        double totalProfit = people * profitPerPerson;
        double splitProfit = totalProfit / 2.0;

        this.earnings += splitProfit;
        collaborator.earnings += splitProfit;
        this.noOfPerformances++;
        collaborator.noOfPerformances++;
        totalPerformances += 2;
    }
}
