package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setInfo("bursa","apple", "sdet", 20000,true,true,true,false );
        offer2.setInfo("istanbul","samsung", "qa", 60000,false,false,true,true );
        offer3.setInfo("ankara","amazon", "devops", 110000,true,true,true,false );
        offer4.setInfo("bursa","verizon", "ba", 90000,true,true,false,true );
        offer5.setInfo("bursa","turkcell", "sdet", 10000,false,false,true,false );
        offer6.setInfo("izmir","crea", "sdet", 130000,true,true,false,false );
        offer7.setInfo("kayseri","hitech", "qa", 40000,true,false,true,true );

        Offer [] offers = {offer1, offer2,offer3,offer4,offer5,offer6,offer7};

        ArrayList <Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(offers));
        fullTimeOffers.removeIf(p-> !p.isFullTime);
        System.out.println("fullTimeOffers = " + fullTimeOffers.size());

        ArrayList <Offer> localOffers = new ArrayList<>(Arrays.asList(offers));
        localOffers.removeIf(p-> !p.location.equalsIgnoreCase("bursa"));
        for (Offer localOffer : localOffers) {
            System.out.println(localOffer.companyName + " : " + localOffer.salary);
        }

        ArrayList <Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(offers));
        offersWithBenefits.removeIf(p-> !p.hasBenefit && !p.hasPTO);
        for (Offer offersWithBenefit : offersWithBenefits) {
            System.out.println("offersWithBenefit Locations= " + offersWithBenefit.location);
        }

        ArrayList <Offer> sdetOffers = new ArrayList<>(Arrays.asList(offers));
        sdetOffers.removeIf(p-> !p.jobTitle.equalsIgnoreCase("sdet"));
        System.out.println(sdetOffers);

        ArrayList <Offer> offersWith100K = new ArrayList<>(Arrays.asList(offers));
        offersWith100K.removeIf(p-> p.salary<100000);
        System.out.println(offersWith100K);

    }
}
/*
2. Create a class named MyOffers:

				2.1 Create 7 objects of Offer
				2.2 Create an array of Offers named myOffers and store all 7 objects of offers
				2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
						2.3.1 Write a program that can remove the offer objects that are not full-time
				2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
						2.4.1 Write a program that can remove all the offers that are not from local
				2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
						2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
				2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
						2.6.1 Write a program that can remove all the offers that are not for SDET
				2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
						2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
 */