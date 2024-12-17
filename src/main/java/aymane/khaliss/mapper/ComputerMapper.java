package aymane.khaliss.mapper;


import aymane.khaliss.dto.ComputerDTO;
import aymane.khaliss.dao.entities.Computer;

public class ComputerMapper {

    public static Computer toEntity(ComputerDTO dto) {
        Computer computer = new Computer();
        computer.setProce(dto.getProce());
        computer.setRam(dto.getRam());
        computer.setHardDrive(dto.getHardDrive());
        computer.setPrice(Double.parseDouble(dto.getPrice()));
        return computer;
    }

    public static ComputerDTO toDTO(Computer computer) {
        ComputerDTO dto = new ComputerDTO();
        dto.setProce(computer.getProce());
        dto.setRam(computer.getRam());
        dto.setHardDrive(computer.getHardDrive());
        dto.setPrice(String.valueOf(computer.getPrice()));
        return dto;
    }
}

