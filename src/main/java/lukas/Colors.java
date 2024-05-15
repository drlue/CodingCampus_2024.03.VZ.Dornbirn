package lukas;

public class Colors {


    public static String rgbForeground(int[] rgb) {
        return String.format("\033[38;2;%d;%d;%dm", rgb[0], rgb[1], rgb[2]);
    }

    public static String rgbBackground(int[] rgb) {
        return String.format("\033[48;2;%d;%d;%dm", rgb[0], rgb[1], rgb[2]);
    }

    public static String rgbForeground(int r, int g, int b) {
        int[] rgb = new int[]{r, g, b};
        return rgbForeground(rgb);
    }

    public static String rgbBackground(int r, int g, int b) {
        int[] rgb = new int[]{r, g, b};
        return rgbBackground(rgb);
    }

    public static String rgbForeAndBackground(int[] foregroundRgb, int[] backgroundRgb) {
        return String.format("\033[38;2;%d;%d;%d;48;2;%d;%d;%dm", foregroundRgb[0], foregroundRgb[1], foregroundRgb[2], backgroundRgb[0], backgroundRgb[1], backgroundRgb[2]);
    }

    public static String rgbForeAndBackground(int rForeground, int gForeground, int bForeground, int rBackground, int gBackground, int bBackground) {
        return String.format("\033[38;2;%d;%d;%d;48;2;%d;%d;%dm", rForeground,gForeground,bForeground,rBackground,gBackground,bBackground);
    }

    public static String hslForeground(int h, float s, float l) {
        int[] foregroundRgb = convertHslToRgb(h, s, l);
        return String.format("\033[38;2;%d;%d;%dm", foregroundRgb[0], foregroundRgb[1], foregroundRgb[2]);
    }

    public static String hslBackground(int h, float s, float l) {
        int[] backgroundRgb = convertHslToRgb(h, s, l);
        return String.format("\033[48;2;%d;%d;%dm", backgroundRgb[0], backgroundRgb[1], backgroundRgb[2]);
    }

    public static String hslForeAndBackground(int hForeground, float sForeground, float lForeground, int hBackground, float sBackground, float lBackground) {
        int[] foregroundRgb = convertHslToRgb(hForeground, sForeground, lForeground);
        int[] backgroundRgb = convertHslToRgb(hBackground, sBackground, lBackground);
        return String.format("\033[38;2;%d;%d;%d;48;2;%d;%d;%dm", foregroundRgb[0], foregroundRgb[1], foregroundRgb[2], backgroundRgb[0], backgroundRgb[1], backgroundRgb[2]);
    }

    private static int[] convertHslToRgb(int h, float s, float l) {
        //normiereung h zwischen 0 und 1 statt 0 und 360
        float hNormalized = h / 360f;
        //convert hsl to rgb
        float r, g, b;

        if (s == 0f) { //achromatic
            r = l;
            g = l;
            b = l;
        } else {
            float q = l < 0.5 ? l * (1 + s) : l + s - l * s;
            float p = 2 * l - q;
            r = hueToRgb(p, q, hNormalized + 1f / 3f);
            g = hueToRgb(p, q, hNormalized);
            b = hueToRgb(p, q, hNormalized - 1f / 3f);

        }
        //int[] rgb = {Math.round(r*255), Math.round(g*255), Math.round(b*255)};
        int[] rgb = {to255(r), to255(g), to255(b)};
        return rgb;
    }

    private static int to255(float v) {
        return (int) Math.min(255, 256 * v);
    }

    private static float hueToRgb(float p, float q, float t) {
        if (t < 0f) {
            t += 1f;
        }
        if (t > 1f) {
            t -= 1f;
        }
        if (t < (1f / 6f)) {
            return p + (q - p) * 6f * t;
        }
        if (t < 1f / 2f) {
            return q;
        }
        if (t < 2f / 3f) {
            return p + (q - p) * (2f / 3f - t) * 6f;
        }
        return p;
    }

    public static String makeFontBold(String colorString) {
        //insert 1; after 5tem vorkommen von ";"
        return colorString.replaceFirst("(?<fg>(.*?;){5})", "${fg}1;");
    }

    public static String makeFontUnderline(String colorString) {
        //insert 4; after 5tem vorkommen von ";"
        return colorString.replaceFirst("(?<fg>(.*?;){5})", "${fg}4;");
    }

    public static String makeFontItalic(String colorString) {
        //insert 3; after 5tem vorkommen von ";"
        return colorString.replaceFirst("(?<fg>(.*?;){5})", "${fg}3;");
    }

    public static String makeFontFramed(String colorString) {
        //insert 51; after 5tem vorkommen von ";"
        return colorString.replaceFirst("(?<fg>(.*?;){5})", "${fg}51;");
    }

    public static String makeFontCircled(String colorString) {
        //insert 3; after 5tem vorkommen von ";"
        return colorString.replaceFirst("(?<fg>(.*?;){5})", "${fg}52;");
    }

    public static String removeFrame(String string) {
        return "\033[51m";
    }


}
