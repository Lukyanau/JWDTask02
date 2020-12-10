package by.epam_trining.lukyanau.task2.runner;

import by.epam_trining.lukyanau.task2.entity.ElectricDevice;
import by.epam_trining.lukyanau.task2.exception.ProjectException;
import by.epam_trining.lukyanau.task2.factory.ElectronicFactory;

import static by.epam_trining.lukyanau.task2.entity.ElectronicDeviceType.*;
import static by.epam_trining.lukyanau.task2.entity.Laptop.TypeOS.*;
import static by.epam_trining.lukyanau.task2.entity.Phone.ColorType.*;
import static by.epam_trining.lukyanau.task2.entity.TabletPC.*;
import static by.epam_trining.lukyanau.task2.entity.VacuumCleaner.TypeFilter.*;

public class ElectronicFactoryRunner {
    public static void main(String[] args) throws ProjectException {
        ElectronicFactory electronicFactory = ElectronicFactory.getInstance();
        ElectricDevice electricDevice = electronicFactory.createDevice(OVEN, 2000, 11, 33, 60, 40, 70);
        ElectricDevice electricDevice1 = electronicFactory.createDevice(LAPTOP, 1.5, WINDOWS, 4000, 8000, 1.5, 20);
        electricDevice.start();
        electricDevice1.start();
    }
}
