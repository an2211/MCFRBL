package beans;

import java.util.Date;

public class ShellTransaction implements java.io.Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private Integer shellAssetId;
	private String shellTransactionId;
	private String stageId;
	private String previousStageId;
	private String underFrameNumber;
	private String shellNumber;
	private String shellType;
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
	private Date receiptatNextStage;
	
	public ShellTransaction()
	{
		
	}

	public ShellTransaction(Integer shellAssetId, String shellTransactionId, String stageId, String previousStageId,
			String underFrameNumber, String shellNumber, String shellType, Date assemblyStartDate,Date expectedExitDate, Date assemblyEndDate,
			String transactionDate, String transactionUser, String remarks, String exitRemarks, String lateRemarks,
			Date assemblyDispatchDate, Integer asignedFlag, Date receiptatNextStage) {
		super();
		this.shellAssetId = shellAssetId;
		this.shellTransactionId = shellTransactionId;
		this.stageId = stageId;
		this.previousStageId = previousStageId;
		this.underFrameNumber = underFrameNumber;
		this.shellNumber = shellNumber;
		this.shellType = shellType;
		this.assemblyStartDate = assemblyStartDate;
		this.assemblyEndDate = assemblyEndDate;
		this.transactionDate = transactionDate;
		this.transactionUser = transactionUser;
		this.remarks = remarks;
		this.exitRemarks = exitRemarks;
		this.lateRemarks = lateRemarks;
		this.asignedFlag = asignedFlag;
		this.receiptatNextStage = receiptatNextStage;
		this.expectedExitDate=expectedExitDate;
		this.assemblyDispatchDate=assemblyDispatchDate;
	}

	public Integer getShellAssetId() {
		return shellAssetId;
	}

	public void setShellAssetId(Integer shellAssetId) {
		this.shellAssetId = shellAssetId;
	}

	public String getShellTransactionId() {
		return shellTransactionId;
	}

	public void setShellTransactionId(String shellTransactionId) {
		this.shellTransactionId = shellTransactionId;
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

	public String getUnderFrameNumber() {
		return underFrameNumber;
	}

	public void setUnderFrameNumber(String underFrameNumber) {
		this.underFrameNumber = underFrameNumber;
	}

	public String getShellNumber() {
		return shellNumber;
	}

	public void setShellNumber(String shellNumber) {
		this.shellNumber = shellNumber;
	}

	public String getShellType() {
		return shellType;
	}

	public void setShellType(String shellType) {
		this.shellType = shellType;
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

	public Date getReceiptatNextStage() {
		return receiptatNextStage;
	}

	public void setReceiptatNextStage(Date receiptatNextStage) {
		this.receiptatNextStage = receiptatNextStage;
	}

	public Date getExpectedExitDate() {
		return expectedExitDate;
	}

	public void setExpectedExitDate(Date expectedExitDate) {
		this.expectedExitDate = expectedExitDate;
	}

	public Date getAssemblyDispatchDate() {
		return assemblyDispatchDate;
	}

	public void setAssemblyDispatchDate(Date assemblyDispatchDate) {
		this.assemblyDispatchDate = assemblyDispatchDate;
	}
	
	
}
