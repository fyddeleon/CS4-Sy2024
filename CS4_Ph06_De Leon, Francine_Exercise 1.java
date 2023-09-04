 class AnimeEpisodes {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String anime1name = "Your Lie in April";
        String anime1genre = "Romantic Drama";
        int anime1eps = 22;

        String anime2name = "The Disastrous Life of Saiki K";
        String anime2genre = "Comedy";
        int anime2eps = 120;

        String anime3name = "The Rising of the Shield Hero";
        String anime3genre = "Isekai";
        int anime3eps = 25;

        System.out.println("Anime 1");
        System.out.println("Name: " + anime1name);
        System.out.println("Genre: " + anime1genre);
        System.out.println("Number of episodes: " + anime1eps);
        System.out.println();

        System.out.println("Anime 2");
        System.out.println("Name: " + anime2name);
        System.out.println("Genre: " + anime2genre);
        System.out.println("Number of episodes: " + anime2eps);
        System.out.println();

        System.out.println("Anime 3");
        System.out.println("Name: " + anime3name);
        System.out.println("Genre: " + anime3genre);
        System.out.println("Number of episodes: " + anime3eps);
        System.out.println();

        int totaleps = anime1eps + anime2eps + anime3eps;
        System.out.println("Total number of episodes: " + totaleps);

        boolean anime2win = anime2eps > anime1eps;
        System.out.println(anime2name + " has the most number of episodes: " + anime2win);

        boolean samegenre = anime1genre.equals(anime3genre);
        System.out.println("The animes have the same genres: " + samegenre);
    }
}
