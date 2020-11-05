/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan32.daftarfilm.oo;

/**
 *
 * @author Alfi Nurizkya
 * NAMA     : ALFI NURIZKYA
 * KELAS    : IF-1
 * NIM      : 10119036
 * DESKRIPSI PROGRAM : Membuat Program Daftar Film Berbasis Object Oriented
 */
public class Latihan32DaftarFilmOO {

   public String FilmName;
   public String FilmGenre;
   public String FilmRating;
   public String FilmDuration;
   
    public static void main(String[] args) {
        System.out.println("====Daftar Film Sedang Tayang====");
        System.out.println();
        
        NowPlaying("Venom", "Action, Horror, SciFi",8.5,120);
        System.out.println();
        
        NowPlaying("Small Foot", "Animation",9.0,96);
        System.out.println();
        
        NowPlaying("Crazy Rich Asian", "Comedy",7.8,119);
        System.out.println();
        
        NowPlaying("Asih", "Horror",6.0,100);
        System.out.println();
        
    }
    
    public static void NowPlaying(String FilmName, String FilmGenre, double FilmRating, int FilmDuration) {
        
        System.out.println("Judul FIlm      : " + FilmName);
        System.out.println("Genre Film      : " + FilmGenre);
        System.out.println("Rating Film     : " + FilmRating);
        System.out.println("Durasi Film     : " + FilmDuration + " Menit");
    }
    
}
