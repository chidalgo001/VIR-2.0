package com.vir.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.vir.exception.UnableToGetEntryException;
import com.vir.model.Dictionary;
import com.vir.model.SourceType;
import com.vir.service.DictionaryEntryService;
 
/**
 * Service that collects all the resources definitions and puts them
 * together in a single object.
 * 
 * @author Alfredo Lopez
 *
 */

@Service
public class SimpleDictionaryEntryService {
	
	@Autowired
	@Qualifier("oxfordDictionaryEntryService")
	private DictionaryEntryService dictionaryEntryService;

	public Dictionary getEntry(String wordId, List<SourceType> types) throws UnableToGetEntryException {
		
		Dictionary data = new Dictionary();
		 
		for (SourceType sourceType : types) {
			switch (sourceType) {
			case OXFORD:
				data.setOxford(dictionaryEntryService.getEntry(wordId));
				break;
			case WIKI:
				break;
			case WORD_API:
				break;
			case MERRIAM:
				break;
			}
		}
		return data;
	}
}