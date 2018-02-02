package photos.elke.api.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class JSONPhotoRepositoryTests {

    @Autowired
    private JSONPhotoRepository repository;

    public JSONPhotoRepositoryTests() {
        //this.repository = new JSONPhotoRepositoryImpl();
    }

    @Test
    public void contextLoads() throws Exception {
        assertThat(this.repository).isNotNull();
    }

    @Test
    public void canFindAllPhotos() throws Exception {

    }
}