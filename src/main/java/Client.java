
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class Client {
	static SessionFactory sessionFactory=null;
	public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
            	StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
            	Metadata metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build();
            	sessionFactory= metaData.getSessionFactoryBuilder().build();
            	//System.out.println("returnsed session factory");
            	return sessionFactory;
            	
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
       return sessionFactory;
	}

/*	
	Session s = sessionFactory.openSession();
	Transaction t=s.beginTransaction();
	User s1=new User ();
	s1.setId(1);
	s1.setName("yachaan");
	s.save(s1);
	t.commit();
	s.close();
	*/
	
}			
