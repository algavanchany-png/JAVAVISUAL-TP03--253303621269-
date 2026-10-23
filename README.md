# Character Manager — TP3 (Java Visual SIH-6406)

Aplikasi manajemen karakter berbasis konsol Java yang mengimplementasikan konsep Object-Oriented Programming (OOP) meliputi struktur package, enum, encapsulation, constructor overloading, serta validasi atribut. Tugas ini dibangun sebagai fondasi model class sebelum pengembangan antarmuka grafis (GUI) di sprint berikutnya.

## 📸 Screenshot Output Terminal
![alt text](<screenshots/Screenshot Output Terminal (TP3).png>)
## 📂 Struktur Folder Project
```text
CharacterManager/
├── src/
│   └── com/
│       └── unpri/
│           └── charactermanager/
│               ├── model/
│               │   ├── CharacterType.java
│               │   └── Character.java
│               └── Main.java
└── README.md

## TP8 - Character Manager Sprint #3
### MainWindow, Data Dinamis & Analisis MVC

#### A. Deskripsi
TP8 merupakan pengembangan aplikasi Character Manager dari program berbasis console menjadi aplikasi GUI menggunakan Java Swing. Aplikasi menampilkan daftar karakter, tipe karakter, level, dan statistik rata-rata level secara dinamis.

#### B. Fitur yang Diimplementasikan
- MainWindow menggunakan JFrame.
- JPanel dan JLabel untuk menampilkan informasi karakter.
- Data karakter ditampilkan menggunakan perulangan (loop).
- CharacterManager digunakan untuk mengelola daftar karakter.
- Statistik rata-rata level dihitung menggunakan getAverageLevel().
- GUI dijalankan menggunakan SwingUtilities.invokeLater().

 C. Screenshot Program

1. Tampilan awal dengan minimal 5 karakter
src/screenshots/Screenshot Output Terminal (TP3).png

2. Tampilan setelah data karakter diubah
src/screenshots/Screenshot Output Terminal (TP8).png


#### D. Aliran Data dan Prinsip MVC
Main.java membuat objek CharacterManager dan memasukkan data karakter ke dalamnya. CharacterManager menyimpan serta mengelola daftar karakter, kemudian MainWindow mengambil data melalui method getAllCharacters() dan menampilkan setiap karakter menggunakan JLabel. Statistik rata-rata level ditampilkan melalui method getAverageLevel() dari CharacterManager. Struktur ini memisahkan pengelolaan data dari tampilan GUI, sehingga mendukung prinsip pemisahan tanggung jawab dalam MVC, meskipun Controller khusus belum diimplementasikan.

E. Karakter Baru
- Gandalf: bertipe MAGE dengan level 3 karena digambarkan sebagai karakter yang mengandalkan kemampuan sihir.
- Lancelot: bertipe WARRIOR dengan level 6 karena digambarkan sebagai petarung yang mengandalkan kekuatan fisik.
- Shadow: bertipe ROGUE dengan level 4 karena digambarkan sebagai karakter yang mengandalkan kecepatan dan serangan taktis.


 📌 TP10 — Character Manager Sprint #4
Tangkapan Layar (Screenshots)

Sesudah (v0.4):src/screenshots/Screenshot Output Terminal (TP10) V.4.png

Penjelasan AppTheme vs Model
Warna, font, dan dekorasi disimpan di dalam `AppTheme` (layer View) dan bukan di dalam objek `Character` (layer Model) untuk menjaga prinsip pemisahan tugas (*separation of concerns*). Model murni bertugas merepresentasikan data bisnis, sementara View bertanggung jawab penuh atas aspek visual. Jika warna disimpan di Model, perubahan desain antarmuka akan memaksa perubahan pada struktur data dasar.

 Dua Properti Tambahan yang Dipilih
1. Tooltip Informasi Status: Menampilkan informasi detail (Role, Level, HP, dan Attack) saat kursor diarahkan ke kartu karakter.
2. Dynamic Border Berdasarkan Role: Memberikan garis tepi pada kartu yang warnanya disesuaikan secara dinamis dengan *role* karakter menggunakan `AppTheme.colorFor()`.

