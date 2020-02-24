package beans;

import java.util.Date;

public class WheelsetTransaction implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer wheelsetAssetId;
	private String wheelsetTransactionId;
	private String substageId;
	private String previousStageId;
	private String wheeldiscLeftNo;
	private String ctrbLeftNo;
	private String ctrbLeftMake;
	private String wheeldiscLeftMake;
	private String leftBrakeDiscMake;
	private float leftWheelDiscTon;
	private String wheeldiscRightNo;
	private String ctrbRightNo;
	private String ctrbRightMake;
	private String wheeldiscRightMake;
	private String rightBrakeDiscMake;
	private float rightWheelDiscTon;
	private String axleNumber;
	private String axleMake;
	private Date assemblyStartDate;
	private Date assemblyEndDate;
	private Date assemblyDispatchDate;
	private String remarks;
	//private String exitRemarks;
	//private String lateReason;
//	private Date expectedExitDate;
//	private String qualityStatus;
	private String transEntryBy;
	private String transEntryTime;
	
	private Integer asignedFlag;
	private Date receiptAtNextStage;
	private String dispatchTo;
	private String customer;
	
	
	
	public WheelsetTransaction() {
	}

public WheelsetTransaction(Integer wheelsetAssetId, String wheelsetTransactionId, String substageId,
			String previousStageId, String wheeldiscLeftNo, String ctrbLeftNo, String ctrbLeftMake,
			String wheeldiscLeftMake, String leftBrakeDiscMake, float leftWheelDiscTon, String wheeldiscRightNo,
			String ctrbRightNo, String ctrbRightMake, String wheeldiscRightMake, String rightBrakeDiscMake,
			float rightWheelDiscTon, String axleNumber, String axleMake, Date assemblyStartDate, Date assemblyEndDate,
			Date assemblyDispatchDate, String remarks, String transEntryBy, String transEntryTime, Integer asignedFlag,
			Date receiptAtNextStage, String dispatchTo, String customer) {
		super();
		this.wheelsetAssetId = wheelsetAssetId;
		this.wheelsetTransactionId = wheelsetTransactionId;
		this.substageId = substageId;
		this.previousStageId = previousStageId;
		this.wheeldiscLeftNo = wheeldiscLeftNo;
		this.ctrbLeftNo = ctrbLeftNo;
		this.ctrbLeftMake = ctrbLeftMake;
		this.wheeldiscLeftMake = wheeldiscLeftMake;
		this.leftBrakeDiscMake = leftBrakeDiscMake;
		this.leftWheelDiscTon = leftWheelDiscTon;
		this.wheeldiscRightNo = wheeldiscRightNo;
		this.ctrbRightNo = ctrbRightNo;
		this.ctrbRightMake = ctrbRightMake;
		this.wheeldiscRightMake = wheeldiscRightMake;
		this.rightBrakeDiscMake = rightBrakeDiscMake;
		this.rightWheelDiscTon = rightWheelDiscTon;
		this.axleNumber = axleNumber;
		this.axleMake = axleMake;
		this.assemblyStartDate = assemblyStartDate;
		this.assemblyEndDate = assemblyEndDate;
		this.assemblyDispatchDate = assemblyDispatchDate;
		this.remarks = remarks;
		this.transEntryBy = transEntryBy;
		this.transEntryTime = transEntryTime;
		this.asignedFlag = asignedFlag;
		this.receiptAtNextStage = receiptAtNextStage;
		this.dispatchTo=dispatchTo;
		this.customer=customer;
	}


	public Integer getWheelsetAssetId() {
		return wheelsetAssetId;
	}




	public void setWheelsetAssetId(Integer wheelsetAssetId) {
		this.wheelsetAssetId = wheelsetAssetId;
	}


	public String getWheelsetTransactionId() {
		return wheelsetTransactionId;
	}


	public void setWheelsetTransactionId(String wheelsetTransactionId) {
		this.wheelsetTransactionId = wheelsetTransactionId;
	}


	public String getSubstageId() {
		return substageId;
	}


	public void setSubstageId(String substageId) {
		this.substageId = substageId;
	}
	public String getPreviousStageId() {
		return previousStageId;
	}
	public void setPreviousStageId(String previousStageId) {
		this.previousStageId = previousStageId;
	}
	public String getWheeldiscLeftNo() {
		return wheeldiscLeftNo;
	}
	public void setWheeldiscLeftNo(String wheeldiscLeftNo) {
		this.wheeldiscLeftNo = wheeldiscLeftNo;
	}
	public String getCtrbLeftNo() {
		return ctrbLeftNo;
	}
	public void setCtrbLeftNo(String ctrbLeftNo) {
		this.ctrbLeftNo = ctrbLeftNo;
	}
	public String getCtrbLeftMake() {
		return ctrbLeftMake;
	}
	public void setCtrbLeftMake(String ctrbLeftMake) {
		this.ctrbLeftMake = ctrbLeftMake;
	}
	public String getWheeldiscLeftMake() {
		return wheeldiscLeftMake;
	}
	public void setWheeldiscLeftMake(String wheeldiscLeftMake) {
		this.wheeldiscLeftMake = wheeldiscLeftMake;
	}
	public String getLeftBrakeDiscMake() {
		return leftBrakeDiscMake;
	}
	public void setLeftBrakeDiscMake(String leftBrakeDiscMake) {
		this.leftBrakeDiscMake = leftBrakeDiscMake;
	}
	public float getLeftWheelDiscTon() {
		return leftWheelDiscTon;
	}
	public void setLeftWheelDiscTon(float leftWheelDiscTon) {
		this.leftWheelDiscTon = leftWheelDiscTon;
	}
	public String getWheeldiscRightNo() {
		return wheeldiscRightNo;
	}
	public void setWheeldiscRightNo(String wheeldiscRightNo) {
		this.wheeldiscRightNo = wheeldiscRightNo;
	}
	public String getCtrbRightNo() {
		return ctrbRightNo;
	}
	public void setCtrbRightNo(String ctrbRightNo) {
		this.ctrbRightNo = ctrbRightNo;
	}
	public String getCtrbRightMake() {
		return ctrbRightMake;
	}
	public void setCtrbRightMake(String ctrbRightMake) {
		this.ctrbRightMake = ctrbRightMake;
	}
	public String getWheeldiscRightMake() {
		return wheeldiscRightMake;
	}
	public void setWheeldiscRightMake(String wheeldiscRightMake) {
		this.wheeldiscRightMake = wheeldiscRightMake;
	}
	public String getRightBrakeDiscMake() {
		return rightBrakeDiscMake;
	}
	public void setRightBrakeDiscMake(String rightBrakeDiscMake) {
		this.rightBrakeDiscMake = rightBrakeDiscMake;
	}
	public float getRightWheelDiscTon() {
		return rightWheelDiscTon;
	}
	public void setRightWheelDiscTon(float rightWheelDiscTon) {
		this.rightWheelDiscTon = rightWheelDiscTon;
	}
	public String getAxleNumber() {
		return axleNumber;
	}
	public void setAxleNumber(String axleNumber) {
		this.axleNumber = axleNumber;
	}
	public String getAxleMake() {
		return axleMake;
	}
	public void setAxleMake(String axleMake) {
		this.axleMake = axleMake;
	}
	public Date getAssemblyStartDate() {
		return assemblyStartDate;
	}
	public void setAssemblyStartDate(Date assemblyStartDate) {
		this.assemblyStartDate = assemblyStartDate;
	}
	public Date getAssemblyEndDate() {
		return assemblyEndDate;
	}
	public void setAssemblyEndDate(Date assemblyEndDate) {
		this.assemblyEndDate = assemblyEndDate;
	}
	public Date getAssemblyDispatchDate() {
		return assemblyDispatchDate;
	}
	public void setAssemblyDispatchDate(Date assemblyDispatchDate) {
		this.assemblyDispatchDate = assemblyDispatchDate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getTransEntryBy() {
		return transEntryBy;
	}
	public void setTransEntryBy(String transEntryBy) {
		this.transEntryBy = transEntryBy;
	}
	public String getTransEntryTime() {
		return transEntryTime;
	}
	public void setTransEntryTime(String transEntryTime) {
		this.transEntryTime = transEntryTime;
	}
	public Integer getAsignedFlag() {
		return asignedFlag;
	}
	public void setAsignedFlag(Integer asignedFlag) {
		this.asignedFlag = asignedFlag;
	}
	public Date getReceiptAtNextStage() {
		return receiptAtNextStage;
	}
	public void setReceiptAtNextStage(Date receiptAtNextStage) {
		this.receiptAtNextStage = receiptAtNextStage;
	}

	

	public String getDispatchTo() {
		return dispatchTo;
	}

	public void setDispatchTo(String dispatchTo) {
		this.dispatchTo = dispatchTo;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
	
}
