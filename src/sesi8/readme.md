# Java Spring Boot Sesi 8

Pada sesi ini dipelajari mengenai:
 
 1. Multithreading\
    Merupakan sebuah konsep untuk menjalankan lebih dari satu tugas secara bersamaan dengan cara pararel. Yang akan mempercepat proses penyelesaiannya.

2. Synchronized\
    Ini adalah sebuah metode untuk menjaga output dari multithreading tetap tersusun secara urut.


Selain itu, juga dilakukan migrasi dari VSCode ke Eclipse dengan command:
        
         mvn eclipse:eclipse

Command untuk membuat folder unit testing: 

        mvn archetype:generate -DgroupId=com.learning.thread -DartifactId=DemoThread -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

## Running
Running dilakukan dengan membuka folder (hacktiv8_java_springboot/src/sesi8/DemoThread)\
Jika menggunakan Eclipse IDE, dapat run dengan:
        
        Klik kanan pom.xml > run as > maven clean > maven install > maven test

Jika menggunakan VSCode, dapat merunning menggunakan Terminal:\

Update file pom.xml:

        mvn clean
Compile/install files:

        mvn install
Run with test:

        mvn test

*Catatan: lengkapi pom.xml dengan dependency yang diperlukan

<table align="center" style="border:none;">
  <tr>
    <td>(<a href="https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi7">Prev Session</a>)</td>
    <td>(<a href="https://github.com/farlhmd/hacktiv8_java_springboot">Back to Main</a>)</td>
    <td>(<a href="https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi9">Next Session</a>)</td>
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


    