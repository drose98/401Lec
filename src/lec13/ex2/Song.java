package lec13.ex2;

public class Song {
        private String name;
        private int rating;
        
        public Song(String name, int rating) {
                this.name = name;
                this.rating = rating;
        }
        
        public String getName() {
                return name;
        }
        
        public int getRating() {
                return rating;
        }
}
