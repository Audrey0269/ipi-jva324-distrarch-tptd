package com.ipi.jva324.commande.service;

import com.ipi.jva324.stock.model.ProduitEnStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CommandeProduitServiceRESTHALImpl implements CommandeProduitService {

    @Autowired @Qualifier("springDataRestTemplate")
    private RestTemplate restTemplate;

    //@Value("${secuapiserver.url:http://localhost:8080/}")
    //private String url;

    @Override
    public ProduitEnStock getProduit(long id) {
        return restTemplate.getForObject("http://localhost:8080/api/data-rest/produitEnStocks/" + id, ProduitEnStock.class);
    }


}
