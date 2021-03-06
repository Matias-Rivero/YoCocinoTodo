package ar.edu.unlam.cocinaviva.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Ingrediente implements Cloneable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Ingrediente")
	private Long id;
	private String nombre;
	@Transient
	private List<Ingrediente> listaIngredientes;
	@Transient
	private Integer[] seleccionados;
	private Integer faltante;
	private Integer cantidad;
	private Integer gastouser;
	private String cantidadstring;
	private String unidad;
	private String tipo;
	private String perece;
	private String fcompra;
	private String fvencimiento;
	private Long dias;
	private String uso;
	private String estado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getPerece() {
		return perece;
	}

	public void setPerece(String perece) {
		this.perece = perece;
	}
	
	public String getFcompra() {
		return fcompra;
	}

	public void setFcompra(String fcompra) {
		this.fcompra = fcompra;
	}

	public String getFvencimiento() {
		return fvencimiento;
	}

	public void setFvencimiento(String fvencimiento) {
		this.fvencimiento = fvencimiento;
	}

	public Long getDias() {
		return dias;
	}

	public void setDias(Long dias) {
		this.dias = dias;
	}
	
	public List<Ingrediente> getlistaIngredientes() {
		return listaIngredientes;
	}

	public void setlistaIngredientes(List<Ingrediente> listaIngredientes) {
		this.listaIngredientes = listaIngredientes;
	}

	public Integer[] getSeleccionados() {
		return seleccionados;
	}

	public void setSeleccionados(Integer[] seleccionados) {
		this.seleccionados = seleccionados;
	}
	
	public Integer getFaltante() {
		return faltante;
	}

	public void setFaltante(Integer faltante) {
		this.faltante = faltante;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public boolean equals (Ingrediente i){
		 
        if(i.getNombre().equals(nombre)){
            return true;
        }else{
            return false;
        }
    }

	public Ingrediente clone() throws CloneNotSupportedException{
		Ingrediente cloningrediente = (Ingrediente) super.clone();
        return cloningrediente;
   }

	public String getCantidadstring() {
		return cantidadstring;
	}

	public void setCantidadstring(String cantidadstring) {
		this.cantidadstring = cantidadstring;
	}

	public Integer getGastouser() {
		return gastouser;
	}

	public void setGastouser(Integer gastouser) {
		this.gastouser = gastouser;
	}



}
