package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entitities.Lead;

public interface LeadService {
	public void saveOneLead(Lead lead);

	public Lead getOneLead(long id);

	public void deleteOneLead(long id);

	public List<Lead> listLeads();

}
