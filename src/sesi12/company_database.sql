-- a.  Tampilkan dependent_name dan relationship dengan employee yang namanya diawali huruf R 

select td.dependent_name, td.relationship, te.first_name
from tb_dependent td
join tb_employee te on td.ssn = te.ssn

where te.first_name like 'r%'

-- b. Banyaknya employee yang mengerjakan project

SELECT COUNT(te.ssn) as pekerja_project_1 FROM tb_employee te 
JOIN tb_works_on tw ON te.ssn = tw.ssn WHERE
tw.proj_number = '001';

-- c. Banyaknya employee yang memiliki salary lebih dari 5.000.000 

SELECT COUNT(ssn) FROM tb_employee WHERE
salary > 5000000;

-- d. Banyaknya project yang dikerjakan oleh 1 department

SELECT COUNT(proj_number) as jumlah_project_dept1 FROM tb_project tp 
JOIN tb_department td ON td.dep_number = tp.dep_number WHERE
tp.dep_number = 00001;

SELECT td.dep_name as nama_department, AVG(te.salary) as rata_rata_gaji FROM tb_employee te 
JOIN tb_department td ON te.dep_number = td.dep_number
GROUP BY td.dep_number;

-- e. Hitung total dan rata-rata salary dari setiap departemen 

SELECT td.dep_name as nama_department, AVG(te.salary) as rata_rata_gaji,  SUM(te.salary) as total_gaji
FROM tb_employee te JOIN
tb_department td ON te.dep_number = td.dep_number
GROUP BY td.dep_number;

-- f. Banyaknya employee dari setiap department dan urutkan berdasarkan employee terbanyak 

SELECT td.dep_name as nama_department, COUNT(te.ssn) as banyak_karyawan
FROM tb_employee te 
JOIN tb_department td on te.dep_number = td.dep_number
GROUP BY td.dep_number;

-- g. Total hours perweek dari semua employee untuk setiap project 

SELECT tp.proj_name as nama_project, SUM(tw.work_hour) as hours_per_week FROM tb_works_on tw 
JOIN tb_project tp ON tp.proj_number = tw.proj_number
GROUP BY tw.proj_number;

-- h. Employee yang memiliki total hours perweek lebih besar dari 50 hours dan urutkan berdasarkan jumlah jam kerja terbanyak

SELECT te.first_name as nama_karyawan, SUM(tw.work_hour)*7 as total_waktu_kerja_perminggu FROM tb_employee te 
JOIN tb_works_on tw ON te.ssn = tw.ssn
GROUP BY tw.ssn
HAVING SUM(tw.work_hour)*7 > 50
ORDER BY SUM(tw.work_hour)*7 DESC;

-- i. Kelompokkan bonus employee berdasarkan jumlah jam kerjanya (Jika >= 60 hours, maka bonus = 50%; Jika >= 40 hours, maka bonus = 25%, Selainnya bonus = 10%) 

SELECT te.first_name as nama_karyawan, SUM(tw.work_hour)*7 as total_waktu_kerja,
CASE
WHEN SUM(tw.work_hour)*7 > 60 THEN 'Bonus 50%'
WHEN SUM(tw.work_hour)*7 > 40 THEN 'Bonus 25%'
ELSE 'Bonus 10%'
END AS 'Bonus'
FROM tb_employee te JOIN
tb_works_on tw ON te.ssn = tw.ssn
GROUP BY tw.ssn
ORDER BY SUM(tw.work_hour) DESC;

-- j. Banyaknya project yang dikerjakan tiap employee dan urutkan dari yang terbanyak

SELECT te.first_name as nama_karyawan, COUNT(tw.proj_number) as jumlah_project
FROM tb_employee te JOIN tb_works_on tw
ON te.ssn = tw.ssn
GROUP BY te.ssn
ORDER BY COUNT(tw.proj_number) DESC;

-- k. Employee yang bekerja pada lebih dari 4 project 
SELECT te.first_name as nama_karyawan, COUNT(tw.proj_number) as jumlah_project
FROM tb_employee te JOIN tb_works_on tw
ON te.ssn = tw.ssn
GROUP BY te.ssn
HAVING COUNT(tw.proj_number) >= 2
ORDER BY COUNT(tw.proj_number) DESC;

-- l. Employee yang memiliki rata-rata hours perweek = 70 jam dan bekerja pada 2 project 
SELECT te.first_name as nama_karyawan, COUNT(tw.proj_number) as jumlah_project
FROM tb_employee te JOIN tb_works_on tw
ON te.ssn = tw.ssn
GROUP BY te.ssn
ORDER BY COUNT(tw.proj_number) DESC;

-- m. Banyaknya Dependent berdasarkan relationship dengan employee 
SELECT td.relationship, COUNT(td.relationship) AS banyak_dependant
FROM tb_employee te JOIN tb_dependent td
ON te.ssn = td.ssn
GROUP BY td.relationship

-- n.  Berapa lama manager tiap department sudah menjabat
select DATEDIFF( curdate(), mgr_startdate) as lama_bekerja_hari
from tb_department

-- 0. Lokasi project yang menjadi tempat lebih dari satu department
SELECT Location FROM tb_branch_dept
GROUP BY dep_number




