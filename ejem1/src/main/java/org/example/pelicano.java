package org.example;

public class pelicano {
    String colorPico;
    String colorOjos;
    int numAlas;

    static class Builder {
        String colorPico;
        String colorOjos;
        int numAlas;


        Builder setcolorPico(String colorPico) {
            this.colorPico = colorPico;
            return this;
        }

        Builder setcolorOjos(String colorOjos) {
            this.colorOjos = colorOjos;
            return this;
        }

        Builder setnumAlas(int numAlas) {
            this.numAlas = numAlas;
            return this;
        }

        pelicano build() {
            pelicano pelicano = new pelicano();
            pelicano.colorPico = this.colorPico;
            pelicano.colorOjos = this.colorOjos;
            pelicano.numAlas = this.numAlas;
            return pelicano;
        }
    }
}
