package luki.week06;

import java.io.File;

public class FileSystemRehearsal {
    public static void main(String[] args) {
        String dir = "/Users/lukasaichbauer/Projects/cc/CodingCampus_2024.03.VZ.Dornbirn/";

        File file = new File(dir);
        //printFile(file, "");
        System.out.println(getMaxDepth2(file, 0));
    }

    private static void printFile(File file, String indentation) {
        System.out.println(indentation + file.getName());
        File[] files = file.listFiles();
        if (files != null) {
            String newIndentation = indentation + "  ";
            for (File x : files) {
                if (x.isDirectory()) {
                    printFile(x, newIndentation);
                } else {
                    System.out.println(newIndentation + "F " + x.length() + " " + x.getName());
                }
            }
        }
    }

    static class Depth {
        private int depth;
        private File file;

        public Depth(int depth, File file) {
            this.depth = depth;
            this.file = file;
        }

        @Override
        public String toString() {
            return "Depth{" +
                    "depth=" + depth +
                    ", file=" + file +
                    '}';
        }
    }

    private static int getMaxDepth(File file, int currentDepth) {
        //System.out.println(indentation + file.getName());
        File[] files = file.listFiles();
        int maxDepth = currentDepth;
        if (files != null) {
            for (File x : files) {
                if (x.isDirectory()) {
                    maxDepth = Math.max(getMaxDepth(x, currentDepth + 1), maxDepth);
                }
            }
        }
        return maxDepth;
    }

    private static Depth getMaxDepth2(File file, int currentDepth) {
        File[] files = file.listFiles();

        Depth maxDepth = new Depth(currentDepth, file);
        if (files != null) {
            for (File x : files) {
                if (x.isDirectory()) {
                    Depth newDepth = getMaxDepth2(x, currentDepth + 1);
                    if(newDepth.depth > maxDepth.depth) {
                        maxDepth = newDepth;
                    }
                }
            }
        }
        return maxDepth;
    }
}
