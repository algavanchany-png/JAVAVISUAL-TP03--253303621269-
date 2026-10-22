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


