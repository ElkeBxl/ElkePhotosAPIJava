package photos.elke.api.model;

public class Photo {

    public int Id;

    public String Name;

    public Photo(int id) {
        this.Id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Photo)) {
            return false;
        }
        return this.Id == ((Photo) obj).Id;
    }
}
