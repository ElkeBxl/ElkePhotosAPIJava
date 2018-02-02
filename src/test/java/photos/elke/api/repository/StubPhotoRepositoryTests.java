package photos.elke.api.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import photos.elke.api.model.Photo;

import java.util.ArrayList;
import java.util.Iterator;
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
        // arrange
        long currentCount = this.repository.count();

        // act
        this.repository.save(new Photo(4));

        // assert
        assertThat(this.repository.count()).isEqualTo(currentCount + 1);
    }

    @Test
    public void canAddMultiplePhotos() throws Exception {
        // arrange
        long currentCount = this.repository.count();
        List<Photo> newPhotos = new ArrayList<Photo>();
        newPhotos.add(new Photo(5));
        newPhotos.add(new Photo(6));
        newPhotos.add(new Photo(7));

        // act
        this.repository.saveAll(newPhotos);

        // assert
        assertThat(this.repository.count()).isEqualTo(currentCount + 3);
    }

    @Test
    public void canFindPhotoById() throws Exception {
        this.repository.save(new Photo(8));
        assertThat(this.repository.findById(8)).isNotEmpty();
    }

    @Test
    public void canFindNothingForUnknownPhotoId() throws Exception {
        assertThat(this.repository.findById(999)).isEmpty();
    }

    @Test
    public void canTestExistenceOfPhoto() throws Exception {
        this.repository.save(new Photo(9));
        assertThat(this.repository.existsById(9)).isTrue();
    }

    @Test
    public void canTestNonExistenceOfPhoto() throws Exception {
        assertThat(this.repository.existsById(999)).isFalse();
    }

    @Test
    public void canFindAllPhotos() throws Exception {
        // arrange
        List<Photo> photos = new ArrayList<Photo>();
        photos.add(new Photo(1));
        photos.add(new Photo(2));
        photos.add(new Photo(3));
        this.repository.saveAll(photos);

        // act
        Iterable<Photo> found = this.repository.findAll();

        // assert
        Iterator it = found.iterator();
        for (int i = 1; i <= 3; i++) {
            assertThat(it.hasNext()).isTrue();
            Photo current = (Photo) it.next();
            assertThat(current.Id == i);
        }
    }

    @Test
    public void canFindAllPhotosById() throws Exception {
        // arrange
        List<Photo> photos = new ArrayList<Photo>();
        photos.add(new Photo(1));
        photos.add(new Photo(2));
        photos.add(new Photo(3));
        this.repository.saveAll(photos);

        // act
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        Iterable<Photo> found = this.repository.findAllById(ids);

        // assert
        Iterator it = found.iterator();
        for (int i = 1; i <= 2; i++) {
            assertThat(it.hasNext()).isTrue();
            Photo current = (Photo) it.next();
            assertThat(current.Id == i);
        }
    }

    @Test
    public void canCountPhotos() throws Exception {
        // arrange
        List<Photo> photos = new ArrayList<Photo>();
        photos.add(new Photo(1));
        photos.add(new Photo(2));
        photos.add(new Photo(3));
        this.repository.saveAll(photos);

        // act
        long amount = this.repository.count();

        // assert
        assertThat(amount).isEqualTo(3);
    }
}