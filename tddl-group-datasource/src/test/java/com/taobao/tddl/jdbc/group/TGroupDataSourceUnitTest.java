/*(C) 2007-2012 Alibaba Group Holding Limited.	

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.PrintWriter;
import java.sql.Connection;
/**
 * 
 * @author yangzhu
 *
 */
public class TGroupDataSourceUnitTest {

	@Test
	public void javax_sql_DataSource_api_support() throws Exception {
		TGroupDataSource ds = new TGroupDataSource();
		assertEquals(ds.getLoginTimeout(), 0);
		assertEquals(ds.getLogWriter(), null);
		PrintWriter writer = new PrintWriter(System.out);
		ds.setLoginTimeout(100);
		ds.setLogWriter(writer);
		assertEquals(ds.getLoginTimeout(), 100);
		assertEquals(ds.getLogWriter(), writer);
		
		Connection conn = ds.getConnection();
		assertTrue((conn instanceof TGroupConnection));
		
		conn = ds.getConnection("username", "password");
		//assertTrue((conn instanceof TGroupConnection));
	}
}