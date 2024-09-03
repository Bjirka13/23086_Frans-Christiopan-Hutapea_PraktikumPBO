public class Nilai{
    double nilaiAbsen;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;

    double nilaiAkhir;

        public void hitungNilai(){
            nilaiAkhir = (nilaiAbsen * 0.1) + (nilaiTugas * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
        }

        void cetakNilai(){
            System.out.println("Nilai Absen[10%]: " + nilaiAbsen * 0.1);
            System.out.println("Nilai Tugas[20%]: " + nilaiTugas * 0.2);
            System.out.println("Nilai UTS[30%]: " + nilaiUTS * 0.3);
            System.out.println("Nilai UAS[40%]: " + nilaiUAS * 0.4);
            System.out.println("Nilai Akhir: " + nilaiAkhir);
        }

    }

