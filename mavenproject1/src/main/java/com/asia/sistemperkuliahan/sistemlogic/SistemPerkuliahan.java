/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asia.sistemperkuliahan.sistemlogic;

/**
 *
 * @author A-19
 */
public class SistemPerkuliahan {
    private Perkuliahan[] dataPerkuliahans;
    private Dosen[] dataDosens;
    private Mahasiswa[] dataMahasisws;
    private Staf[] dataStafs;

    public SistemPerkuliahan() {
    }

    public SistemPerkuliahan(int maxPerkuliahan, int maxDosen, int maxMahasiswa, Staf[] dataStafs) {
        this.dataPerkuliahans = dataPerkuliahans;
        this.dataDosens = dataDosens;
        this.dataMahasisws = dataMahasisws;
        this.dataStafs = dataStafs;
    }
    
   
}
