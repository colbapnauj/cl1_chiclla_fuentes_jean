package domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Table(name = "tbl_empleados")
@Entity(name = "empleados")
@NamedQueries({
    @NamedQuery(name = "listaEmpleados", query = "from empleados"),
    @NamedQuery(name = "listaEmpleadosPorId", query = "from empleados")
})
public class Empleado {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "ape_pat", length = 100, nullable = false)
  private String apellidoPaterno;

  @Column(name = "ape_materno", length = 100, nullable = false)
  private String apellidoMaterno;

  @Column(name = "nombres", length = 50, nullable = false)
  private String nombres;

  @Column(name = "nro_hijos")
  private Integer nroHijos;

  @Column(name = "sueldo")
  private Double sueldo;

  @Column(name = "fecha_nacimiento")
  private LocalDate fechaNacimiento;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }

  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public Integer getNroHijos() {
    return nroHijos;
  }

  public void setNroHijos(Integer nroHijos) {
    this.nroHijos = nroHijos;
  }

  public Double getSueldo() {
    return sueldo;
  }

  public void setSueldo(Double sueldo) {
    this.sueldo = sueldo;
  }

  public LocalDate getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  @Override
  public String toString() {
    return "Empleado [id=" + id + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno
        + ", nombres=" + nombres + ", nroHijos=" + nroHijos + ", sueldo=" + sueldo + ", fechaNacimiento="
        + fechaNacimiento + "]";
  }

  public Empleado(Long id, String apellidoPaterno, String apellidoMaterno, String nombres, Integer nroHijos,
      Double sueldo, LocalDate fechaNacimiento) {
    this.id = id;
    this.apellidoPaterno = apellidoPaterno;
    this.apellidoMaterno = apellidoMaterno;
    this.nombres = nombres;
    this.nroHijos = nroHijos;
    this.sueldo = sueldo;
    this.fechaNacimiento = fechaNacimiento;
  }

  public Empleado(String apellidoPaterno, String apellidoMaterno, String nombres, Integer nroHijos, Double sueldo,
      LocalDate fechaNacimiento) {
    this.apellidoPaterno = apellidoPaterno;
    this.apellidoMaterno = apellidoMaterno;
    this.nombres = nombres;
    this.nroHijos = nroHijos;
    this.sueldo = sueldo;
    this.fechaNacimiento = fechaNacimiento;
  }

  public Empleado(String apellidoPaterno, String apellidoMaterno, String nombres) {
    this.apellidoPaterno = apellidoPaterno;
    this.apellidoMaterno = apellidoMaterno;
    this.nombres = nombres;
  }

  public Empleado() {
  }

}
