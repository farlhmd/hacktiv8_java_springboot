# Java Spring Boot Sesi 6

Pada sesi ini dipelajari mengenai:
 
Git CLI


## Urutan Penggunaan Git
1. Inisialisasi

        git config --list
        git config --global --list
        git status

2. Login pada Github

        git config --global user.name "Nama"
        git config --global user.email "email"
        git config --global credential.username "username"

 3. Pindah branch

        git checkout -b main
        git checkout -b master

4. Pemanfaatan Git sebagai SCM (Source Control Management)

        git init
        git remote add origin url
        git add README.md
        git commit -m "first commit"
        git checkout -b main
        git pull origin branchname --allow-unrelated-histories
        git push -u origin main


<table align="center" style="border:none;">
  <tr>
    <td>(<a href="https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi5">Prev Session</a>)</td>
    <td>(<a href="https://github.com/farlhmd/hacktiv8_java_springboot">Back to Main</a>)</td>
    <td>(<a href="https://github.com/farlhmd/hacktiv8_java_springboot/tree/main/src/sesi7">Next Session</a>)</td>
  </tr>
</table>
    




