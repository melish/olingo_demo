package edw.olingo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "informea_meetings")
public class Meeting {

	@Id
	@Column(name = "id")
	private int id;

	private String treaty;
	private String url;
	@Temporal(TemporalType.TIMESTAMP)
	private Date start;

	@Temporal(TemporalType.TIMESTAMP)
	private Date end;

	private String repetition;
	private String kind;
	private String type;
	private String access;
	private String status;
	private String imageUrl;
	private String imageCopyright;
	private String location;
	private String city;
	private String country;
	private Double latitude;
	private Double longitude;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updated;

//	@OneToOne(mappedBy="meeting", fetch=FetchType.EAGER)
//	@JoinColumn(name="id", referencedColumnName="meeting_id", updatable=false, nullable=true)
//	private MeetingTitle meetingTitle;

	
	@OneToMany(mappedBy = "meeting", cascade = CascadeType.ALL)
	private List<MeetingTitle> titles = new ArrayList<MeetingTitle>();

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTreaty() {
		return treaty;
	}

	public void setTreaty(String treaty) {
		this.treaty = treaty;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public String getRepetition() {
		return repetition;
	}

	public void setRepetition(String repetition) {
		this.repetition = repetition;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getImageCopyright() {
		return imageCopyright;
	}

	public void setImageCopyright(String imageCopyright) {
		this.imageCopyright = imageCopyright;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public List<MeetingTitle> getTitles() {
		return titles;
	}

	public void setTitles(List<MeetingTitle> titles) {
		this.titles = titles;
	}

//	public MeetingTitle getMeetingTitle() {
//		return meetingTitle;
//	}
//
//	public void setMeetingTitle(MeetingTitle meetingTitle) {
//		this.meetingTitle = meetingTitle;
//	}

}
