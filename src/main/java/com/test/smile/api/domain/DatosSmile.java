package com.test.smile.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// BD
// https://www.javaguides.net/2019/01/springboot-postgresql-jpa-hibernate-crud-restful-api-tutorial.html


//REST HEADERS
//https://o7planning.org/en/11647/spring-boot-restful-client-with-resttemplate-example
//https://howtodoinjava.com/spring-boot2/testing/testresttemplate-post-example/


//API PHOTO
//https://unsplash.com/developers

@Entity
@Table(name = "datos_smile")
public class DatosSmile {
	
	private Long id_dato;
	private String urlimagen;
	private String frase;
	
	
	
	public DatosSmile() {
		
	}
	
	public DatosSmile(Long id_dato, String frase, String urlimagen) {
        this.id_dato = id_dato;
        this.frase = frase;
        this.urlimagen = urlimagen;
   }

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId_dato() {
		return id_dato;
	}

	public void setId_dato(Long id_dato) {
		this.id_dato = id_dato;
	}

	@Column(name = "url_foto", nullable = false)
	public String getUrlimagen() {
		return urlimagen;
	}

	public void setUrlimagen(String urlimagen) {
		this.urlimagen = urlimagen;
	}
	
	@Column(name = "ds_frase", nullable = false)
	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

}
