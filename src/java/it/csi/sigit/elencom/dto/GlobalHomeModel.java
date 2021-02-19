package it.csi.sigit.elencom.dto;

import java.util.*;
import com.opensymphony.xwork2.validator.annotations.*;
import it.csi.sigit.elencom.dto.common.*;
import it.csi.sigit.elencom.dto.ricercamanutentoretns.*;

/**
 * Questo DTO incapsula tutto il contenuto informativo necessario all'esecuzione della
 * logica di business associata alla OnInit action
 */
public class GlobalHomeModel extends BaseSessionAwareDTO {

	// il serial version uid e' fisso in quanto la classe in oggetto e' serializzabile
	// solo per la clusterizzazione della sessione web e non viene scambiata con altre
	// componenti.
	private static final long serialVersionUID = 1L;

	////////////////////////////////////////////////////////////////////
	/// application data
	////////////////////////////////////////////////////////////////////

	/**
	 * imposta il valore dell' ApplicationData 'appDatamanutentoreAppData'
	 * @param value
	 * @generated
	 */

	public void setAppDatamanutentoreAppData(it.csi.sigit.elencom.dto.ricercamanutentoretns.Manutentore value) {
		getSession().put("appDatamanutentoreAppData", value);
	}

	/**
	 * legge il valore dell' ApplicationData 'appDatamanutentoreAppData'
	 * @generated
	 */
	public it.csi.sigit.elencom.dto.ricercamanutentoretns.Manutentore getAppDatamanutentoreAppData() {
		return (it.csi.sigit.elencom.dto.ricercamanutentoretns.Manutentore) (getSession()
				.get("appDatamanutentoreAppData"));
	}

	/**
	 * imposta il valore dell' ApplicationData 'appDatacomboComuni'
	 * @param value
	 * @generated
	 */

	public void setAppDatacomboComuni(
			java.util.ArrayList<it.csi.sigit.elencom.dto.ricercamanutentoretns.CodiceDescrizione> value) {
		getSession().put("appDatacomboComuni", value);
	}

	/**
	 * legge il valore dell' ApplicationData 'appDatacomboComuni'
	 * @generated
	 */
	public java.util.ArrayList<it.csi.sigit.elencom.dto.ricercamanutentoretns.CodiceDescrizione> getAppDatacomboComuni() {
		return (java.util.ArrayList<it.csi.sigit.elencom.dto.ricercamanutentoretns.CodiceDescrizione>) (getSession()
				.get("appDatacomboComuni"));
	}

	/**
	 * imposta il valore dell' ApplicationData 'appDatacomboProvince'
	 * @param value
	 * @generated
	 */

	public void setAppDatacomboProvince(
			java.util.ArrayList<it.csi.sigit.elencom.dto.ricercamanutentoretns.CodiceDescrizione> value) {
		getSession().put("appDatacomboProvince", value);
	}

	/**
	 * legge il valore dell' ApplicationData 'appDatacomboProvince'
	 * @generated
	 */
	public java.util.ArrayList<it.csi.sigit.elencom.dto.ricercamanutentoretns.CodiceDescrizione> getAppDatacomboProvince() {
		return (java.util.ArrayList<it.csi.sigit.elencom.dto.ricercamanutentoretns.CodiceDescrizione>) (getSession()
				.get("appDatacomboProvince"));
	}

	/**
	 * imposta il valore dell' ApplicationData 'appDatamanutentoriAppData'
	 * @param value
	 * @generated
	 */

	public void setAppDatamanutentoriAppData(
			java.util.ArrayList<it.csi.sigit.elencom.dto.ricercamanutentoretns.Manutentore> value) {
		getSession().put("appDatamanutentoriAppData", value);
	}

	/**
	 * legge il valore dell' ApplicationData 'appDatamanutentoriAppData'
	 * @generated
	 */
	public java.util.ArrayList<it.csi.sigit.elencom.dto.ricercamanutentoretns.Manutentore> getAppDatamanutentoriAppData() {
		return (java.util.ArrayList<it.csi.sigit.elencom.dto.ricercamanutentoretns.Manutentore>) (getSession()
				.get("appDatamanutentoriAppData"));
	}

	/**
	 * imposta il valore dell' ApplicationData 'appDatafiltroManutentore'
	 * @param value
	 * @generated
	 */

	public void setAppDatafiltroManutentore(it.csi.sigit.elencom.dto.ricercamanutentoretns.FiltroManutentore value) {
		getSession().put("appDatafiltroManutentore", value);
	}

	/**
	 * legge il valore dell' ApplicationData 'appDatafiltroManutentore'
	 * @generated
	 */
	public it.csi.sigit.elencom.dto.ricercamanutentoretns.FiltroManutentore getAppDatafiltroManutentore() {
		return (it.csi.sigit.elencom.dto.ricercamanutentoretns.FiltroManutentore) (getSession()
				.get("appDatafiltroManutentore"));
	}

}
