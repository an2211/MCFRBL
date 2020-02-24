package beans;

import java.util.Date;

public class BogiesetTransaction implements java.io.Serializable {

	
	private static final long serialVersionUID = 1L;
	private Integer bogieAssetId;
	private String bogiesetTrxId;
	private String substageId;
	private String prevStageId;
	private Integer leftWheelAssetId;
	private Integer rightWheelAssetId;
	private Date assemblyStartDate;
	private String frameNo;
	private Date frameReceiptDate;
	private String bolsNo;
	private Date bolsReceiptDate;
	private Date assemblyEndDate;
	private Date assemblyExpectedExtDate;
	private Date assemblyExitDate;
	private String productionBy;
	private String remarks;
	private String lateRemark;
	private String trxUser;
	private String trxDate;
	private Integer asignedFlag;
	private String exitRemarks;
	private Date receiptAtNextStage;
	private String bogieNumber;
	private String bogieType;
	private String dispatchTo;
	private String customer;
	private String frameManufacturedBy;
	private String bolsterManufacturedBy;
	
	public BogiesetTransaction() {
		
	}

	public BogiesetTransaction(Integer bogieAssetId, String bogiesetTrxId, String substageId, String prevStageId,
			Integer leftWheelAssetId, Integer rightWheelAssetId, Date assemblyStartDate, String frameNo,
			Date frameReceiptDate, String bolsNo, Date bolsReceiptDate, Date assemblyEndDate,
			Date assemblyExpectedExtDate, Date assemblyExitDate, String productionBy, String remarks, String lateRemark,
			String trxUser, String trxDate, Integer asignedFlag, String exitRemarks, Date receiptAtNextStage, String bogieNumber, String bogieType, String dispatchTo,String customer, String frameManufacturedBy, String bolsterManufacturedBy ) {
		super();
		this.bogieAssetId = bogieAssetId;
		this.bogiesetTrxId = bogiesetTrxId;
		this.substageId = substageId;
		this.prevStageId = prevStageId;
		this.leftWheelAssetId = leftWheelAssetId;
		this.rightWheelAssetId = rightWheelAssetId;
		this.assemblyStartDate = assemblyStartDate;
		this.frameNo = frameNo;
		this.frameReceiptDate = frameReceiptDate;
		this.bolsNo = bolsNo;
		this.bolsReceiptDate = bolsReceiptDate;
		this.assemblyEndDate = assemblyEndDate;
		this.assemblyExpectedExtDate = assemblyExpectedExtDate;
		this.assemblyExitDate = assemblyExitDate;
		this.productionBy = productionBy;
		this.remarks = remarks;
		this.lateRemark = lateRemark;
		this.trxUser = trxUser;
		this.trxDate = trxDate;
		this.asignedFlag = asignedFlag;
		this.exitRemarks=exitRemarks;
		this.receiptAtNextStage=receiptAtNextStage;
		this.bogieNumber=bogieNumber;
		this.bogieType=bogieNumber;
		this.dispatchTo=dispatchTo;
		this.customer=customer;
		this.frameManufacturedBy=frameManufacturedBy;
		this.bolsterManufacturedBy=bolsterManufacturedBy;
	}

	public Integer getBogieAssetId() {
		return bogieAssetId;
	}

	public void setBogieAssetId(Integer bogieAssetId) {
		this.bogieAssetId = bogieAssetId;
	}

	public String getBogiesetTrxId() {
		return bogiesetTrxId;
	}

	public void setBogiesetTrxId(String bogiesetTrxId) {
		this.bogiesetTrxId = bogiesetTrxId;
	}

	public String getSubstageId() {
		return substageId;
	}

	public void setSubstageId(String substageId) {
		this.substageId = substageId;
	}

	public String getPrevStageId() {
		return prevStageId;
	}

	public void setPrevStageId(String prevStageId) {
		this.prevStageId = prevStageId;
	}

	public Integer getLeftWheelAssetId() {
		return leftWheelAssetId;
	}

