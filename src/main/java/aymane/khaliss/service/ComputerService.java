package aymane.khaliss.service;


import aymane.khaliss.dao.entities.Computer;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ComputerService {
    List<Computer> findByProce(String proce);
    Computer save(Computer computer);
}
