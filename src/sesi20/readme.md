# Java Spring Boot Sesi 20

Pada sesi ini dipelajari mengenai:
## Unit Testing
Link: [Unit Testing](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi20/SpringTokoBasicAuthUnitTest)\
Unit testing adalah metode yang menggunakan mock data (data palsu) untuk melakukan pengecekan pada suatu block kode untuk mengantisipasi berbagai jenis data.
#### Contoh Penggunaan
- Mendeklarasi variable yang akan dilakukan unit testing 

        final Long id = new Random().nextLong();
		final Product product = TestObjectFactory.createProduct();
		Mockito.when(productRepository.findById(id)).thenReturn(Optional.of(product));
-  Mendeklarasi variable "actual" yang akan dijadikan patokan unit testing

		final Product actual = productService.findProductById(id);
- Melakukan pengecekan apakah nilai pada variable product(mock) sudah sesuai dengan yang ada pada variable "actual"

		MatcherAssert.assertThat(actual.getId(), Matchers.equalTo(product.getId()));
		MatcherAssert.assertThat(actual.getName(), Matchers.equalTo(product.getName()));
		MatcherAssert.assertThat(actual.getHargaBeli(), Matchers.equalTo(product.getHargaBeli()));
		MatcherAssert.assertThat(actual.getHargaJual(), Matchers.equalTo(product.getHargaJual()));



## Spring Security
Link: [Spring Security](https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi20/SpringTokoBasicAuth)\
Pada Spring Security, dipelajari bagaimana dilakukan authentikasi dan authorization pada role user yang telah ditentukan.

#### Contoh Penggunaan
        http.httpBasic()
                        .and()
                                .authorizeRequests()
                                .antMatchers("/api/index").permitAll()
                                .antMatchers("/api/profile/**").authenticated()
                                .antMatchers("/api/products/**").hasRole("ADMIN")
                                .antMatchers("/api/management/**").hasAnyRole("ADMIN", "MANAGER")
                                .antMatchers("/api/user/test1").hasAuthority("ACCESS_TEST1")
                                .antMatchers("/api/user/test2").hasAuthority("ACCESS_TEST2")
Pada block kode diatas, terdapat beberapa jenis authorization:
- permitAll digunakan untuk memberikan izin kepada semua user
- authenticated memberikan izin kepada setiap user yang sudah melakukan authentikasi
- hasRole dan hasAnyRole memberikan izin kepada user dengan role yang ditentukan
- hasAuthority memberikan izin spesifik terhadap authority yang dimiliki user 

Pengetestan authority dapat dilakukan dengan Postman

## Running
- Running Unit test dilakukan dengan membuka folder (hacktiv8_java_springboot/src/sesi20/SpringTokoBasicAuthUnitTest)
- Running Spring Security dilakukan dengan membuka folder (hacktiv8_java_springboot/src/sesi20/SpringTokoBasicAuth)
- Jalankan server database dan buat database db_products
- Lakukan konfigurasi pada (src/main/resources/application.properties)
### 1. Unit Test

Jika menggunakan Eclipse IDE, dapat run dengan:
        
       Pada folder SpringTokoBasicAuthUnitTest > Klik kanan SpringTokoBasicAuthUnitTest > Run as > JUnit Test

Lalu akan muncul lambang berwarna hijau jika test dan kodingan sudah benar, dan merah jika ada yang tidak bagaimana seharusnya.\
### 2. Spring Security

Jika menggunakan Eclipse IDE, dapat run dengan mengaktifkan Boot Dashboard pada view:
        
       Buka Boot Dashboard > Klik kanan SpringTokoBasicAuth > klik (re)start

- Pada database, db_products akan terisi sesuai dengan kodingan pada main file.
- Buka Postman, lakukan pemanggilan API dengan domain yang sudah diberikan hak akses.

Jika menggunakan VSCode, dapat run menggunakan Terminal:

Update file pom.xml:

        mvn clean
Compile/install files:

        mvn install
Run with test:

        mvn test

*Catatan: lengkapi pom.xml dengan dependency yang diperlukan

<table align="center" style="border:none;">
  <tr>
    <td>(<a href="https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi19">Prev Session</a>)</td>
    <td>(<a href="https://github.com/farlhmd/hacktiv8_java_springboot">Back to Main</a>)</td>
    <td>(<a href="https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi21">Next Session</a>)</td>
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


    