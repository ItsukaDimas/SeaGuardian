package com.if22dx.seaguardian

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class HewanLautFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_hewan_laut, container, false)

        // Find the TextView and set the text
        val textViewInfo = view.findViewById<TextView>(R.id.InfoHewanLaut)
        textViewInfo.text = """
        Membedakan Hewan Laut Sehat dan Tidak Sehat

        1. Penampilan Visual
            Hewan Sehat:
            Ikan: Warna cerah, cerah, mata jernih, sisik halus dan utuh, serta gerakan aktif.
            Invertebrata (misalnya kepiting, gurita): Tubuh kokoh, anggota badan utuh, dan cangkang halus.
            Hewan Tidak Sehat:
            Ikan: Warna pucat atau pudar, mata keruh, luka atau bisul terlihat, sirip berjumbai, dan gerakan lamban.
            Invertebrata: Anggota tubuh hilang, cangkang lunak atau rusak, gerakan lamban atau minimal.

        2. Perilaku
            Hewan Sehat:
            Ikan : Pola berenang normal, tanggap terhadap rangsangan, perilaku bersekolah.
            Invertebrata: Pergerakan teratur, perilaku makan, dan respons defensif saat terancam.
            Hewan Tidak Sehat:
            Ikan: Berenang tidak menentu, terengah-engah di permukaan, terisolasi dari sekolah.
            Invertebrata: Gerakan berkurang atau tidak ada, kurangnya perilaku makan.

        3. Pola Pernafasan
            Hewan Sehat:
            Ikan: Pergerakan insang halus dan teratur.
            Invertebrata: Pergerakan normal struktur pernapasan (misalnya insang pada kepiting).
            Hewan Tidak Sehat:
            Ikan: Gerakan insang cepat atau tidak teratur, pernapasan mulut terbuka.
            Invertebrata: Pergerakan struktur pernafasan yang minimal atau tidak normal.

        4. Tanda Fisik
            Hewan Sehat:
            Ikan: Tidak terlihat adanya parasit, kulit dan sisiknya bersih dan utuh.
            Invertebrata: Tidak ada parasit atau pertumbuhan yang terlihat, cangkang bersih dan halus.
            Hewan Tidak Sehat:
            Ikan: Adanya parasit eksternal (misalnya bintik putih, cacing jangkar), luka atau lesi.
            Invertebrata: Pertumbuhan atau perubahan warna pada cangkang, parasit yang terlihat.

        5. Reproduksi
            Hewan Sehat:
            Pola perkembangbiakan yang teratur, adanya telur atau anakan.
            Hewan Tidak Sehat:
            Perkembangbiakan yang tidak teratur atau tidak ada, keturunan yang cacat atau tidak dapat hidup.

        Melestarikan Satwa Laut

        1. Pengendalian Polusi
            Mengurangi Limbah: Pembuangan limbah dengan benar, mendaur ulang, dan meminimalkan penggunaan plastik.
            Peraturan Industri: Menegakkan peraturan mengenai pembuangan limbah industri untuk mencegah pembuangan racun ke laut.
            Praktik Pertanian: Mempromosikan pertanian berkelanjutan untuk mengurangi limpasan pestisida dan pupuk.

        2. Konservasi Habitat
            Kawasan yang Dilindungi: Menetapkan dan memelihara kawasan perlindungan laut (MPA) untuk melestarikan habitat kritis.
            Mangrove dan Lamun: Melindungi dan memulihkan hutan bakau dan padang lamun untuk menyediakan habitat dan tempat berkembang biak.

        3. Praktik Penangkapan Ikan Berkelanjutan
            Kuota Penangkapan Ikan: Menerapkan dan menegakkan kuota untuk mencegah penangkapan ikan berlebihan.
            Alat Penangkapan Ikan Selektif: Gunakan alat yang meminimalkan tangkapan sampingan dan kerusakan habitat.
            Zona Larang Tangkap: Tetapkan zona larang tangkap di mana penangkapan ikan dilarang sepenuhnya agar ekosistem dapat pulih.

        4. Pendidikan dan Kesadaran
            Kampanye Publik: Mendidik masyarakat tentang pentingnya konservasi laut dan perilaku bertanggung jawab.
            Keterlibatan Komunitas: Melibatkan komunitas lokal dalam upaya konservasi dan mempromosikan pariwisata ramah lingkungan.
            Program Sekolah: Melaksanakan program pendidikan kelautan di sekolah untuk meningkatkan kesadaran sejak usia muda.

        5. Penelitian dan Pemantauan
            Pemantauan Reguler: Melakukan pemantauan berkala terhadap ekosistem laut untuk menilai kesehatan dan mengidentifikasi ancaman.
            Penelitian: Mendukung penelitian ilmiah mengenai ekosistem laut dan dampak aktivitas manusia.
            Ilmu Pengetahuan Warga: Mendorong proyek ilmu pengetahuan warga dimana masyarakat dapat membantu mengumpulkan data tentang kehidupan laut.

        6. Solusi Teknologi
            Pengolahan Air: Gunakan teknologi pengolahan air canggih untuk mengolah air limbah sebelum dibuang.
            Pembersihan Inovatif: Mengembangkan dan menerapkan teknologi seperti drone pembersih laut dan penghalang untuk mengumpulkan dan membuang sampah laut.

        7. Kerja Sama Internasional
            Perjanjian Global: Berpartisipasi dalam dan menegakkan perjanjian internasional mengenai konservasi laut.
            Inisiatif Lintas Batas: Berkolaborasi dalam inisiatif lintas batas untuk melindungi spesies yang bermigrasi dan habitat laut bersama.
    """.trimIndent()

        return view
    }
}