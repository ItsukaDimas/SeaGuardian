package com.if22dx.seaguardian

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class AirLautFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_air_laut, container, false)

        // Find the TextView and set the text
        val textViewInfo = view.findViewById<TextView>(R.id.InfoAirLaut)
        textViewInfo.text = """
        Membedakan Air Laut Bersih dan Kotor :

        1. Inspeksi Visual:
        - Air Laut Bersih: Umumnya jernih, dengan rona biru atau hijau alami, dan visibilitas baik.
        - Air Laut Kotor: Berawan, keruh, dengan perubahan warna seperti semburat coklat, kuning, atau hijau, dan berkurangnya jarak pandang. Puing-puing yang mengambang, rumput laut, atau pertumbuhan alga mungkin ada.

        2. Bau:
        - Air Laut Bersih: Memiliki bau laut yang segar dan asin.
        - Air Laut Kotor: Dapat mengeluarkan bau busuk, menandakan adanya polutan atau bahan organik yang membusuk.

        3. Indikator Kimia:
        - Air Laut Bersih: Rendahnya tingkat bahan kimia dan polutan berbahaya.
        - Air Laut Kotor: Peningkatan kadar kontaminan seperti minyak, logam berat, pestisida, dan bahan kimia industri. Hal ini dapat dideteksi melalui alat pengujian kualitas air atau analisis laboratorium.

        4. Indikator Biologis:
        - Air Laut Bersih: Menyehatkan biota laut, termasuk ikan, karang, dan tumbuhan laut.
        - Air Laut Kotor: Berkurangnya atau tidak adanya kehidupan laut, adanya pertumbuhan alga berbahaya (red tide), atau matinya ikan dan makhluk laut lainnya.

        5. Indikator Fisik:
        - Air Laut Bersih: Minimal atau tidak ada sampah atau sampah buatan manusia.
        - Air Laut Kotor: Terlihat sampah, plastik, dan puing-puing lainnya mengambang atau terdampar di tepi pantai.

        Menjaga Kebersihan Air Laut:

        1. Mengurangi Polusi pada Sumbernya:
        - Pengelolaan Sampah: Pembuangan dan daur ulang sampah yang benar, terutama plastik.
        - Peraturan Industri: Menegakkan peraturan ketat pada industri untuk mencegah pembuangan limbah berbahaya ke laut.
        - Praktik Pertanian: Mempromosikan praktik pertanian berkelanjutan untuk mengurangi limpasan pestisida dan pupuk.

        2. Inisiatif Pembersihan:
        - Pembersihan Pantai: Menyelenggarakan kegiatan pembersihan pantai secara teratur untuk menghilangkan sampah dan kotoran.
        - Proyek Pembersihan Laut: Mendukung dan berpartisipasi dalam inisiatif untuk membersihkan lautan dan lautan, seperti menghilangkan puing-puing yang mengapung dan jaring hantu.

        3. Pendidikan dan Kesadaran:
        - Kampanye Kesadaran Masyarakat: Mendidik masyarakat tentang dampak pencemaran terhadap ekosistem laut dan mendorong perilaku yang bertanggung jawab.
        - Keterlibatan Komunitas: Melibatkan komunitas lokal dalam upaya konservasi dan mempromosikan pariwisata ramah lingkungan.

        4. Peraturan dan Kebijakan:
        - Perundang-undangan: Menerapkan dan menegakkan hukum yang bertujuan melindungi lingkungan laut.
        - Kawasan Konservasi: Menetapkan kawasan perlindungan laut (MPA) untuk melestarikan habitat dan ekosistem penting.

        5. Solusi Teknologi:
        - Instalasi Pengolahan Air: Menggunakan teknologi pengolahan air canggih untuk mengolah air limbah sebelum dibuang ke laut.
        - Teknologi Pembersihan Inovatif: Mengembangkan dan menerapkan teknologi seperti drone pembersih laut dan penghalang untuk mengumpulkan dan membuang sampah laut.

        6. Praktik Berkelanjutan:
        - Penangkapan Ikan Berkelanjutan: Mendorong praktik penangkapan ikan berkelanjutan untuk mencegah penangkapan ikan berlebihan dan menjaga kesehatan populasi laut.
        - Produk Ramah Lingkungan: Mempromosikan penggunaan produk yang dapat terbiodegradasi dan ramah lingkungan untuk mengurangi polusi.
    """.trimIndent()

        return view
    }
}