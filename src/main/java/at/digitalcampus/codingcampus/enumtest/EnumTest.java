package at.digitalcampus.codingcampus.enumtest;

public class EnumTest {
    public enum Direction {
        UP("Hallo"), LEFT("Geh nach links"), RIGHT("Geh nach rechts"), DOWN("Geh nach unten");
        private String tellMeMore;

        Direction(String tellMeMore) {
            this.tellMeMore = tellMeMore;
        }

        @Override
        public String toString() {
            return tellMeMore;
        }
    }
}
