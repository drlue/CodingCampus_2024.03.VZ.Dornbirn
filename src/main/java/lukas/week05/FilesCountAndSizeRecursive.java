package lukas.week05;

import ardijanla.ConsoleColors;

import java.io.File;

public class FilesCountAndSizeRecursive {
    public static void main(String[] args) {
        String path = "C:\\Users\\LZE\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java";
        printDirRecursive("", path, getMaxFileNameLengthRec(path, 0));
        System.out.println("max FileNameLength = " + (getMaxFileNameLengthRec(path, 0) + 10));
        System.out.println("max Depth = " + getMaxDepth(path,0));
    }

    public static void printDirRecursive(String prefix, String path, int maxFileNameLength) {
        File file = new File(path);
        File[] files = file.listFiles();

        if (files != null) {
            files = FilesListDirectory.sortListOfFilesByFileSizeDesc(files);
            for (File f : files) {

                if (f.isDirectory()) {
                    System.out.printf("%s%s%-" + (maxFileNameLength - prefix.length()) + "s %15d Files %15d Bytes%s\n",
                            prefix,
                            ConsoleColors.BLUE,
                            f.getName(),
                            getFileCountRec(f.getAbsolutePath(), 0),
                            getSumFileSizeRec(f.getAbsolutePath(), 0),
                            ConsoleColors.RESET);
                    printDirRecursive(prefix + "|-", f.getAbsolutePath(), maxFileNameLength);
                } else {//f.isFile
                    System.out.printf("%s%-" + (maxFileNameLength - prefix.length()) + "s %15d Bytes\n",
                            prefix,
                            f.getName(),
                            f.length());
                }
            }
        }
    }

    public static int getFileCountRec(String dir, int count) {
        File d = new File(dir);
        if (d.exists()) {
            File[] files = d.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (f.isFile()) {
                        count++;
                    } else if (f.isDirectory()) {
                        count = getFileCountRec(f.getAbsolutePath(), count);
                    }
                }
            }
        }
        return count;
    }

    public static long getSumFileSizeRec(String dir, long size) {
        File d = new File(dir);
        if (d.exists()) {
            File[] files = d.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (f.isFile()) {
                        size += f.length();
                    } else if (f.isDirectory()) {
                        size = getSumFileSizeRec(f.getAbsolutePath(), size);
                    }
                }
            }
        }
        return size;
    }

    public static int getMaxFileNameLengthRec(String dir, int maxL) {
        File d = new File(dir);
        if (d.exists()) {
            File[] files = d.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (f.getName().length() > maxL) {
                        maxL = f.getName().length();
                    }
                    if (f.isDirectory()) {
                        maxL = getMaxFileNameLengthRec(f.getAbsolutePath(), maxL);
                    }
                }
            }
        }
        return maxL;
    }

    //Method not working correctly
    public static int getMaxDepth(String dir, int currentDepth ) {
        int maxDepth = currentDepth;
        File d = new File(dir);
        if (d.exists()) {
            File[] files = d.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (f.isDirectory()) {
                       maxDepth = Math.max(getMaxDepth(f.getAbsolutePath(), currentDepth+1),maxDepth);
                    }
                }
            }
        }
        return maxDepth;
    }

}
