package aymane.khaliss.service;


import aymane.khaliss.dao.repository.ComputerRepository;
import aymane.khaliss.dao.entities.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private ComputerRepository computerRepository;

    @Override
    public void run(String... args) throws Exception {
        // Clear existing data
        computerRepository.deleteAll();

        // Insert 4 Computers into the database
        Computer pc1 = new Computer();
        pc1.setProce("Intel i5");
        pc1.setRam("8GB");
        pc1.setHardDrive("512GB SSD");
        pc1.setPrice(1000.0);
        pc1.setMacAddress("00-14-22-01-23-45");

        Computer pc2 = new Computer();
        pc2.setProce("Intel i7");
        pc2.setRam("16GB");
        pc2.setHardDrive("1TB SSD");
        pc2.setPrice(1500.0);
        pc2.setMacAddress("00-14-22-01-23-46");

        Computer pc3 = new Computer();
        pc3.setProce("Intel i9");
        pc3.setRam("32GB");
        pc3.setHardDrive("2TB SSD");
        pc3.setPrice(2500.0);
        pc3.setMacAddress("00-14-22-01-23-47");

        Computer pc4 = new Computer();
        pc4.setProce("AMD Ryzen 7");
        pc4.setRam("16GB");
        pc4.setHardDrive("1TB SSD");
        pc4.setPrice(1800.0);
        pc4.setMacAddress("00-14-22-01-23-48");

        // Save computers to the database
        computerRepository.save(pc1);
        computerRepository.save(pc2);
        computerRepository.save(pc3);
        computerRepository.save(pc4);

        System.out.println("Inserted 4 computers into the database.");
    }
}

