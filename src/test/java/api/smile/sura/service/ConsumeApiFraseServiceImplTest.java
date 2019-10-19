package api.smile.sura.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import com.test.smile.api.domain.DatosSmile;
import com.test.smile.api.service.ConsumeApiFraseServiceImpl;

public class ConsumeApiFraseServiceImplTest {
	
	private ConsumeApiFraseServiceImpl consumeApiFraseServiceImpl;
	
	@Before
    public void setUp() {
        // With this call to initMocks we tell Mockito to process the annotations
        MockitoAnnotations.initMocks(this);
        consumeApiFraseServiceImpl = new ConsumeApiFraseServiceImpl();
    }
	
	
	@Test
    public void createApiFoto() {
		DatosSmile urlFoto = consumeApiFraseServiceImpl.consumeApiFrase();

        assertThat(urlFoto).isEqualTo("Hola Manuel, \n esta es la frase");
        
    }
 

}
