# Kebun Binatang Digital - Kelompok 2

Aplikasi desktop edukasi sederhana berbasis JavaFX yang dirancang untuk memperkenalkan berbagai macam suara hewan kepada pengguna secara interaktif. Proyek ini dikembangkan menggunakan **Maven.**

## Fitur Utama
* **Antarmuka Interaktif**: Menggunakan tata letak `FlowPane` yang responsif dan `VBox` untuk merapikan setiap elemen hewan.
* **Multi-Media**: Mendukung tampilan gambar (`ImageView`) dan pemutaran audio (`MediaPlayer`) secara bersamaan.
* **Efek Hover**: Gambar akan sedikit membesar saat kursor berada di atasnya untuk memberikan *feedback* visual yang menarik.
* **8+ Hewan**: Dilengkapi dengan koleksi hewan seperti Kucing, Sapi, Domba, Serigala, Ayam, Anjing, Kuda, dan Lumba-lumba.
* **Tombol Suara Khusus**: Selain mengklik gambar, pengguna juga bisa menekan tombol "Dengarkan Suaranya".

## Teknologi yang Digunakan
* **Bahasa Pemrograman**: Java (JDK 23)
* **Framework GUI**: JavaFX 17
* **Build Tool**: Apache Maven
* **Library Audio/Video**: JavaFX Media

## Struktur Proyek
Aset gambar dan suara disimpan di folder standar Maven:
`src/main/resources/`
File berekstensi `.jpg` untuk gambar dan `.mp3` untuk suara.
