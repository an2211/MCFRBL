package beans;
// Generated 8 May, 2018 6:15:33 PM by Hibernate Tools 4.0.1.Final

/**
 * IrwisHrPltCalidMapM generated by hbm2java
 */
public class IrwisHrPltCalidMapM implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IrwisHrPltCalidMapMId id;
	private String satType;
	private String sunType;

	public IrwisHrPltCalidMapM() {
	}

	public IrwisHrPltCalidMapM(IrwisHrPltCalidMapMId id) {
		this.id = id;
	}

	public IrwisHrPltCalidMapM(IrwisHrPltCalidMapMId id, String satType, String sunType) {
		this.id = id;
		this.satType = satType;
		this.sunType = sunType;
	}

	public IrwisHrPltCalidMapMId getId() {
		return this.id;
	}

	public void setId(IrwisHrPltCalidMapMId id) {
		this.id = id;
	}

	public String getSatType() {
		return this.satType;
	}

	public void setSatType(String satType) {
		this.satType = satType;
	}

	public String getSunType() {
		return this.sunType;
	}

	public void setSunType(String sunType) {
		this.sunType = sunType;
	}

}