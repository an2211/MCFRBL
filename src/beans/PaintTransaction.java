package beans;

import java.util.Date;

public class PaintTransaction implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer paintAssetId;
	
	private String stageId;
	private String previousStageId;
	private Integer shellAssetId;
	private Integer intrPaintSipFlag;
	
	

	private Date assemblyStartDate;
	private Date assemblyEndDate;
	private Date assemblyDispatchDate;
	private String colorScheme;
	private String remarks;
	private String exitRemarks;
	private String lateReason;
	private Date expectedExitDate;
	private String transEntryBy;
	private String transEntryTime;
	private Integer asignedFlag;
	private Date receiptAtNextStage;
	private String shellType;
	private String furnishingNumber;
	private String coachType;

public PaintTransaction()
{
	
}

public PaintTransaction(Integer paintAssetId, String stageId, String previousStageId, Integer shellAssetId,
		Date assemblyStartDate, Date assemblyEndDate, Date assemblyDispatchDate, String colorScheme, String remarks, String exitRemarks,
		String lateReason, Date expectedExitDate, String transEntryBy, String transEntryTime, Integer asignedFlag,Integer intrPaintSipFlag,
		Date receiptAtNextStage, String shellType, String furnishingNumber,String coachType) {
	super();
	this.paintAssetId = paintAssetId;
	this.stageId = stageId;
	this.previousStageId = previousStageId;
	this.shellAssetId = shellAssetId;
	this.assemblyStartDate = assemblyStartDate;
	this.assemblyEndDate = assemblyEndDate;
	this.assemblyDispatchDate = assemblyDispatchDate;
	this.colorScheme=colorScheme;
	this.remarks = remarks;
	this.exitRemarks = exitRemarks;
	this.lateReason = lateReason;
	this.expectedExitDate = expectedExitDate;
	this.transEntryBy = transEntryBy;
	this.transEntryTime = transEntryTime;
	this.asignedFlag = asignedFlag;
	this.intrPaintSipFlag = intrPaintSipFlag;
	this.receiptAtNextStage = receiptAtNextStage;
	this.shellType=shellType;
    this.furnishingNumber=furnishingNumber;
    this.coachType=coachType;
    
}
public Integer getIntrPaintSipFlag() {
	return intrPaintSipFlag;
}

public void setIntrPaintSipFlag(Integer intrPaintSipFlag) {
	this.intrPaintSipFlag = intrPaintSipFlag;
}

public Integer getPaintAssetId() {
	return paintAssetId;
}

public void setPaintAssetId(Integer paintAssetId) {
	this.paintAssetId = paintAssetId;
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

public String getColorScheme() {
	return colorScheme;
}

public void setColorScheme(String colorScheme) {
	this.colorScheme = colorScheme;
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

public String getLateReason() {
	return lateReason;
}

public void setLateReason(String lateReason) {
	this.lateReason = lateReason;
}

public Date getExpectedExitDate() {
	return expectedExitDate;
}

public void setExpectedExitDate(Date expectedExitDate) {
	this.expectedExitDate = expectedExitDate;
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

public String getShellType() {
	return shellType;
}

public void setShellType(String shellType) {
	this.shellType = shellType;
}

public String getFurnishingNumber() {
	return furnishingNumber;
}

public void setFurnishingNumber(String furnishingNumber) {
	this.furnishingNumber = furnishingNumber;
}

public String getCoachType() {
	return coachType;
}

public void setCoachType(String coachType) {
	this.coachType = coachType;
}


}
