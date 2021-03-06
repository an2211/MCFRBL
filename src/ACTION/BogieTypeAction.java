package ACTION;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import org.hibernate.criterion.Restrictions;


import hibernateConnect.HibernateConfig;
import beans.WheelsetTransaction;


public class BogieTypeAction {
	private List <String> bogieType;
	private Map<Integer,String> axleNumberList;
	private List <String> railway;
	
	
	
	
	@SuppressWarnings("unchecked")
	public String getAssetType()
	{
		Session session =  null;
	
	session = HibernateConfig.getSession();
	
		try {

			
			session.beginTransaction();
			Query query=null;
			 
query = session.createSQLQuery("select asset_subtype from public.asset_master where asset_type='Bogie' ");
			
					bogieType=  (List<String>)query.list();
					
			
			Criteria cr = session.createCriteria(WheelsetTransaction.class);
			cr.addOrder(Order.asc("axleNumber"));
			cr.add(Restrictions.isNull("asignedFlag"));
			cr.add(Restrictions.isNotNull("receiptAtNextStage"));
			List<WheelsetTransaction> obj=cr.list();
			//abnormalityList=new ArrayList<String>();
			axleNumberList= new LinkedHashMap<Integer,String>();
			for(WheelsetTransaction a:obj)
			{
				//abnormalityList.add(a.getAbnormalityDescription());
				axleNumberList.put(a.getWheelsetAssetId(), a.getAxleNumber());
			}
		// third query to retrieve railway
			 
			
			  Query query1=null;
			  query1 = session.createSQLQuery("select railway_code from public.railway_master");
			  railway=  (List<String>)query1.list();
			
			//end of query
		
			return "success";
		} 
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		finally
		{session.close(); }
	}
	

	public List<String> getBogieType() {
		return bogieType;
	}


	public void setBogieType(List<String> bogieType) {
		this.bogieType = bogieType;
	}


	public Map<Integer, String> getAxleNumberList() {
		return axleNumberList;
	}


	public void setAxleNumberList(Map<Integer, String> axleNumberList) {
		this.axleNumberList = axleNumberList;
	}


	public List<String> getRailway() {
		return railway;
	}


	public void setRailway(List<String> railway) {
		this.railway = railway;
	}
	
	
	}
