package org.example;

public class Main {
    public static void main(String[] args) {
        Folder folder = new Folder("Movie");
        Folder comedyMovie=new Folder("Comedy Movie");
        Folder horrorMovie=new Folder("Horror Movie");


        File movie1=new File("Hungama");
        File movie2=new File("Golmaal");
        File movie3=new File("Sinner");
        File movie4=new File("Until Down");

        horrorMovie.add(movie3);
        horrorMovie.add(movie4);

        comedyMovie.add(movie1);
        comedyMovie.add(movie2);

        Folder audio=new Folder("Audio");
        File audioHindi=new File("Hindi");
        audio.add(audioHindi);
        comedyMovie.add(audio);


        File audioEnglish=new File("English");
        audio.add(audioEnglish);

        horrorMovie.add(audio);

        folder.add(comedyMovie);
        folder.add(horrorMovie);

        folder.ls();


    }
}