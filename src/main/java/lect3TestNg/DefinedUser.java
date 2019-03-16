package lect3TestNg;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

public class DefinedUser {
    private UUID uuid;
    private String fullName;
    private Date convertedDate;

    public DefinedUser() {
    }

    public DefinedUser(UUID uuid, String fullName, Date convertedDate) {
        this.uuid = uuid;
        this.fullName = fullName;
        this.convertedDate = convertedDate;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getConvertedDate() {
        return convertedDate;
    }

    public void setConvertedDate(Date convertedDate) {
        this.convertedDate = convertedDate;
    }

    @Override
    public String toString() {
        return "DefinedUser{" +
                "uuid=" + uuid +
                ", fullName='" + fullName + '\'' +
                ", convertedDate=" + convertedDate +
                '}';
    }
}
