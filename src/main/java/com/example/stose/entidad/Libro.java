package com.example.stose.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;

@Entity
@Table(name = "tb_libro")
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;
	
	@Column(name = "titulo",nullable = false,length = 50)
	private String titulo;
	
	@Column(name = "autor",nullable = false,length = 50)
	private String autor;
	
	@Column(name = "id_editorial",nullable = false,length = 50)
	private String id_editorial;

    @Column(name = "id_categoria",nullable = false,length = 50)
	private String id_categoria;
    
    @Column(name = "id_subcategoria",nullable = false,length = 50)
	private String id_subcategoria;

    @Column(name = "precio",nullable = false,length = 50)
	private String precio;

    @Column(name = "numero_pagina",nullable = false,length = 50)
	private String numero_pagina;

    @Column(name = "year_publicacion",nullable = false,length = 50)
	private String year_publicacion;

    @Column(name = "disponible",nullable = false,length = 50)
	private String disponible;
	
	public Libro() {
		
	}

    public Libro(Long id, String titulo, String autor, String id_editorial, String id_categoria, String id_subcategoria,
            String precio, String numero_pagina, String year_publicacion, String disponible) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.id_editorial = id_editorial;
        this.id_categoria = id_categoria;
        this.id_subcategoria = id_subcategoria;
        this.precio = precio;
        this.numero_pagina = numero_pagina;
        this.year_publicacion = year_publicacion;
        this.disponible = disponible;
    }

    public Libro(String titulo, String autor, String id_editorial, String id_categoria, String id_subcategoria,
            String precio, String numero_pagina, String year_publicacion, String disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.id_editorial = id_editorial;
        this.id_categoria = id_categoria;
        this.id_subcategoria = id_subcategoria;
        this.precio = precio;
        this.numero_pagina = numero_pagina;
        this.year_publicacion = year_publicacion;
        this.disponible = disponible;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getId_editorial() {
        return this.id_editorial;
    }

    public void setId_editorial(String id_editorial) {
        this.id_editorial = id_editorial;
    }

    public String getId_categoria() {
        return this.id_categoria;
    }

    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getId_subcategoria() {
        return id_subcategoria;
    }

    public void setId_subcategoria(String id_subcategoria) {
        this.id_subcategoria = id_subcategoria;
    }

    public String getPrecio() {
        return this.precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getNumero_pagina() {
        return this.numero_pagina;
    }

    public void setNumero_pagina(String numero_pagina) {
        this.numero_pagina = numero_pagina;
    }

    public String getYear_publicacion() {
        return this.year_publicacion;
    }

    public void setYear_publicacion(String year_publicacion) {
        this.year_publicacion = year_publicacion;
    }

    public String getDisponible() {
        return this.disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Libro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", id_editorial=" + id_editorial
                + ", id_categoria=" + id_categoria + ", id_subcategoria=" + id_subcategoria + ", precio=" + precio
                + ", numero_pagina=" + numero_pagina + ", year_publicacion=" + year_publicacion + ", disponible="
                + disponible + "]";
    }
	
	
}