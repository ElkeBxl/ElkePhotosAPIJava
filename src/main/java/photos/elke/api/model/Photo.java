package photos.elke.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Photo {

    @JsonIgnore
    public int Id;

    @JsonProperty("projectday")
    public Integer ProjectDay;

    @JsonProperty("day")
    public Integer Day;

    @JsonProperty("month")
    public Integer Month;

    @JsonProperty("year")
    public Integer Year;

    @JsonProperty("description")
    public String Description;

    @JsonProperty("exposure")
    public String Exposure;

    @JsonProperty("aperture")
    public String Aperture;

    @JsonProperty("focallength")
    public Integer Focallength;

    @JsonProperty("fisheye")
    public Boolean Fisheye;

    @JsonProperty("iso")
    public Integer ISO;

    @JsonProperty("orientation")
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
