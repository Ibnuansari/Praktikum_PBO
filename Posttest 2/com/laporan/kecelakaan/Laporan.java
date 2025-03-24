package com.laporan.kecelakaan;

import java.util.ArrayList;

public class Laporan {
    private ArrayList<Kecelakaan> laporanList = new ArrayList<>();
    
    public void tambahLaporan(Kecelakaan kecelakaan) {
        laporanList.add(kecelakaan);
    }
    
    public void tampilkanSemuaLaporan() {
        for (Kecelakaan laporan : laporanList) {
            laporan.tampilkanLaporan();
        }
    }
}

