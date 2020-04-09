package test;

import static org.junit.Assert.assertEquals;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;

public class JMockTest {
	private Mockery context = new Mockery();
	private IData iData = null;
	private OutHotel oh = null;
	
	@Before
	public void setUp() throws Exception{
		//yongMockery实例来构造一个模拟的IData对象
		iData = context.mock(IData.class);
		oh = new OutHotel(iData);
		context.checking(new Expectations() {{
			oneOf(iData).in_out_room(701,"EMPTY");
			will(returnValue("701退房成功！"));	
		}});	
	}
	@Test
	public void testOut() {
		assertEquals("701退房成功！",oh.out(701));
		System.out.println("jmock测试");
		System.out.println(1/0);
	}
	
}
