# Java Spring Boot Sesi 7

Pada sesi ini dipelajari mengenai:
 
 1. Algoritma Selection Sort\
    Sorting dimanfaatkan untuk mempermudah mendapatkan informasi tertentu secara cepat, dengan melakukan pengecekan dari setiap number
    cara Algoritma Selection Sort:\
         - Jumlah Iterasi untuk Selection Sort ialah berjumlah sebesar Jumlah Data – Untuk kasus pada sesi 6 ini, Jumlah Datanya ialah 6. Maka, jumlah Iterasinya ialah sebesar 6 – 1 = 5.\
         - Proses pertukaran Data dimulai dari Data Pertama sampai Data Terakhir dengan cara membandingkanData ke-n dan cari   nilai yang paling kecil di sisi kanan nilai n.\
         - Keterangan bahwa nilai Data yang sudah di tukar(nilai yang paling kecil) tidak akan dibandingkan lagiuntuk proses iterasi berikutnya. Berikut ilustrasi lengkapnya untuk kasus diatas.
    
 2. Binary Search\
    Saat binary search digunakan untuk melakukan operasi pada kumpulan yang telah diurutkan, jumlah iterasi selalu dapat dikurangi tergantung dengan nilai yang dicari


## Running
Compiling: 

    javac NamaFile.java
Dari sini akan di generate file .class

*Catatan: untuk run file tersebut ada 2 perbedaan command untuk run\
    1. Jika dari folder parent harus diopen dari main branch (hactiv8_java_springboot) dengan command:

    java src/sesi7/session/NamaFile
\
2. Jika di run dari folder file tersebut(hacktiv8_java_springboot/src/sesi7/session)

    java NamaFile.java

<table align="center" style="border:none;">
  <tr>
    <td>(<a href="https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi6">Prev Session</a>)</td>
    <td>(<a href="https://github.com/farlhmd/hacktiv8_java_springboot">Back to Main</a>)</td>
    <td>(<a href="https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi8">Next Session</a>)</td>
  </tr>
</table>
    

## Navigation

#### To help you explore these sessions, just click one of these:

1.[ Session 1](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi1) &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp; 7.[ Session 7](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi7) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp; 13.[ Session 13](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi13) &nbsp;&nbsp;|&nbsp;&nbsp; 19.[ Session 19](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi19)\
2.[ Session 2](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi2) &nbsp;&nbsp;|&nbsp;&nbsp; 8.[ Session 8](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi8) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp; 14.[ Session 14](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi14) &nbsp;&nbsp;|&nbsp;&nbsp; 20.[ Session 20](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi20)\
3.[ Session 3](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi3) &nbsp;&nbsp;|&nbsp;&nbsp; 9.[ Session 9](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi9) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp; 15.[ Session 15](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi15) &nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;21.[ Session 21](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi21)\
4.[ Session 4](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi4) &nbsp;&nbsp;|&nbsp;&nbsp; 10.[ Session 10](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi10) &nbsp;&nbsp;|&nbsp;&nbsp; 16.[ Session 16](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi16) &nbsp;&nbsp;|&nbsp;&nbsp; 22.[ Session 22](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi22)\
5.[ Session 5](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi5) &nbsp;&nbsp;|&nbsp;&nbsp; 11.[ Session 11](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi11) &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;17.[ Session 17](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi17) &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp; \
6.[ Session 6](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi6) &nbsp;&nbsp;|&nbsp;&nbsp; 12.[ Session 12](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi12) &nbsp;&nbsp;|&nbsp;&nbsp; 18.[ Session 18](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi18) &nbsp;&nbsp;|&nbsp;&nbsp; 

#### Assignments:

1.[ Assignment 1](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi3/assignment1) &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp; 2.[ Assignment 2](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi5/assignment2) &nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp; 3.[ Assignment 3](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi17/assignment3)


    