package struts.action.master;
import org.hibernate.Session;

import beans.PaintTransaction;
import beans.ShellTransaction;
import hibernateConnect.HibernateConfig;
public class ShowPaintData {
private String paintAssetId;
private String shellType;
private String shellNo;
private String shellNo_Type;
private String furnishingNo;
private String formNoIntrSipPaint;
private String formVerIntrSipPaint;
	public String showData()
	{
		Integer paintAssetIdAsInt=Integer.parseInt(paintAssetId);
		Session session=null;
		session=HibernateConfig.getSession();
		PaintTransaction paintTransaction=(PaintTransaction) session.get(PaintTransaction.class, paintAssetIdAsInt);
		furnishingNo= paintTransaction.getFurnishingNumber();
		
		Integer shellAssetId=paintTransaction.getShellAssetId();
		ShellTransaction shellTransaction= (ShellTransaction) session.get(ShellTransaction.class, shellAssetId);
		shellType=shellTransaction.getShellType();
		shellNo=shellTransaction.getShellNumber();
		shellNo_Type=shellType+" - "+shellNo;
		formNoIntrSipPaint="RCF/RBL/QMF 5001";
		formVerIntrSipPaint="2012-00-00";
		try
		{
			return "success";
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return "error";
		}
		finally
		{
			if(session!=null)
			{
				session.close();
			}
		}
	}
	public String getPaintAssetId() {
		return paintAssetId;
	}
	public void setPaintAssetId(String paintAssetId) {
		this.paintAssetId = paintAssetId;
	}
	public String getShellType() {
		return shellType;
	}
	public void setShellType(String shellType) {
		this.shellType = shellType;
	}
	public String getShellNo() {
		return shellNo;
	}
	public void setShellNo(String shellNo) {
		this.shellNo = shellNo;
	}
	public String getFurnishingNo() {
		return furnishingNo;
	}
	public void setFurnishingNo(String furnishingNo) {
		this.furnishingNo = furnishingNo;
	}
	public String getFormNoIntrSipPaint() {
		return formNoIntrSipPaint;
	}
	public void setFormNoIntrSipPaint(String formNoIntrSipPaint) {
		this.formNoIntrSipPaint = formNoIntrSipPaint;
	}
	public String getFormVerIntrSipPaint() {
		return formVerIntrSipPaint;
	}
	public void setFormVerIntrSipPaint(String formVerIntrSipPaint) {
		this.formVerIntrSipPaint = formVerIntrSipPaint;
	}
	public String getShellNo_Type() {
		return shellNo_Type;
	}
	public void setShellNo_Type(String shellNo_Type) {
		this.shellNo_Type = shellNo_Type;
	}
	
}
