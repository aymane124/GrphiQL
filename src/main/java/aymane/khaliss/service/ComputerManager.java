package aymane.khaliss.service;


import aymane.khaliss.dao.repository.ComputerRepository;
import aymane.khaliss.dao.entities.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Marks this class as a Spring Service Bean
public class ComputerManager implements ComputerService {

    @Autowired
    private ComputerRepository repository;

    // Method implementation: Retrieve computers by processor
    @Override
    public List<Computer> findByProce(String proce) {
        return repository.findByProce(proce);
    }

    // Method implementation: Save a new computer
    @Override
    public Computer save(Computer computer) {
        return repository.save(computer);
    }
}
