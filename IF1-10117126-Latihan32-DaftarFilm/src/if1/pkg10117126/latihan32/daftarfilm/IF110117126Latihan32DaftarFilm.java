/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117126.latihan32.daftarfilm;

/**
 *
 * @author 
 * Nama     : Mawa Faqu Rochman
 * Kelas    : IF-1
 * NIM      : 10117126
 * Deskripsi Program : program ini berisi program yang menampilkan deskripsi  
 * film yang sedang tayang
 */public class IF110117126Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=== Daftar Film Sedang Tayang ===");

        film film1 = new film();
        film1.filmName = "Small Foot";
        film1.filmGenre = "Animation";
        film1.filmRating = 9.0;
        film1.filmDuration = 96;
        film1.nowPlaying(film1.filmName, film1.filmGenre, film1.filmRating,
                film1.filmDuration);

        film film2 = new film();
        film2.filmName = "Crazy Rich Asian";
        film2.filmGenre = "Comedy";
        film2.filmRating = 7.8;
        film2.filmDuration = 119;
        film2.nowPlaying(film2.filmName, film2.filmGenre, film2.filmRating,
                film2.filmDuration);
    }

}
