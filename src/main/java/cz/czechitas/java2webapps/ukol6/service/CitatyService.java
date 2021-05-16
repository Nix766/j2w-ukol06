package cz.czechitas.java2webapps.ukol6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class CitatyService {

    private final NahodneCisloService service;
    private final CitatyRepository serviceDB;


    @Autowired
    public CitatyService(NahodneCisloService service, CitatyRepository serviceDB) {
        this.service = service;
        this.serviceDB = serviceDB;
    }

    public String nahodnyCitat() {
        return citat(service.dejNahodneCislo(serviceDB.pocet()));
    }

    public String konkretniCitat(int cislo) {
        return citat(cislo);
    }

    private String citat(int cislo) {
        return serviceDB.citat(cislo);
    }

}
