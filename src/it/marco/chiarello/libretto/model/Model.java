package it.marco.chiarello.libretto.model;

import java.util.ArrayList;
import java.util.List;

public class Model {
	
	private List<Esame> esami;
	
	public Model() {
		this.esami = new ArrayList<Esame>();
	}
	
	/**
	 * Aggiunge un nuovo esame all'elenco degli esami presenti,
	 * verificando che non ci sia già
	 * @param e
	 * @return true se l'ha inserito, false se esisteva già e quindi non lo poteva inserire
	 */
	public boolean addEsame(Esame e) {
		if(!esami.contains(e)) {
			esami.add(e);
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Ricerca se esiste un esame con il codice specificato.
	 * Se esiste, lo restituisce, altrimenti restiruisce null.
	 * @param codice codice dell'esame da ricercare
	 * @return l'esame trovato, oppure null se non trovato
	 */
	public Esame trovaEsame(String codice) {
		int pos = this.esami.indexOf( new Esame(codice, null, null) ) ;
		if(pos == -1) {
			return null;
		} else {
			return esami.get(pos);
		}
	}
	
}
