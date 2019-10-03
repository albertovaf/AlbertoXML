package model;

public class model {
	 private String cliente;
	 private String id;
	 private String nom;
	 private String tel;
	 private String com;
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
	}
	@Override
	public String toString() {
		return "model [cliente=" + cliente + ", id=" + id + ", nom=" + nom + ", tel=" + tel + ", com=" + com + "]";
	}

	    
	    
	}

