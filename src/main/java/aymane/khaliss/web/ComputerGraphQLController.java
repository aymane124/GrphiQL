package aymane.khaliss.web;



import aymane.khaliss.dao.entities.Computer;
import aymane.khaliss.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ComputerGraphQLController {

    @Autowired
    private ComputerService service;

    @QueryMapping
    public List<Computer> getComputerByProce(@Argument String proce) {
        return service.findByProce(proce);
    }

    @MutationMapping
    public Computer saveComputer(@Argument Computer computer) {
        return service.save(computer);
    }
}

