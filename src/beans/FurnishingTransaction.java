package beans;

import java.util.Date;

public class FurnishingTransaction implements java.io.Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private Integer furnishingAssetId;
	private String stageId;
	private String previousStageId;
	private Integer shellAssetId;
	private String shellType;
	private Integer paintAssetId;
	private Integer bogiePpSideAssetId;

	
	private Integer bogieNppSideAssetId;
	
	private Date assemblyStartDate;
	private Date expectedExitDate;
	private Date assemblyEndDate;
	private Date assemblyDispatchDate;
	private String transactionDate;
	private String transactionUser;
	private String remarks;
	private String exitRemarks;
	private String lateRemarks;
	private Integer asignedFlag;
	private Date receiptAtNextStage;
	private String coachNumber;
	private String coachType;
	private String productionBy;
	private String vendorAllotted;
	private Date vendorAllottedDate;
	private Integer airBrakeTestingFlag;
	private Integer plumbingTestingFlag;
	private Integer cbcTestingFlag;
	private Integer electricalTestingFlag;
	private Integer dgLoadTestingFlag;
	
	
	public FurnishingTransaction()
	{
		
	}

	

	public FurnishingTransaction(Integer furnishingAssetId, String stageId, String previousStageId,
			Integer shellAssetId, String shellType, Integer paintAssetId, Integer bogiePpSideAssetId,
			Integer bogieNppSideAssetId, Date assemblyStartDate, Date expectedExitDate, Date assemblyEndDate,
			Date assemblyDispatchDate, String transactionDate, String transactionUser, String remarks,
			String exitRemarks, String lateRemarks, Integer asignedFlag, Date receiptAtNextStage, String coachNumber,
			String coachType, String productionBy, String vendorAllotted, Date vendorAllottedDate,
			Integer airBrakeTestingFlag, Integer plumbingTestingFlag, Integer cbcTestingFlag,
			Integer electricalTestingFlag, Integer dgLoadTestingFlag) {
		super();
		this.furnishingAssetId = furnishingAssetId;
		this.stageId = stageId;
		this.previousStageId = previousStageId;
		this.shellAssetId = shellAssetId;
		this.shellType = shellType;
		this.paintAssetId = paintAssetId;
		this.bogiePpSideAssetId = bogiePpSideAssetId;
		this.bogieNppSideAssetId = bogieNppSideAssetId;
		this.assemblyStartDate = assemblyStartDate;
		this.expectedExitDate = expectedExitDate;
		this.assemblyEndDate = assemblyEndDate;
		this.assemblyDispatchDate = assemblyDispatchDate;
		this.transactionDate = transactionDate;
		this.transactionUser = transactionUser;
		this.remarks = remarks;
		this.exitRemarks = exitRemarks;
		this.lateRemarks = lateRemarks;
		this.asignedFlag = asignedFlag;
		this.receiptAtNextStage = receiptAtNextStage;
		this.coachNumber = coachNumber;
		this.coachType = coachType;
		this.productionBy = productionBy;
		this.vendorAllotted = vendorAllotted;
		this.vendorAllottedDate = vendorAllottedDate;
		this.airBrakeTestingFlag = airBrakeTestingFlag;
		this.plumbingTestingFlag = plumbingTestingFlag;
		this.cbcTestingFlag = cbcTestingFlag;
		this.electricalTestingFlag = electricalTestingFlag;
		this.dgLoadTestingFlag = dgLoadTestingFlag;
	}



	public Integer getFurnishingAssetId() {
		return furnishingAssetId;
	}



	public void setFurnishingAssetId(Integer furnishingAssetId) {
		this.furnishingAssetId = furnishingAssetId;
	}



	public String getStageId() {
		return stageId;
	}



	public void setStageId(String stageId) {
		this.stageId = stageId;
	}



	public String getPreviousStageId() {
		return previousStageId;
	}



	public void setPreviousStageId(String previousStageId) {
		this.previousStageId = previousStageId;
	}



	public Integer getShellAssetId() {
		return shellAssetId;
	}



	public void setShellAssetId(Integer shellAssetId) {
		this.shellAssetId = shellAssetId;
	}



	public String getShellType() {
		return shellType;
	}



	public void setShellType(String shellType) {
		this.shellType = shellType;
	}



	public Integer getPaintAssetId() {
		return paintAssetId;
	}



	public void setPaintAssetId(Integer paintAssetId) {
		this.paintAssetId = paintAssetId;
	}



	public Integer getBogiePpSideAssetId() {
		return bogiePpSideAssetId;
	}



	public void setBogiePpSideAssetId(Integer bogiePpSideAssetId) {
		this.bogiePpSideAssetId = bogiePpSideAssetId;
	}



	public Integer getBogieNppSideAssetId() {
		return bogieNppSideAssetId;
	}



	public void setBogieNppSideAssetId(Integer bogieNppSideAssetId) {
		this.bogieNppSideAssetId = bogieNppSideAssetId;
	}



	public Date getAssemblyStartDate() {
		return assemblyStartDate;
	}



	public void setAssemblyStartDate(Date assemblyStartDate) {
		this.assemblyStartDate = assemblyStartDate;
	}



	public Date getExpectedExitDate() {
		return expectedExitDate;
	}



	public void setExpectedExitDate(Date expectedExitDate) {
		this.expectedExitDate = expectedExitDate;
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



	public String getTransactionDate() {
		return transactionDate;
	}



	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}



	public String getTransactionUser() {
		return transactionUser;
	}



	public void setTransactionUser(String transactionUser) {
		this.transactionUser = transactionUser;
	}



	public String getRemarks() {
		return remarks;
	}



	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}



	public String getExitRemarks() {
		return exitRemarks;
	}



	public void setExitRemarks(String exitRemarks) {
		this.exitRemarks = exitRemarks;
	}



	public String getLateRemarks() {
		return lateRemarks;
	}



	public void setLateRemarks(String lateRemarks) {
		this.lateRemarks = lateRemarks;
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

	public String getCoachNumber() {
		return coachNumber;
	}

	public void setCoachNumber(String coachNumber) {
		this.coachNumber = coachNumber;
	}

	public String getCoachType() {
		return coachType;
	}

	public void setCoachType(String coachType) {
		this.coachType = coachType;
	}

	public String getProductionBy() {
		return productionBy;
	}

	public void setProductionBy(String productionBy) {
		this.productionBy = productionBy;
	}

	public String getVendorAllotted() {
		return vendorAllotted;
	}

	public void setVendorAllotted(String vendorAllotted) {
		this.vendorAllotted = vendorAllotted;
	}

	public Date getVendorAllottedDate() {
		return vendorAllottedDate;
	}

	public void setVendorAllottedDate(Date vendorAllottedDate) {
		this.vendorAllottedDate = vendorAllottedDate;
	}



	public Integer getAirBrakeTestingFlag() {
		return airBrakeTestingFlag;
	}



	public void setAirBrakeTestingFlag(Integer airBrakeTestingFlag) {
		this.airBrakeTestingFlag = airBrakeTestingFlag;
	}



	public Integer getPlumbingTestingFlag() {
		return plumbingTestingFlag;
	}



	public void setPlumbingTestingFlag(Integer plumbingTestingFlag) {
		this.plumbingTestingFlag = plumbingTestingFlag;
	}



	public Integer getCbcTestingFlag() {
		return cbcTestingFlag;
	}



	public void setCbcTestingFlag(Integer cbcTestingFlag) {
		this.cbcTestingFlag = cbcTestingFlag;
	}



	public Integer getElectricalTestingFlag() {
		return electricalTestingFlag;
	}



	public void setElectricalTestingFlag(Integer electricalTestingFlag) {
		this.electricalTestingFlag = electricalTestingFlag;
	}



	public Integer getDgLoadTestingFlag() {
		return dgLoadTestingFlag;
	}



	public void setDgLoadTestingFlag(Integer dgLoadTestingFlag) {
		this.dgLoadTestingFlag = dgLoadTestingFlag;
	}



	

	
	
	
}
