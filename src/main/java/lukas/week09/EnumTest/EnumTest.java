package lukas.week09.EnumTest;

public class EnumTest {
    public static enum Direction {
        UP("Hallo"), LEFT("Geh nah links"), RIGHT("Geh nach rechts"), DOWN("Geh nach down");
        private String hallo;

        Direction(String hallo) {
            this.hallo = hallo;
        }

        @Override
        public String toString() {
            return hallo;
        }
    }

}
