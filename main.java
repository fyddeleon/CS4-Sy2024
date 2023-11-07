 class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Xangel Lacerna", "May 27 2008", 15);
        Student student2 = new Student("Iris Ababon", "April 8 2008", 4);
        Student student3 = new Student("Ambher Lumbres", "September 7 2007", 16);

            Song song1 = new Song("For the First Time", "Mac DeMarco");
            Song song2 = new Song("505", "Arctic Monkeys");

        Singer singer = new Singer("Odetari");

        singer.changeFavSong(song1);

        singer.performForAudience(12);

        singer.changeFavSong(song2);
    }
}
