package TugasPraktikumPemlan01;
    
public class Library {

    public String kategoriBuku;

    public String [][] teknologi;
    public String [][] filsafat;
    public String [][] sejarah;
    public String [][] agama;
    public String [][] psikologi;
    public String [][] politik;
    public String [][] fiksi;

    public Library(){
        kategoriBuku = "";
        teknologi = new String[][]{ 
            {"The Art of Computer Programming", "Donald E. Knuth", "1968", "1088", "Buku klasik tentang algoritma dan struktur data, mencakup prinsip-prinsip dasar dalam pemrograman."},
            {"The Pragmatic Programmer", "Andrew Hunt, David Thomas", "1999", "352", "Panduan praktis untuk pengembangan perangkat lunak, menekankan pada pemecahan masalah dan pengembangan profesional."},
            {"Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", "2008", "464", "Panduan untuk menulis kode yang bersih dan mudah dipahami, dengan fokus pada kualitas kode."},
            {"Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", "1994", "395", "Pengantar pola desain dalam pemrograman berorientasi objek, mencakup berbagai pola desain yang berguna."},
            {"You Don't Know JS", "Kyle Simpson", "2014", "400", "Panduan mendalam tentang JavaScript, dari dasar hingga lanjutan, mencakup konsep-konsep penting dalam pemrograman JavaScript."}
        };
        filsafat = new String[][]{
            {"The Republic", "Plato", "380 BC", "712", "Filosofi politik dan etika, mencakup pemikiran tentang keadilan dan kebebasan."},
            {"Meditations", "Marcus Aurelius", "185", "128", "Pemikiran tentang kehidupan dan kebahagiaan, dengan fokus pada pencarian kebahagiaan dalam kehidupan."},
            {"The Critique of Pure Reason", "Immanuel Kant", "1781", "752", "Pemikiran tentang logika dan pengetahuan, mencakup pemikiran tentang kemungkinan dan kenyataan."},
            {"Being and Nothingness", "Jean-Paul Sartre", "1943", "400", "Suatu pemikiran tentang eksistensialisme, dengan fokus pada keberadaan dan kebebasan."},
            {"The Alchemist", "Paulo Coelho", "1988", "167", "Pemikiran tentang kehidupan dan tujuan, dengan fokus pada pencarian tujuan dalam kehidupan."}
        };
        sejarah = new String[][]{
            {"A People's History of the United States", "Howard Zinn", "1980", "728", "Sejarah Amerika dari perspektif rakyat, mencakup perjuangan dan perubahan sosial."},
            {"The Guns of August", "Barbara Tuchman", "1962", "464", "Sejarah Pertama Dunia Perang, dengan fokus pada peristiwa yang mengubah dunia."},
            {"The Rise and Fall of the Third Reich", "William L. Shirer", "1960", "1024", "Sejarah Nazi Jerman, mencakup tentang perjalanan dan kegagalan pemerintahan totalitarian."},
            {"The Autobiography of Malcolm X", "Malcolm X, Alex Haley", "1965", "320", "Sejarah hidup dan perjuangan Malcolm X, dengan fokus pada perjuangan anti-rasisme."},
            {"The Diary of a Young Girl", "Anne Frank", "1952", "126", "Sejarah hidup Anne Frank selama Perang Dunia II, dengan fokus pada kehidupan dalam kondisi kekerasan."}
        };
        agama = new String[][]{
            {"The Bible", "Various Authors", "1611", "1544", "Kitab suci Agama Kristen, mencakup tentang pengajaran dan ajaran Kristen."},
            {"The Qur'an", "Al-Zaid", "610", "604", "Kitab suci Agama Islam, mencakup tentang ajaran dan pengajaran Islam."},
            {"The Bhagavad Gita", "Krishna", "500 BC", "184", "Panduan moral dan spiritual, dengan fokus pada pencarian kebenaran dan keadilan."},
            {"The Book of Mormon", "Joseph Smith", "1830", "544", "Kitab suci Gereja Kristen Jesu Kristus dari Penghuni Bumi, mencakup pengajaran dan ajaran Gereja Kristen."},
            {"The Tao Te Ching", "Lao Tzu", "3rd century BC", "81", "Panduan hidup dan filosofi Taoisme, dengan fokus pada keseimbangan dan harmoni."}
        };
        psikologi = new String[][]{
            {"Thinking, Fast and Slow", "Daniel Kahneman", "2011", "416", "Pemikiran tentang kesalahan kognitif dan pengambilan keputusan, dengan fokus pada dua sistem pemikiran."},
            {"The Power of Now", "Eckhart Tolle", "1997", "256", "Pemikiran tentang kesadaran dan kebebasan, dengan fokus pada pencarian kebebasan dalam kehidupan."},
            {"The Body Keeps the Score", "Bessel van der Kolk", "2014", "336", "Pemikiran tentang trauma dan pemulihan, dengan fokus pada dampak trauma pada tubuh dan pikiran."},
            {"Emotional Intelligence", "Daniel Goleman", "1995", "384", "Pemikiran tentang kecerdasan emosional, dengan fokus pada pengembangan kecerdasan emosional."},
            {"The Art of Loving", "Erich Fromm", "1956", "256", "Pemikiran tentang kasih dan hubungan, dengan fokus pada pencarian kebahagiaan dalam hubungan."}
        };
        politik = new String[][]{
            {"The Federalist Papers", "Alexander Hamilton, James Madison, John Jay", "1787", "400", "Pemikiran tentang konstitusi Amerika Serikat, dengan fokus pada pembentukan konstitusi."},
            {"The Communist Manifesto", "Karl Marx, Friedrich Engels", "1848", "128", "Pemikiran tentang komunisme dan revolusi sosial, dengan fokus pada perjuangan kelas."},
            {"The Prince", "Niccolò Machiavelli", "1532", "160", "Pemikiran tentang kepemimpinan dan politik, dengan fokus pada praktik kepemimpinan."},
            {"The Art of War", "Sun Tzu", "500 BC", "144", "Pemikiran tentang strategi dan perang, dengan fokus pada pemahaman strategi dalam konteks perang."},
            {"The Federalist", "Alexander Hamilton", "1787", "85", "Pemikiran tentang konstitusi Amerika Serikat, dengan fokus pada pembentukan konstitusi."}
        };
        fiksi = new String[][]{
            {"To Kill a Mockingbird", "Harper Lee", "1960", "281", "Novel tentang rasisme dan keadilan di Amerika Selatan, dengan fokus pada perjuangan anti-rasisme."},
            {"1984", "George Orwell", "1949", "328", "Novel tentang diktatur dan kontrol sosial, dengan fokus pada perjuangan kebebasan."},
            {"The Great Gatsby", "F. Scott Fitzgerald", "1925", "180", "Novel tentang kehidupan dan ambisi di era Prohibisi, dengan fokus pada perjuangan dan perubahan sosial."},
            {"The Catcher in the Rye", "J.D. Salinger", "1951", "277", "Novel tentang identitas dan generasi, dengan fokus pada perjuangan identitas dalam konteks generasi."},
            {"The Lord of the Rings", "J.R.R. Tolkien", "1954", "1200", "Novel tentang petualangan dan kekuatan, dengan fokus pada perjalanan karakter utama."}
        };
    }
    public String [][] getKategori(int kategori){
        switch (kategori) {
            case 1:
                kategoriBuku = "Teknologi";
                return teknologi;
            case 2:
                kategoriBuku = "Filsafat";
                return filsafat;
            case 3:
                kategoriBuku = "Sejarah";
                return sejarah;
            case 4:
                kategoriBuku = "Agama";
                return agama;
            case 5:
                kategoriBuku = "Psikologi";
                return psikologi;
            case 6:
                kategoriBuku = "Politik";
                return politik;
            case 7:
                kategoriBuku = "Fiksi";
                return fiksi;
            case 8:
                return new String[][]{};
            default:
                return null;
        }
    }

