package photos.elke.api.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import photos.elke.api.model.Photo;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Repository
public class JSONPhotoRepositoryImpl implements JSONPhotoRepository {

    private List<Photo> photos;

    public JSONPhotoRepositoryImpl() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("project365.json").getFile());
        ObjectMapper jsonMapper = new ObjectMapper();
        this.photos = jsonMapper.readValue(file, new TypeReference<List<Photo>>() { });
    }

    @Override
    public <S extends Photo> S save(S s) {
        return null;
    }

    @Override
    public <S extends Photo> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Photo> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Photo> findAll() {
        return this.photos;
    }

    @Override
    public Iterable<Photo> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Photo photo) {

    }

    @Override
    public void deleteAll(Iterable<? extends Photo> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}