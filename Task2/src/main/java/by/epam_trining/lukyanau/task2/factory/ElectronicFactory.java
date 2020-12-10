package by.epam_trining.lukyanau.task2.factory;

import by.epam_trining.lukyanau.task2.entity.*;
import by.epam_trining.lukyanau.task2.exception.ProjectException;

public class ElectronicFactory {
    private static final ElectronicFactory instance = new ElectronicFactory();
    private static final int OVEN_PARAMETERS = 6;
    private static final int LAPTOP_PARAMETERS = 6;
    private static final int PHONE_PARAMETERS = 4;
    private static final int REFRIGERATOR_PARAMETERS = 6;
    private static final int TABLET_PC_PARAMETERS = 5;
    private static final int VACUUM_CLEANER_PARAMETERS = 4;

    private ElectronicFactory() {
    }

    public static ElectronicFactory getInstance() {
        return instance;
    }

    public ElectricDevice createDevice(ElectronicDeviceType electronicDeviceType, Object... parameters) throws ProjectException {
        ElectricDevice electricDevice;
        switch (electronicDeviceType) {
            case OVEN:
                if (parameters.length != OVEN_PARAMETERS) {
                    throw new ProjectException("Illegal number of parameters, while creating OVEN");
                }
                electricDevice = new Oven(parameters);
                break;
            case PHONE:
                if (parameters.length != PHONE_PARAMETERS) {
                    throw new ProjectException("Illegal number of parameters, while creating PHONE");
                }
                electricDevice = new Phone(parameters);
                break;
            case LAPTOP:
                if (parameters.length != LAPTOP_PARAMETERS) {
                    throw new ProjectException("Illegal number of parameters, while creating LAPTOP");
                }
                electricDevice = new Laptop(parameters);
                break;
            case TABLET_PC:
                if (parameters.length != TABLET_PC_PARAMETERS) {
                    throw new ProjectException("Illegal number of parameters, while creating TABLET_PC");
                }
                electricDevice = new TabletPC(parameters);
                break;
            case REFRIGERATOR:
                if (parameters.length != REFRIGERATOR_PARAMETERS) {
                    throw new ProjectException("Illegal number of parameters, while creating REFRIGERATOR");
                }
                electricDevice = new Refrigerator(parameters);
                break;
            case VACUUM_CLEANER:
                if (parameters.length != VACUUM_CLEANER_PARAMETERS) {
                    throw new ProjectException("Illegal number of parameters, while creating VACUUM_CLEANER");
                }
                electricDevice = new VacuumCleaner(parameters);
                break;
            default:
                throw new ProjectException("Illegal type of electronicDevice");
        }
        return electricDevice;
    }
}