    public int hitungJumlahKataSinopsis(int kategori) {
        String[][] bukuKategori = getKategori(kategori);
        int totalKata = 0;
    
        if (bukuKategori != null) {
            for (int i = 0; i < bukuKategori.length; i++) {
                String sinopsis = bukuKategori[i][4];
                totalKata += hitungKata(sinopsis);
            }
        }
    
        return totalKata;
    }
    
    public int hitungKata(String teks) {
        String[] kata = teks.split("\\s+"); 
        return kata.length;
    }

    public void getBuku(int buku) {
        String [][] bukuKategori = getKategori(buku);
        System.out.println("\nBerikut adalah daftar buku dalam kategori " + kategoriBuku + ":\n");
        for (int i = 0; i < bukuKategori.length; i++) {
            System.out.printf("Judul \t\t\t :%s\n",bukuKategori[i][0]);
            System.out.printf("Penulis \t\t :%s\n",bukuKategori[i][1]);
            System.out.printf("Tahun terbit \t\t :%s\n",bukuKategori[i][2]);
            System.out.printf("Jumlah halaman \t\t :%s\n",bukuKategori[i][3]);
            System.out.printf("Sinopsis \t\t :%s\n",bukuKategori[i][4]);
            int jumlahKata = hitungKata(bukuKategori[i][4]);
            System.out.printf("Jumlah kata sinopsis \t\s:%s\n ", jumlahKata);
            System.out.println("_______________________________________________________");
        }
    }
    
    public void tampilkanSemua() {
        for (int i = 1; i <= 7; i++) {
            getBuku(i);
        }
    }
}
