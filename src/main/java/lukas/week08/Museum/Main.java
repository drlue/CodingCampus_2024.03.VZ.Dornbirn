package lukas.week08.Museum;

import christian.week04.day03.SearchForWordInText;
import lukas.week08.Museum.Art.*;
import lukas.week08.Museum.Rooms.Corridor;
import lukas.week08.Museum.Rooms.ExhibitionRoom;
import lukas.week08.Museum.Rooms.Room;

import java.util.Collections;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {


        //================= CONFIGURATION ===================================

        //Build museum
        Museum museum = new Museum("Kunsthistorisches Museum Dornbirn");

        //Rooms
        //             -----------------------------------------
        //             | Room 11 | Room 13 | Room 15 | Room 17 |
        // ------------|---------------------------------------|
        // | Entrance  |             Corridor 1                |
        // ------------|---------------------------------------|
        //             | Room 12 | Room 14 | Room 16 | Roo, 18 |
        //             -----------------------------------------

        //--------------------
        Corridor entrance = new Corridor("Entrance");
        museum.addRoom(entrance);
        Corridor corr1 = new Corridor("Corridor 1");
        museum.addRoom(corr1);
        corr1.addNeighbor(entrance);
        entrance.addNeighbor(corr1);

        //rooms in corridor 1
        Vector<ExhibitionRoom> tmpRooms = new Vector<>();
        int nrRooms = 8;
        for (int i = 0; i < nrRooms; i++) {
            ExhibitionRoom room = new ExhibitionRoom("Room" + (10 + i+1));
            museum.addRoom(room);
            room.addNeighbor(corr1);
            tmpRooms.add(room);//needed for neighbors
        }
        //add neighbors
        for (int i = 0; i < tmpRooms.size(); i++) {
            corr1.addNeighbor(tmpRooms.get(i));
            if (i > 1) {
                tmpRooms.get(i).addNeighbor(tmpRooms.get(i - 2));
            }
            if (i < tmpRooms.size() - 2) {
                tmpRooms.get(i).addNeighbor(tmpRooms.get(i + 2));
            }
        }

        //Artwork
        //--------------------
        Vector<Painting> paintings = new Vector<>();
        paintings.add(new Painting("Mona Lisa", "Leonardo Da Vinci", 800000000, 1512));
        paintings.add(new Painting("Salvador Mundi", "Leonardo Da Vinci", 450000000, 1510));
        paintings.add(new Painting("Nafea faa ipoipo", "Gaugin", 300000000, 1892));
        paintings.add(new Painting("Les Joueurs de cartes", "Cézanne", 250000000, 1893));
        paintings.add(new Painting("Shot Sage Blue Marilyn", "Warhol", 195000000, 1964));
        paintings.add(new Painting("Les femmes d'Aiger", "Picasso", 179000000, 1955));
        paintings.add(new Painting("Nu couché", "Modigliani", 170000000, 1917));
        paintings.add(new Painting("Nu couché (sur le côte gauche)", "Modigliani", 157000000, 1917));
        paintings.add(new Painting("Triptychon", "Bacon", 142000000, 1969));
        paintings.add(new Painting("Les Poseuses", "Seurat", 149000000, 1888));
        paintings.add(new Painting("No. 5, 1948", "Pollock", 140000000, 1948));
        paintings.add(new Painting("Femme à la montre", "Picasso", 139000000, 1932));
        paintings.add(new Painting("Montagne Sainte-Victoire", "Cézanne", 138000000, 1890));
        paintings.add(new Painting("Woman III", "de Kooning", 138000000, 1953));
        paintings.add(new Painting("Adele Bloch-Bauer I", "Klimt", 135000000, 1907));
        paintings.add(new Painting("Der Schrei", "Munch", 120000000, 1895));
        paintings.add(new Painting("Verger avec cyprès", "van Gogh", 117000000, 1888));
        paintings.add(new Painting("Les Meules", "Monet", 111000000, 1890));
        paintings.add(new Painting("Dame mit Fächer", "Klimt", 109000000, 1903));
        paintings.add(new Painting("Nu au Plateau de Sculpteur", "Picasso", 106000000, 1932));
        paintings.add(new Painting("Maternité II", "Gauguin", 106000000, 1899));
        paintings.add(new Painting("Birkenwald", "Klimt", 105000000, 1903));
        paintings.add(new Painting("Garçon à la pipe", "Picasso", 104000000, 1905));
        paintings.add(new Painting("Femme assise près d’une fenêtre", "Picasso", 103000000, 1932));
        paintings.add(new Painting("Nurse", "Lichtenstein", 95000000, 1964));
        paintings.add(new Painting("Dora Maar au Chat", "Picasso", 95000000, 1941));
        paintings.add(new Painting("In This Case", "Basquiat", 93000000, 1982));
        paintings.add(new Painting("Junger Mann mit Medaillon", "Botticelli", 92000000, 1480));
        paintings.add(new Painting("Chop Suey", "Hopper", 90000000, 1929));
        paintings.add(new Painting("Portrait of an Artist", "Hockney", 90000000, 1972));
        paintings.add(new Painting("Adele Bloch-Bauer II", "Klimt", 88000000, 1912));
        paintings.add(new Painting("Orange, Red, Yellow", "Rothko", 87000000, 1961));
        paintings.add(new Painting("Triptych, 1976", "Bacon", 86000000, 1976));
        paintings.add(new Painting("Nymphéas en fleur", "Monet", 85000000, 1917));
        paintings.add(new Painting("No. 7", "Rothko", 83000000, 1951));
        paintings.add(new Painting("No. 10", "Rothko", 82000000, 1958));
        paintings.add(new Painting("Les Meules", "Monet", 82000000, 1891));
        paintings.add(new Painting("Laboureur dans un champ", "van Gogh", 81000000, 1889));
        paintings.add(new Painting("Odalisque couchée aux magnolias", "Matisse", 81000000, 1923));
        paintings.add(new Painting("Le Bassin aux Nymphéas", "Monet", 81000000, 1919));
        paintings.add(new Painting("False Start", "Johns", 80000000, 1959));
        paintings.add(new Painting("Das Reich der Lichter", "Magritte", 80000000, 1961));
        paintings.add(new Painting("Bal au Moulin de la Galette", "Renoir", 78000000, 1876));
        paintings.add(new Painting("Das Massaker der Unschuldigen", "Rubens", 77000000, 1611));
        paintings.add(new Painting("Le Parlement, soleil couchant", "Monet", 76000000, 1903));
        paintings.add(new Painting("No. 1", "Rothko", 75000000, 1954));
        paintings.add(new Painting("Le bassin aux nymphéas", "Monet", 74000000, 1919));
        paintings.add(new Painting("White Center", "Rothko", 7300000, 1950));
        paintings.add(new Painting("Portrait de l’artiste sans barbe", "van Gogh", 7200000, 1889));
        paintings.add(new Painting("Cabanes de bois parmi les oliviers et cyprès", "van Gogh", 7100000, 1889));
        paintings.add(new Painting("Darmstädter Madonna", "Holbein", 7000000, 1526));
        paintings.add(new Painting("Meine Katze Mia", "Kleiner Fritz", 1, 2023));


        Vector<Drawing> drawings = new Vector<>();
        drawings.add(new Drawing("Selbstbildnis des Dreizehnjährigen", "Dürer", 500000, 1484));
        drawings.add(new Drawing("Feldhase", "Dürer", 3500000, 1486));
        drawings.add(new Drawing("Bildnis der Mutter", "Dürer", 500000, 1514));
        drawings.add(new Drawing("Dante verloren im Wald", "Doré", 40000, 1875));
        drawings.add(new Drawing("Ein Hundeleben", "Doré", 40000, 1875));
        drawings.add(new Drawing("Der Styx", "Doré", 400000, 1870));
        drawings.add(new Drawing("Torheit der Furcht", "De Goya", 60000, 1815));
        drawings.add(new Drawing("Desastres de la Guerra", "De Goya", 50000, 1820));
        drawings.add(new Drawing("UML-Diagram von Musuem", "Zech", 1, 2024));


        Vector<Statue> statues = new Vector<>();
        statues.add(new Statue("Venus von Milo", 100000000, -330));
        statues.add(new Statue("Nike von Samothrake", 100000000, -190));
        statues.add(new Statue("David", 330000000, 1504));
        statues.add(new Statue("Der Denker", 50000000, 1882));
        statues.add(new Statue("Büste der Nofretete", 100000000, -1345));
        statues.add(new Statue("Unique Forms of Continuity in Space", 70000000, 1916));
        statues.add(new Statue("Blaue Plastilin Wurst", 1, 2024));

        Vector<Photograph> photographs = new Vector<>();
        photographs.add(new Photograph("Buzz Aldrin On The Moon", "Neil Armstrong", 1000000, 1969, Photograph.Type.COLORED));
        photographs.add(new Photograph("Beatles On Abbey Road", "Iain Macmillan", 204000, 1969, Photograph.Type.COLORED));
        photographs.add(new Photograph("Albert Einstein", "Arthur Sasse", 62500, 1951, Photograph.Type.BW));
        photographs.add(new Photograph("Marylin Monroe In White Dress", "Sam Shaw", 3900000, 1954, Photograph.Type.BW));
        photographs.add(new Photograph("The Tetons and the Snake River", "Ansel Adams", 40000, 1942, Photograph.Type.BW));
        photographs.add(new Photograph("They are coming", "Helmut Newton", 40000, 1981, Photograph.Type.BW));
        photographs.add(new Photograph("John Lennon and Yoko Ono", "Helmut Newton", 70000, 1980, Photograph.Type.COLORED));
        photographs.add(new Photograph("Boulevard in Paris", "Louis Daguerre", 120000, 1839, Photograph.Type.BW));


        //Fill Exhibition Rooms with Artwork
        Vector<Artwork> remainingArtwork = new Vector<>();
        remainingArtwork.addAll(paintings);
        remainingArtwork.addAll(drawings);
        remainingArtwork.addAll(statues);
        remainingArtwork.addAll(photographs);

        for (ExhibitionRoom er : tmpRooms) {
            int nrOfArtworkInRoom = Museum.random.nextInt(1,11);
            for (int i = 0; i < nrOfArtworkInRoom; i++) {
                er.addArtwork(remainingArtwork.remove(Museum.random.nextInt(remainingArtwork.size())));
            }
        }


        museum.printMuseum();


    }

}
