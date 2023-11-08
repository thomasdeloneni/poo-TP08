package fr.eni.quelMedecin.bo;

/**
 * Classe modélisant un médecin spécialiste; C'est une specialisation de la classe Medecin
 * Elle ne peut pas etre une généralisation de classes dérivées
 * 
 * @author ENI
 * @version 3.0
 */
public final class MedecinSpecialiste extends Medecin {
	//ATTRIBUTS D'INSTANCE
	private String specialite;
	private int tarif;

	//CONSTRUCTEURS
	/**
	 * Constructeur
	 * @param nom - nom du médecin spécialiste
	 * @param prenom - prenom du médecin spécialiste
	 * @param numeroDeTelephone - numéro de téléphone du médecin spécialiste
	 * @param adresse - adresse postale du médecin spécialiste
	 * @param specialite - nom de la sépcialité du médecin spécialiste
	 * @param tarif - tarif pratiqué par ce médecin pour une consultation
	 */
	public MedecinSpecialiste(String nom, String prenom, String numeroDeTelephone, Adresse adresse, String specialite,
			int tarif) {
		super(nom, prenom, numeroDeTelephone, adresse);
		this.setSpecialite(specialite);
		this.setTarif(tarif);
	}

	public MedecinSpecialiste(String nom, String prenom, String numeroDeTelephone, Adresse sh) {
		super(nom, prenom, numeroDeTelephone,sh);
	}


	@SuppressWarnings("deprecation")
	@Override
	public void afficher() {
		super.afficher();
		System.out.printf("Spécialité : %s%nTarif : %d€%n", this.getSpecialite(), this.getTarif());
		this.AfficherAdresseEtCreneaux();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("Tarif : ").append(this.getTarif()).append("\n");
		sb.append("Specialité :").append(this.getSpecialite()).append(("\n"));
		return sb.toString();
	}

	//ACCESSEURS ET MUTATEURS
	/**
	 * Getter pour specialite
	 * @return la specialite du medecin specialiste
	 * @see MedecinSpecialiste#setSpecialite(String)
	 */
	public String getSpecialite() {
		return specialite;
	}

	/**
	 * Setter pour specialite
	 * @param specialite - la specialite du medecin specialiste
	 * @see MedecinSpecialiste#getSpecialite()
	 */
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	/**
	 * Getter pour tarif
	 * @return le tarif de la consultation
	 * @see MedecinSpecialiste#setTarif(int)
	 */
	public int getTarif() {
		return tarif;
	}

	/**
	 * Setter pour tarif
	 * @param tarif - le tarif de la consultation
	 * @see MedecinSpecialiste#getTarif()
	 */
	public void setTarif(int tarif) {
		this.tarif = tarif;
	}
	
}
