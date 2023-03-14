package examen_20230314.model;

public class Materia {
	private int id;
	private String centro;
	private String nivel;
	private int materia;
	private String nombre;
	private String acronimo;
	
	
	/**
	 * 
	 */
	public Materia() {
		super();
	}

	/**
	 * @param id
	 * @param nombre
	 * @param acronimo
	 * @param idCurso
	 */
	public Materia(int id, String nombre, String acronimo, int idCurso) {
		super();
		this.id = id;
		this.centro = centro;
		this.nivel = nivel;
		this.materia = materia;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCentro() {
		return centro;
	}
	public void setCentro(String centro) {
		this.centro = centro;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public int getMateria() {
		return materia;
	}
	public void setMateria(int Materia) {
		this.materia = materia;
	}
	@Override
	public String toString() {
		return "Materia [id=" + id + ", centro=" +  centro + ", nivel=" + nivel + ", materia=" + materia + "]";
	}
	
	
}
