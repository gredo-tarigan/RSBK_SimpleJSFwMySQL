/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulir;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "form")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Form.findAll", query = "SELECT f FROM Form f")
    , @NamedQuery(name = "Form.findById", query = "SELECT f FROM Form f WHERE f.id = :id")
    , @NamedQuery(name = "Form.findByNamaLengkap", query = "SELECT f FROM Form f WHERE f.namaLengkap = :namaLengkap")
    , @NamedQuery(name = "Form.findByJenisKelamin", query = "SELECT f FROM Form f WHERE f.jenisKelamin = :jenisKelamin")
    , @NamedQuery(name = "Form.findByNamaSekolah", query = "SELECT f FROM Form f WHERE f.namaSekolah = :namaSekolah")
    , @NamedQuery(name = "Form.findByTelp", query = "SELECT f FROM Form f WHERE f.telp = :telp")
    , @NamedQuery(name = "Form.findBySurvei1", query = "SELECT f FROM Form f WHERE f.survei1 = :survei1")
    , @NamedQuery(name = "Form.findBySurvei2", query = "SELECT f FROM Form f WHERE f.survei2 = :survei2")
    , @NamedQuery(name = "Form.findBySurvei3", query = "SELECT f FROM Form f WHERE f.survei3 = :survei3")})
public class Form implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 20)
    @Column(name = "nama_lengkap")
    private String namaLengkap;
    @Size(max = 20)
    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
    @Size(max = 20)
    @Column(name = "nama_sekolah")
    private String namaSekolah;
    @Size(max = 20)
    @Column(name = "telp")
    private String telp;
    @Size(max = 50)
    @Column(name = "survei1")
    private String survei1;
    @Size(max = 50)
    @Column(name = "survei2")
    private String survei2;
    @Size(max = 50)
    @Column(name = "survei3")
    private String survei3;

    public Form() {
    }

    public Form(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNamaSekolah() {
        return namaSekolah;
    }

    public void setNamaSekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getSurvei1() {
        return survei1;
    }

    public void setSurvei1(String survei1) {
        this.survei1 = survei1;
    }

    public String getSurvei2() {
        return survei2;
    }

    public void setSurvei2(String survei2) {
        this.survei2 = survei2;
    }

    public String getSurvei3() {
        return survei3;
    }

    public void setSurvei3(String survei3) {
        this.survei3 = survei3;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Form)) {
            return false;
        }
        Form other = (Form) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "formulir.Form[ id=" + id + " ]";
    }
    
}
