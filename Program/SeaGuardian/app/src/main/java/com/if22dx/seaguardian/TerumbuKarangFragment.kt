package com.if22dx.seaguardian

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class TerumbuKarangFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_terumbu_karang, container, false)

        // Find the TextView and set the text
        val textViewInfo = view.findViewById<TextView>(R.id.InfoTerumbuKarang)
        textViewInfo.text = """
        Membedakan Karang Sehat dan Tidak Sehat

        1. Penampilan Visual
            Karang Sehat:
            Warna: Warna-warna cerah dan cerah, menunjukkan adanya simbiosis alga (zooxanthellae).
            Struktur: Struktur kokoh dan kaku tanpa tanda-tanda disintegrasi.
            Ekstensi Polip: Polip sering kali meluas, terutama pada waktu makan.
            Karang yang Tidak Sehat:
            Warna: Pucat atau putih (pemutihan), menunjukkan hilangnya zooxanthellae.
            Struktur: Struktur lunak, hancur, atau terkikis.
            Retraksi Polip: Polip tertarik atau tidak ada, menandakan stres atau penyakit.

        2. Adanya Penyakit atau Parasit
            Karang Sehat:
            Permukaan: Permukaan halus dan bersih tanpa lesi atau pertumbuhan.
            Karang yang Tidak Sehat:
            Permukaan: Adanya penyakit pita hitam, penyakit pita putih, atau infeksi dan parasit lain yang terlihat seperti siput atau cacing.

        3. Pertumbuhan dan Reproduksi
            Karang Sehat:
            Pertumbuhan: Tingkat pertumbuhan yang stabil dengan bukti nyata adanya pertumbuhan baru.
            Reproduksi: Peristiwa pemijahan secara teratur dan kehadiran karang baru.
            Karang yang Tidak Sehat:
            Pertumbuhan: Pertumbuhan terhambat atau tidak ada pertumbuhan yang terlihat.
            Reproduksi: Pemijahan tidak teratur atau tidak ada, kurangnya anggota baru.

        4. Respon terhadap Stresor
            Karang Sehat:
            Ketahanan: Kemampuan untuk pulih dengan cepat dari stres sementara (misalnya perubahan kecil pada suhu atau cahaya).
            Karang yang Tidak Sehat:
            Kerentanan: Pemulihan yang lambat atau tidak ada sama sekali dari stres, pemutihan yang berkepanjangan, dan peningkatan angka kematian.

        Melestarikan Terumbu Karang

        1. Pengendalian Polusi
            Mengurangi Limpasan: Menerapkan langkah-langkah untuk mengurangi limpasan pertanian dan perkotaan yang membawa nutrisi dan polutan ke laut.
            Pengelolaan Limbah: Pastikan pembuangan limbah benar dan kurangi polusi plastik.
            Minimalkan Penggunaan Bahan Kimia: Gunakan bahan kimia yang ramah lingkungan dan dapat terurai secara hayati di bidang pertanian dan industri.

        2. Mitigasi Perubahan Iklim
            Mengurangi Jejak Karbon: Menerapkan praktik-praktik untuk mengurangi emisi gas rumah kaca di tingkat lokal, nasional, dan global.
            Mendukung Energi Terbarukan: Mempromosikan penggunaan sumber energi terbarukan untuk mengurangi ketergantungan pada bahan bakar fosil.
            Advokasi dan Kebijakan: Mendukung kebijakan yang bertujuan memerangi perubahan iklim dan melindungi lingkungan laut.

        3. Pariwisata Berkelanjutan
            Praktik Ramah Lingkungan: Mendorong wisatawan untuk mengikuti praktik ramah lingkungan, seperti tidak menyentuh atau berdiri di atas karang.
            Kawasan Konservasi Perairan (KKL): Menetapkan dan menegakkan KKL dimana aktivitas manusia diatur untuk melindungi ekosistem karang.
            Penyelaman dan Snorkeling yang Bertanggung Jawab: Mendidik penyelam dan perenang snorkel tentang perilaku yang benar di sekitar terumbu karang untuk meminimalkan kerusakan.

        4. Proyek Restorasi Terumbu Karang
            Berkebun Karang: Budidaya dan transplantasi karang yang sehat ke area yang rusak untuk mendorong pemulihan terumbu.
            Terumbu Karang Buatan: Membangun terumbu buatan untuk menyediakan habitat baru bagi kehidupan laut dan mendorong pertumbuhan karang.
            Program Pemuliaan Karang: Mengembangkan program pemuliaan untuk meningkatkan keanekaragaman genetik dan ketahanan populasi karang.

        5. Pendidikan dan Kesadaran
            Kampanye Publik: Meningkatkan kesadaran mengenai pentingnya terumbu karang dan ancaman yang dihadapinya.
            Keterlibatan Masyarakat: Melibatkan masyarakat lokal dalam upaya konservasi dan restorasi terumbu karang.
            Program Sekolah: Melaksanakan program pendidikan untuk mengajarkan anak-anak tentang terumbu karang dan konservasi laut.

        6. Penelitian dan Pemantauan
            Pemantauan Reguler: Melakukan pemantauan kesehatan karang secara berkala untuk mendeteksi tanda-tanda awal stres atau penyakit.
            Penelitian Ilmiah: Mendukung penelitian tentang biologi karang, ketahanan, dan teknik restorasi.
            Ilmu Pengetahuan Warga: Mendorong inisiatif ilmu pengetahuan warga dimana masyarakat dapat berpartisipasi dalam pemantauan karang dan pengumpulan data.

        7. Kerja Sama Internasional
            Perjanjian Global: Berpartisipasi dalam perjanjian dan konvensi internasional yang bertujuan melindungi terumbu karang.
            Kolaborasi Lintas Batas: Bekerja sama dengan negara-negara tetangga untuk melindungi ekosistem terumbu karang bersama dan spesies yang bermigrasi.
    """.trimIndent()

        return view
    }
}