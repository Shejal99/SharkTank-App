package service;

import model.Offer;
import repositories.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfferService {

    @Autowired
    private OfferRepository offerRepo;


    public Offer saveOffer(Offer offer) {
        return offerRepo.save(offer);
    }

}