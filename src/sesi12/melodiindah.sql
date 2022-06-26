
/* show by id musisi*/
select tm.nm_musisi, tm.alamat, ti.nm_instrumen, ti.kunci_musik
from tb_gabung_musik tc
join tb_musisi tm on tc.id_musisi = tm.id_musisi
join tb_instrumen ti on ti.id_instrumen = tc.id_instrumen
where tm.id_musisi=1

-- nampilin dari 3 tabel
select tl.id_lagu, tl.judul, tl.pengarang, tm.nm_musisi, ti.nm_instrumen, ti.kunci_musik
from tb_lagu tl
join tb_album ta on tl.id_album=ta.id_album
join tb_gabung_musik tgm on ta.id_album=tgm.id_gabung_musik
join tb_musisi tm on tgm.id_musisi=tm.id_musisi
join tb_instrumen ti on tgm.id_instrumen=ti.id_instrumen
where tm.nm_musisi = "Tulus"



/* menampilkan instrumen dengan bbrp musisi */
select tc.id_combine_musik, ti.nama_instrumen, ti.kunci_musik, tm.nama_musisi, tm.alamat
from tb_combine_musik tc
join tb_musisi tm on tc.id_musisi = tm.id_musisi
join tb_instrumen ti on ti.id_instrumen = tc.id_instrumen
where tm.id_musisi=1 and ti.nama_instrumen='Gitar Elektrik'
where ti.nama_instrumen='Gitar Elektrik'

