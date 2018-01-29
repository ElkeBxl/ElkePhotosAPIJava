package photos.elke.api.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;
import photos.elke.api.model.Photo;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class StubPhotoRepositoryTests {

    private StubPhotoRepository repository;

    public StubPhotoRepositoryTests() {
        this.repository = new StubPhotoRepositoryImpl();
    }

    @Test
    public void contexLoads() throws Exception {
        assertThat(this.repository).isNotNull();
    }

    @Test
    public void canAddNewPhoto() throws Exception {
        long currentCount = this.repository.count();
        this.repository.save(new Photo(4));
        assertThat(this.repository.count()).isEqualTo(currentCount + 1);
    }

    @Test
    public void canAddMultiplePhotos() throws Exception {
        long currentCount = this.repository.count();
        List<Photo> newPhotos = new ArrayList<Photo>();
        newPhotos.add(new Photo(5));
        newPhotos.add(new Photo(6));
        newPhotos.add(new Photo(7));
        this.repository.saveAll(newPhotos);
        assertThat(this.repository.count()).isEqualTo(currentCount + 3);
    }
}
