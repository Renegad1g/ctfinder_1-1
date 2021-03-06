package org.tyaa.ctfinder.controller;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.util.List;

import org.tyaa.ctfinder.entity.Language;
import org.tyaa.ctfinder.entity.Offer_type;
import org.tyaa.ctfinder.entity.Static_title;
import org.tyaa.ctfinder.entity.User_type;

public class Offer_typeDAO {
	
	public static void getOffer_type(String _id, Offer_type _offer_type) {
		
		Offer_type offer_type =
				ofy().load().type(Offer_type.class).id(Long.valueOf(_id)).now();
		
		if(offer_type != null) {
			
			_offer_type.setId(offer_type.getId());
			_offer_type.setDescription_key(offer_type.getDescription_key());
		}
	}
	
	public static void getOffer_type(Long _id, Offer_type _offer_type) {
		
		Offer_type offer_type =
				ofy().load().type(Offer_type.class).id(_id).now();
		
		if(offer_type != null) {
			
			_offer_type.setId(offer_type.getId());
			_offer_type.setDescription_key(offer_type.getDescription_key());
		}
	}
	
	//Получение всех Offer_types в виде списка
	public static void getAllOfferTypes(List<Offer_type> _offerTypeList) {
			
		_offerTypeList.addAll(ofy().load().type(Offer_type.class).list());
	}

	public static void createOffer_type(Offer_type _offer_type) {

		ofy().save().entity(_offer_type).now();
	}
}