	public void setLeftWheelAssetId(Integer leftWheelAssetId) {
		this.leftWheelAssetId = leftWheelAssetId;
	}

	public Integer getRightWheelAssetId() {
		return rightWheelAssetId;
	}

	public void setRightWheelAssetId(Integer rightWheelAssetId) {
		this.rightWheelAssetId = rightWheelAssetId;
	}

	

	public Date getAssemblyStartDate() {
		return assemblyStartDate;
	}

	public void setAssemblyStartDate(Date assemblyStartDate) {
		this.assemblyStartDate = assemblyStartDate;
	}

	public String getFrameNo() {
		return frameNo;
	}

	public void setFrameNo(String frameNo) {
		this.frameNo = frameNo;
	}

	public Date getFrameReceiptDate() {
		return frameReceiptDate;
	}

	public void setFrameReceiptDate(Date frameReceiptDate) {
		this.frameReceiptDate = frameReceiptDate;
	}

	public String getBolsNo() {
		return bolsNo;
	}

	public void setBolsNo(String bolsNo) {
		this.bolsNo = bolsNo;
	}

	public Date getBolsReceiptDate() {
		return bolsReceiptDate;
	}

	public void setBolsReceiptDate(Date bolsReceiptDate) {
		this.bolsReceiptDate = bolsReceiptDate;
	}

	public Date getAssemblyEndDate() {
		return assemblyEndDate;
	}

	public void setAssemblyEndDate(Date assemblyEndDate) {
		this.assemblyEndDate = assemblyEndDate;
	}

	public Date getAssemblyExpectedExtDate() {
		return assemblyExpectedExtDate;
	}

	public void setAssemblyExpectedExtDate(Date assemblyExpectedExtDate) {
		this.assemblyExpectedExtDate = assemblyExpectedExtDate;
	}

	public Date getAssemblyExitDate() {
		return assemblyExitDate;
	}

	public void setAssemblyExitDate(Date assemblyExitDate) {
		this.assemblyExitDate = assemblyExitDate;
	}

	public String getProductionBy() {
		return productionBy;
	}

	public void setProductionBy(String productionBy) {
		this.productionBy = productionBy;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getLateRemark() {
		return lateRemark;
	}

	public void setLateRemark(String lateRemark) {
		this.lateRemark = lateRemark;
	}

	public String getTrxUser() {
		return trxUser;
	}

	public void setTrxUser(String trxUser) {
		this.trxUser = trxUser;
	}

	public String getTrxDate() {
		return trxDate;
	}

	public void setTrxDate(String trxDate) {
		this.trxDate = trxDate;
	}

	public Integer getAsignedFlag() {
		return asignedFlag;
	}

	public void setAsignedFlag(Integer asignedFlag) {
		this.asignedFlag = asignedFlag;
	}

	public String getExitRemarks() {
		return exitRemarks;
	}

	public void setExitRemarks(String exitRemarks) {
		this.exitRemarks = exitRemarks;
	}

	public Date getReceiptAtNextStage() {
		return receiptAtNextStage;
	}

	public void setReceiptAtNextStage(Date receiptAtNextStage) {
		this.receiptAtNextStage = receiptAtNextStage;
	}

	public String getBogieNumber() {
		return bogieNumber;
	}

	public void setBogieNumber(String bogieNumber) {
		this.bogieNumber = bogieNumber;
	}

	public String getBogieType() {
		return bogieType;
	}

	public void setBogieType(String bogieType) {
		this.bogieType = bogieType;
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

	public String getFrameManufacturedBy() {
		return frameManufacturedBy;
	}

	public void setFrameManufacturedBy(String frameManufacturedBy) {
		this.frameManufacturedBy = frameManufacturedBy;
	}

	public String getBolsterManufacturedBy() {
		return bolsterManufacturedBy;
	}

	public void setBolsterManufacturedBy(String bolsterManufacturedBy) {
		this.bolsterManufacturedBy = bolsterManufacturedBy;
	}

	
	
	
	
}
