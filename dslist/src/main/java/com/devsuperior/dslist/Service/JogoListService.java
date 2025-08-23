package com.devsuperior.dslist.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.devsuperior.dslist.entities.JogoList;
import com.devsuperior.dslist.jogodto.JogoListDTO;
import com.devsuperior.dslist.repository.JogoListRepository;
 
@Service
public class JogoListService {
     @Autowired
    private JogoListRepository jogolistrepository;
 

    @Transactional(readOnly = true)
    public List<JogoListDTO> findAll() {
      List<JogoList> result =  jogolistrepository.findAll();
      return result.stream().map(x -> new JogoListDTO(x)).toList();
       
       
    }
}
