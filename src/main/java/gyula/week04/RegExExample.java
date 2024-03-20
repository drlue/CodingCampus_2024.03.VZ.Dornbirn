package gyula.week04;

public class RegExExample {
    /*
RegEx:     A
Erlaubt die folgenden Texte: A

RegEx:     ABC
Erlaubt die folgenden Texte: ABC

RegEx:     A?
Bedeutung: 0 oder 1 vorkommnisse
Erlaubt die folgenden Texte: "", A

RegEx:     A*
Bedeutung: 0 oder mehr vorkommnisse
Erlaubt die folgenden Texte: "", A, AA, AAA, AAAA, AAAAA, AAAAAA, AAAAAAA, ...

RegEx:     A+
Bedeutung 1 oder mehr vorkommnissee:
Erlaubt die folgenden Texte: A, AA, AAA, AAAA, AAAAA, AAAAAA, AAAAAAA, ...

RegEx:     A{3,5}
Bedeutung 3 bis 5  vorkommnissee:
Erlaubt die folgenden Texte: AAA, AAAA, AAAAA


RegEx:     AB*C
Erlaubt die folgenden Texte: AC, ABC, ABBC, ABBBC, ABBBBC, ABBBBBC

RegEx:     AB+C
Erlaubt die folgenden Texte: ABC, ABBC, ABBBC, ABBBBC, ABBBBBC

RegEx:     (AB)+C
Erlaubt die folgenden Texte: ABC, ABABC, ABABABC, ABABABABC

RegEx:     ((AB)+C)*
Erlaubt die folgenden Texte: "", ABC, ABCABC, ABABCABC, ABCABABABC, ABABC, ABABABC, ABABABABC

RegEx:      A|B
Bedeutung: Entweder oder
Erlaubt die folgenden Texte: A, B

RegEx:      [AB]
Bedeutung: Eine Buchstabe aus der Liste:
Erlaubt die folgenden Texte: A, B

RegEx:      [ABCDE]
Erlaubt die folgenden Texte: A, B, C, D, E

RegEx:      [A-Z]
Erlaubt die folgenden Texte: A, B, C, D, E, F, G, H, I, ..., X, Y, Z

RegEx:      [A-Z0-9]
Erlaubt die folgenden Texte: A, B, C, D, E, F, G, H, I, ..., X, Y, Z, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9


String.match()
String.replaceAll()
     */
}
