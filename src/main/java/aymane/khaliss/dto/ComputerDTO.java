package aymane.khaliss.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComputerDTO {
    private String proce;
    private String ram;
    private String price;
    private String hardDrive;

    // Getter and Setter for proce
    public String getProce() {
        return proce;
    }

    public void setProce(String proce) {
        this.proce = proce;
    }

    // Getter and Setter for ram
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    // Getter and Setter for price
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    // Getter and Setter for hardDrive
    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }
}

