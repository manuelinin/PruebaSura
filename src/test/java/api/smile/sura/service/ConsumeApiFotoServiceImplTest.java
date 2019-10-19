package api.smile.sura.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import com.test.smile.api.service.ConsumeApiFotoServiceImpl;




public class ConsumeApiFotoServiceImplTest {
	
	
	private ConsumeApiFotoServiceImpl consumeApiFotoServiceImpl;
	
	
	 @Before
	    public void setUp() {
	        // With this call to initMocks we tell Mockito to process the annotations
	        MockitoAnnotations.initMocks(this);
	        consumeApiFotoServiceImpl = new ConsumeApiFotoServiceImpl();
	    }
	 
	 
	    @Test
	    public void createApiFoto() {
	        String urlFoto = consumeApiFotoServiceImpl.consumeApiFoto();

	        assertThat(urlFoto).isEqualTo("Hola Manuel, \n esta es la URL de la foto");
	        
	    }

}
