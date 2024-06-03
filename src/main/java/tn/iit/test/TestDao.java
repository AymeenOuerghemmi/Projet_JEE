package tn.iit.test;

import java.util.List;

import tn.iit.dao.ClasseDaoImpl;
import tn.iit.dao.MatiereDaoImpl;
import tn.iit.dao.PersonneDaoImpl;
import tn.iit.dao.TirageDaoImpl;
import tn.iit.metier.entites.Classe;
import tn.iit.metier.entites.Matiere;
import tn.iit.metier.entites.Personne;
import tn.iit.metier.entites.Tirage;

public class TestDao {

	public static void main(String[] args) {
	
	/*MatiereDaoImpl cdao = new MatiereDaoImpl();
	Matiere mat = cdao.save(new Matiere("laravel", 2, 1));
	System.out.println(mat);
	List<Matiere> mati= cdao.matiereParMC("Gr3");
	for(Matiere m : mati)
		System.out.println(m);*/
	/*	TirageDaoImpl cdao = new TirageDaoImpl();
		Tirage tir = cdao.save(new Tirage("test",19-04-2019,19-04-2019, "encour","ahmad"));
		System.out.println(tir);
		List<Tirage> mati= cdao.tirageParMC("Gr3");
		for(Tirage m : mati)
			System.out.println(m);*/
		PersonneDaoImpl cdao = new PersonneDaoImpl();
		Personne mat = cdao.save(new Personne("aymen", "ouerghemmi","admin","123","1"));
		System.out.println(mat);
		List<Personne> mati= cdao.personneParMC("Gr3");
		for(Personne m : mati)
			System.out.println(m);
	}

}
