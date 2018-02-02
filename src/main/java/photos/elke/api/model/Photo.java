package photos.elke.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Photo {

    @JsonIgnore
    public int Id;

    public Integer ProjectDay;

    public Integer Day;

    public Integer Month;

    public Integer Year;

    public String Description;

    public String Exposure;

    public String Aperture;

    public Integer Focallength;

    public Boolean Fisheye;

    public Integer ISO;

    public Integer Orientation;

    public Photo() {

    }

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
