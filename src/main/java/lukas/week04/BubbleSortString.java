package lukas.week04;

import java.util.Arrays;

public class BubbleSortString {

    public static void main(String[] args) {

        //String[] names = new String[]{"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijanla", "Aki", "Luki", "Sandro", "Berna", "Gyula"};
        String[] names = new String[]{"Afghanistan", "Ägypten", "Albanien", "Algerien", "Andorra", "Angola", "Antigua und Barbuda", "Äquatorialguinea", "Argentinien", "Armenien", "Aserbaidschan", "Äthiopien", "Australien", "Bahamas", "Bahrain", "Bangladesch", "Barbados", "Belgien", "Belize", "Benin", "Bhutan", "Bolivien", "Bosnien und Herzegowina", "Botsuana", "Brasilien", "Brunei Darussalam", "Bulgarien", "Burkina Faso", "Burundi", "Chile", "China", "Cookinseln", "Costa Rica", "Côte d'Ivoire", "Dänemark", "Deutschland", "Dominica", "Dominikanische Republik", "Dschibuti", "Ecuador", "El Salvador", "Eritrea", "Estland", "Fidschi", "Finnland", "Frankreich", "Gabun", "Gambia", "Georgien", "Ghana", "Grenada", "Griechenland", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Indien", "Indonesien", "Irak", "Iran", "Irland", "Island", "Israel", "Italien", "Jamaika", "Japan", "Jemen", "Jordanien", "Kambodscha", "Kamerun", "Kanada", "Kap Verde", "Kasachstan", "Katar", "Kenia", "Kirgisistan", "Kiribati", "Kolumbien", "Komoren", "Kongo", "Kongo, Demokratische Republik", "Korea, Demokratische Volksrepublik", "Korea, Republik", "Kosovo", "Kroatien", "Kuba", "Kuwait", "Laos", "Lesotho", "Lettland", "Libanon", "Liberia", "Libyen", "Liechtenstein", "Litauen", "Luxemburg", "Madagaskar", "Malawi", "Malaysia", "Malediven", "Mali", "Malta", "Marokko", "Marshallinseln", "Mauretanien", "Mauritius", "Mazedonien", "Mexiko", "Mikronesien", "Moldau", "Monaco", "Mongolei", "Montenegro", "Mosambik", "Myanmar", "Namibia", "Nauru", "Nepal", "Neuseeland", "Nicaragua", "Niederlande", "Niger", "Nigeria", "Niue", "Norwegen", "Oman", "Österreich", "Pakistan", "Palau", "Panama", "Papua-Neuguinea", "Paraguay", "Peru", "Philippinen", "Polen", "Portugal", "Ruanda", "Rumänien", "Russische Föderation", "Salomonen", "Sambia", "Samoa", "San Marino", "São Tomé und Príncipe", "Saudi-Arabien", "Schweden", "Schweiz", "Senegal", "Serbien", "Seychellen", "Sierra Leone", "Simbabwe", "Singapur", "Slowakei", "Slowenien", "Somalia", "Spanien", "Sri Lanka", "St. Kitts und Nevis", "St. Lucia", "St. Vincent und die Grenadinen", "Südafrika", "Sudan", "Südsudan", "Suriname", "Swasiland", "Syrien", "Tadschikistan", "Tansania", "Thailand", "Timor-Leste", "Togo", "Tonga", "Trinidad und Tobago", "Tschad", "Tschechische Republik", "Tunesien", "Türkei", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "Ungarn", "Uruguay", "Usbekistan", "Vanuatu", "Vatikanstadt", "Venezuela", "Vereinigte Arabische Emirate", "Vereinigte Staaten", "Vereinigtes Königreich", "Vietnam", "Weißrussland", "Zentralafrikanische Republik", "Zypern"};
        System.out.println(Arrays.toString(names));
        //bubble sort length
        System.out.println(Arrays.toString(bubbleSortLengthAsc(names)));
        System.out.println(Arrays.toString(bubbleSortLengthDesc(names)));
        //bubble sort lexicoraphical
        System.out.println(Arrays.toString(bubbleSortLexiAsc(names)));
        System.out.println(Arrays.toString(bubbleSortLexiDesc(names)));
        //bubble sort extended
        System.out.println(Arrays.toString(bubbleSortLexiExtended(names, true)));
        System.out.println(Arrays.toString(bubbleSortLexiExtended(names, false)));
        //bubble sort with character index
        System.out.println(Arrays.toString(bubbleSortCharIndex(names, 10)));

    }

    //sorting methods
    //////////////////////////////////////////////////////////////
    public static String[] bubbleSortLengthAsc(String[] strings) {
        String[] result = copyArr(strings);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length - i - 1; j++) {
                if (result[j].length() > result[j + 1].length()) {
                    swap(result, j, j + 1);
                }
            }
        }
        return result;
    }

    public static String[] bubbleSortLengthDesc(String[] strings) {
        return reverseArr(bubbleSortLengthAsc(strings));
    }

    public static String[] bubbleSortLexiAsc(String[] strings) {
        String[] result = copyArr(strings);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length - i - 1; j++) {
                //replace Umlaute
                String str1 = replaceSpecialChars(result[j]);
                String str2 = replaceSpecialChars(result[j + 1]);
                if (str1.compareTo(str2) > 0) {
                    swap(result, j, j + 1);
                }
            }
        }
        return result;
    }

    public static String[] bubbleSortLexiDesc(String[] strings) {
        return reverseArr(bubbleSortLexiAsc(strings));
    }

    public static String[] bubbleSortLexiExtended(String[] strings, boolean asc) {
        return asc ? bubbleSortLengthAsc(strings) : bubbleSortLengthDesc(strings);
    }


    public static String[] bubbleSortCharIndex(String[] strings, int pos) {
        String[] result = copyArr(strings);
        if (pos > getMinLengthOfStrings(strings)) {
            System.out.println("Pos größer als die minimalste Stringlänge. Array wird nicht sortiert");
        } else {
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result.length - 1 - i; j++) {
                    String str1 = replaceSpecialChars(result[j]);
                    String str2 = replaceSpecialChars(result[j + 1]);
                    if (str1.charAt(pos) - str2.charAt(pos) > 0) {
                        swap(result, j, j + 1);
                    }
                }
            }
        }
        return result;
    }


    //general helper methods
    //////////////////////////////////////////////////////////////
    public static String[] copyArr(String[] inputArr) {
        String[] copyArr = new String[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            copyArr[i] = inputArr[i];
        }
        return copyArr;
    }

    public static String[] reverseArr(String[] inputArr) {
        String[] result = copyArr(inputArr);
        for (int i = 0; i < result.length / 2; i++) {
            swap(result, i, result.length - 1 - i);
        }
        return result;
    }

    public static void swap(String[] arr, int index1, int index2) {
        String swap = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = swap;
    }

    public static int getMaxLengthOfStrings(String[] strings) {
        int maxL = 0;
        for (String str : strings) {
            if (str.length() > maxL) {
                maxL = str.length();
            }
        }
        return maxL;
    }

    public static int getMinLengthOfStrings(String[] strings) {
        int minL = Integer.MAX_VALUE;
        for (String str : strings) {
            if (str.length() < minL) {
                minL = str.length();
            }
        }
        return minL;
    }

    public static String replaceSpecialChars(String txt) {
        txt = txt.replace("Ä", "A")
                .replace("ä", "a")

                .replace("Ö", "O")
                .replace("ö", "o")

                .replace("Ü", "U")
                .replace("ü", "u")

                .replace("ß", "ss")

                .replace("ã", "a")

                .replace("Å", "A")
                .replace("å", "a")

                .replace("Â", "A")
                .replace("â", "a")

                .replace("À", "A")
                .replace("à", "a")

                .replace("Á", "A")
                .replace("á", "a")

                .replace("Ç", "C")
                .replace("ç", "c")

                .replace("É", "E")
                .replace("é", "e")

                .replace("È", "E")
                .replace("è", "e")

                .replace("Ê", "E")
                .replace("ê", "e")

                .replace("ë", "e")

                .replace("ï", "i")
                .replace("î", "i")
                .replace("ì", "i")
                .replace("í", "i")

                .replace("ô", "o")
                .replace("ò", "o")
                .replace("ó", "o")

                .replace("û", "u")
                .replace("ù", "u")
                .replace("ú", "u")

                .replace("ÿ", "y")

                .replace("Ñ", "N")
                .replace("ñ", "n")
        ;
        return txt;
    }
}

