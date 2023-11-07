public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Xangel Lacerna", "May 27 2008", 15);
        Student student2 = new Student("Iris Ababon", "April 8 2008", 15);
        Student student3 = new Student("Ambher Lumbres", "September 7 2007", 16);

        Song song1 = new Song("For the First Time", "Mac DeMarco");
        Song song2 = new Song("505", "Arctic Monkeys");

        Singer singer1 = new Singer("Taylor Swift");
        Singer singer2 = new Singer("Lana Del Rey");

        singer1.setFavoriteSong(song1);
        singer2.setFavoriteSong(song2);

        singer1.performForAudience(12);
        singer2.performForAudience(8);

        singer1.performForAudience(10, singer2);

        singer1.changeFavSong(song2);
        singer2.changeFavSong(song1);

    }
}
