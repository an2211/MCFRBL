package dao;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.opensymphony.xwork2.ActionContext;

import beans.BogiesetTransaction;
import beans.WheelsetTransaction;
import hibernateConnect.HibernateConfig;

public class DaoBogieProduction {

	@SuppressWarnings("unchecked")
	public List<BogiesetTransaction> getAllBogie(String stageid,String jtSorting, String previousStage, Integer startPageIndex, Integer numRecordsPerPage) {
		Session session =  null;
		
		List<BogiesetTransaction> list = null;
		String username= null;
		
		HttpSession session_http = ServletActionContext.getRequest().getSession(true);
		username = (String) session_http.getAttribute("userid");
		
		if (username != null)
		{
	session = HibernateConfig.getSession();
	
	  
		try{
			System.out.println("--Inside dao.DaoBogieProduction getAllBogie() methods try Block--");
			session = HibernateConfig.getSession();
			Criteria cr = session.createCriteria(BogiesetTransaction.class);
			cr.add(Restrictions.eq("substageId", stageid));
			cr.add(Restrictions.eq("prevStageId", previousStage));
			//cr.add(Restrictions.ne("mergeFunishFlag", 1));
			/*cr.add(
					Restrictions.or(
					Restrictions.isNotNull("exitDate"), 
					Restrictions.eq("exitDate","")
					)
					);*/
//cr.add(Restrictions.isNull("mergeFunishFlag"));
			cr.add(Restrictions.isNull("assemblyExitDate"));
			String[] temp;
	         String delimiter = " ";
	         /* given string will be split by the argument delimiter provided. */
	         temp = jtSorting.split(delimiter);
	 if(jtSorting.endsWith("ASC"))
		         {
		        	 cr.addOrder(Order.asc(temp[0]));
		         }
		         else if(jtSorting.endsWith("DESC"))
		         {
		        	 cr.addOrder(Order.desc(temp[0]));	 
		         }
	 Integer total_rec_count=cr.list().size();
	 Map session_map=ActionContext.getContext().getSession();
	 session_map.put("holding_count", total_rec_count);
	 cr.setFirstResult(startPageIndex);
	 cr.setMaxResults(numRecordsPerPage);
			list = cr.list();
		}catch(Exception ex){
			System.out.println("--- Error Inside dao.DaoBogieProduction getAllBogie() methods catch block---");
			ex.printStackTrace();
		}finally{
			if(session!= null){
				System.out.println("--Inside dao.DaoBogieProduction getAllBogie() methods finally Block--");
				session.close();
			}			
		}
		
	}
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public List<BogiesetTransaction>displayDispatchBogie(String jtSorting, Integer startPageIndex, Integer numRecordsPerPage) {
		Session session =  null;
		List<BogiesetTransaction> list = null;
		String username= null;
		
		HttpSession session_http = ServletActionContext.getRequest().getSession(true);
		username = (String) session_http.getAttribute("userid");
		
		if (username != null)
		{
	session = HibernateConfig.getSession();
	
	  
		try{
			System.out.println("--Inside dao.DaoWheelProduction displayDispatchBogie() methods try Block--");
			session = HibernateConfig.getSession();
			Criteria cr = session.createCriteria(BogiesetTransaction.class);
			
			//cr.add(Restrictions.ne("mergeFunishFlag", 1));
			/*cr.add(
					Restrictions.or(
					Restrictions.isNotNull("exitDate"), 
					Restrictions.eq("exitDate","")
					)
					);*/
//cr.add(Restrictions.isNull("mergeFunishFlag"));
			cr.add(Restrictions.isNotNull("assemblyExitDate"));
			cr.add(Restrictions.isNull("receiptAtNextStage"));
			cr.add(Restrictions.eq("dispatchTo", "furnishing"));
			String[] temp;
	         String delimiter = " ";
	         /* given string will be split by the argument delimiter provided. */
	         temp = jtSorting.split(delimiter);
	 if(jtSorting.endsWith("ASC"))
		         {
		        	 cr.addOrder(Order.asc(temp[0]));
		         }
		         else if(jtSorting.endsWith("DESC"))
		         {
		        	 cr.addOrder(Order.desc(temp[0]));	 
		         }
	 Integer total_rec_count=cr.list().size();
	 Map session_map=ActionContext.getContext().getSession();
	 session_map.put("holding_count", total_rec_count);
	 cr.setFirstResult(startPageIndex);
	 cr.setMaxResults(numRecordsPerPage);
			list = cr.list();
		}catch(Exception ex){
			System.out.println("--- Error Inside dao.DaoBogieProduction displayDispatchBOgie() methods catch block---");
			ex.printStackTrace();
		}finally{
			if(session!= null){
				System.out.println("--Inside dao.DaoBogieProduction displayDispatchBOgie() methods finally Block--");
				session.close();
			}			
		}
		
	}
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public List<BogiesetTransaction>dispatchBogie(String jtSorting, Integer startPageIndex, Integer numRecordsPerPage) {
		Session session =  null;
		List<BogiesetTransaction> list = null;
		String username= null;
		
		HttpSession session_http = ServletActionContext.getRequest().getSession(true);
		username = (String) session_http.getAttribute("userid");
		
		if (username != null)
		{
	session = HibernateConfig.getSession();
	
	  
		try{
			System.out.println("--Inside dao.DaoWheelProduction displayDispatchBogie() methods try Block--");
			session = HibernateConfig.getSession();
			Criteria cr = session.createCriteria(BogiesetTransaction.class);
			
			//cr.add(Restrictions.ne("mergeFunishFlag", 1));
			/*cr.add(
					Restrictions.or(
					Restrictions.isNotNull("exitDate"), 
					Restrictions.eq("exitDate","")
					)
					);*/
//cr.add(Restrictions.isNull("mergeFunishFlag"));
			cr.add(Restrictions.isNotNull("assemblyExitDate"));
			cr.add(Restrictions.isNull("receiptAtNextStage"));
			
			String[] temp;
	         String delimiter = " ";
	         /* given string will be split by the argument delimiter provided. */
	         temp = jtSorting.split(delimiter);
	 if(jtSorting.endsWith("ASC"))
		         {
		        	 cr.addOrder(Order.asc(temp[0]));
		         }
		         else if(jtSorting.endsWith("DESC"))
		         {
		        	 cr.addOrder(Order.desc(temp[0]));	 
		         }
	 Integer total_rec_count=cr.list().size();
	 Map session_map=ActionContext.getContext().getSession();
	 session_map.put("holding_count", total_rec_count);
	 cr.setFirstResult(startPageIndex);
	 cr.setMaxResults(numRecordsPerPage);
			list = cr.list();
		}catch(Exception ex){
			System.out.println("--- Error Inside dao.DaoBogieProduction displayDispatchBOgie() methods catch block---");
			ex.printStackTrace();
		}finally{
			if(session!= null){
				System.out.println("--Inside dao.DaoBogieProduction displayDispatchBOgie() methods finally Block--");
				session.close();
			}			
		}
		
	}
		return list;
	}
	
	
	
	@SuppressWarnings("unchecked")
	public List<BogiesetTransaction>availableBogie(String jtSorting, Integer startPageIndex, Integer numRecordsPerPage) {
		Session session =  null;
		List<BogiesetTransaction> list = null;
		String username= null;
		
		HttpSession session_http = ServletActionContext.getRequest().getSession(true);
		username = (String) session_http.getAttribute("userid");
		
		if (username != null)
		{
	session = HibernateConfig.getSession();
	
	  
		try{
			System.out.println("--Inside dao.DaoWheelProduction availableWheel() methods try Block--");
			session = HibernateConfig.getSession();
			Criteria cr = session.createCriteria(BogiesetTransaction.class);
			/*cr.add(
			Restrictions.or(
			Restrictions.isNotNull("exitDate"), 
			Restrictions.eq("exitDate","")
			)
			);*/	
			
			//cr.add(Restrictions.or(Restrictions.isNull("asignedFlag"),Restrictions.eq("asignedFlag", "")) );  // ne represent not equal.
			cr.add(Restrictions.isNull("asignedFlag"));
			cr.add(Restrictions.isNotNull("receiptAtNextStage"));
			cr.add(Restrictions.eq("dispatchTo", "furnishing"));
			String[] temp;
	         String delimiter = " ";
	         /* given string will be split by the argument delimiter provided. */
	         temp = jtSorting.split(delimiter);
	 if(jtSorting.endsWith("ASC"))
		         {
		        	 cr.addOrder(Order.asc(temp[0]));
		         }
		         else if(jtSorting.endsWith("DESC"))
		         {
		        	 cr.addOrder(Order.desc(temp[0]));	 
		         }
	 Integer total_rec_count=cr.list().size();
	 Map session_map=ActionContext.getContext().getSession();
	 session_map.put("holding_count", total_rec_count);
	 cr.setFirstResult(startPageIndex);
	 cr.setMaxResults(numRecordsPerPage);



			list = cr.list();
		}catch(Exception ex){
			System.out.println("--- Error Inside dao.DaoWheelProduction displayDispatchWheel() methods catch block---");
			ex.printStackTrace();
		}finally{
			if(session!= null){
				System.out.println("--Inside dao.DaoWheelProduction displayDispatchWheel() methods finally Block--");
				session.close();
			}			
		}
		
	}
		return list;
	}
	public void addBogieProgress(BogiesetTransaction bogiesetTransaction) {
		Session session = null;
		
		 try{
			
			 session = HibernateConfig.getSession();
			 
			 session.save(bogiesetTransaction);
			 
			 //System.out.println("abnormality Id " + abnormality.getAbid());
			 session.beginTransaction().commit();
			 
		 }catch(Exception ex){
			 
			 ex.printStackTrace();
		 }finally{
			 
			 if(session != null){
				 session.close();
			 }
		 }
	}
	public void addBogieProgressAndUpdateWheel(BogiesetTransaction bogiesetTransaction,WheelsetTransaction wheelsetTransaction_newleft, WheelsetTransaction wheelsetTransaction_newright) {
		Session session = null;
		Transaction tx=null;
		
			 try{
				 session = HibernateConfig.getSession();
				 tx=session.beginTransaction();
			 
				 session.save(bogiesetTransaction);
				 if(wheelsetTransaction_newleft!=null){
				 session.update(wheelsetTransaction_newleft);
				 }
				 if(wheelsetTransaction_newright!=null){
				 session.update(wheelsetTransaction_newright);
				 }
				 
				 
				 tx.commit();
				 
			 }catch(Exception ex){
				 if(tx!=null)
				 {
					 tx.rollback();
				 }
				 ex.printStackTrace();
			 }finally{
				
				 if(session != null){
					 session.close();
				 }
			 }
	}
	
	public void updateBogieProgress(BogiesetTransaction bogiesetTransaction){
		Session session = null;
		
			 try{
				 session = HibernateConfig.getSession();
				 
			 
				 session.update(bogiesetTransaction);
				 
				 session.beginTransaction().commit();
				 
			 }catch(Exception ex){
				 
				 ex.printStackTrace();
			 }finally{
				
				 if(session != null){
					 session.close();
				 }
			 }
		}
	public void updateBogieAndWheelProgress(BogiesetTransaction bogiesetTransaction,WheelsetTransaction wheelsetTransaction_newleft, WheelsetTransaction wheelsetTransaction_newright,WheelsetTransaction wheelsetTransaction_oldleft, WheelsetTransaction wheelsetTransaction_oldright ){
		Session session = null;
		Transaction tx=null;
		
			 try{
				 session = HibernateConfig.getSession();
				 tx=session.beginTransaction();
			 
				 session.saveOrUpdate(bogiesetTransaction);
				 if(wheelsetTransaction_newleft!=null)   {session.update(wheelsetTransaction_newleft);}
				if(wheelsetTransaction_newright!=null){ session.update(wheelsetTransaction_newright); }
				if(wheelsetTransaction_oldleft!=null){ session.update(wheelsetTransaction_oldleft); }
				 if(wheelsetTransaction_oldright!=null) { session.update(wheelsetTransaction_oldright); }
				 tx.commit();
				 
			 }catch(Exception ex){
				 if(tx!=null)
				 {
					 tx.rollback();
				 }
				 ex.printStackTrace();
			 }finally{
				
				 if(session != null){
					 session.close();
				 }
			 }
		}
	
}
