package doip.library.message;

import static doip.junit.Assert.*;

import org.junit.Test;

import doip.library.util.Conversion;

public class TestDoipTcpAliveCheckResponse {

	@Test
	public void test() {
		DoipTcpAliveCheckResponse msg = new DoipTcpAliveCheckResponse(0x1234);
		String hexString = Conversion.byteArrayToHexString(msg.getMessage());
		assertEquals("02 FD 00 08 00 00 00 02 12 34", hexString);
	}

}
