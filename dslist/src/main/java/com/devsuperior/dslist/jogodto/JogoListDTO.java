package com.devsuperior.dslist.jogodto;
import com.devsuperior.dslist.entities.JogoList;
public class JogoListDTO {
    
    private Long id;
    private String name;

    public JogoListDTO() {
    }

    public JogoListDTO(JogoList entities) {
        id = entities.getId();
        name = entities.getName();
    }

    public Long getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }
 
}
