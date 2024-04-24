package irem.week08.Vererbung;

import gyula.week08.vererbung.LuftFahrtzeug;

public class Flugzeug extends LuftFahrtzeug {
        private int spannweite;

        public Flugzeug(String name, int gewicht, int spannweite){
            super(name, gewicht);
            this.spannweite = spannweite;
        }
    }

