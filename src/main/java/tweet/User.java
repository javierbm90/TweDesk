package tweet;

public class User {
	
	long id;
	String id_str;
	String name;
	String screen_name;
	String profile_location;
	String location;
	String description;
	String url;
	UserEntity entities;
	
	//boolean protected; //protected -> reserved word
	int followers_count;
	int friends_count;
	int listed_count;
	String created_at; //Formatted date
	int favourites_count;
	int utc_offset; //in seconds
	String time_zone;
	boolean geo_enabled;
	boolean verified;
	int statuses_count;
	String lang; //short format, local language: spanish -> "es"
	Tweet status; //Last tweet or retweet
	
	boolean contributors_enabled;
	boolean is_translator;
	boolean is_translator_enabled;

    String profile_background_color; //HEX: "000000"
    String profile_background_image_url;
    String profile_background_image_url_https;
    boolean profile_background_tile;
    String profile_image_url;
    String profile_image_url_https;
    String profile_banner_url;
    String profile_link_color;
    String profile_sidebar_border_color;
    String profile_sidebar_fill_color;
    String profile_text_color;
    boolean profile_use_background_image;
    boolean has_extended_profile;
    boolean default_profile;
    boolean default_profile_image;
    
    boolean following;
    boolean follow_request_sent;
    boolean notifications;
    boolean suspended;
    boolean need_phone_verification;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getId_str() {
		return id_str;
	}
	public void setId_str(String id_str) {
		this.id_str = id_str;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getScreen_name() {
		return screen_name;
	}
	public void setScreen_name(String screen_name) {
		this.screen_name = screen_name;
	}
	public String getProfile_location() {
		return profile_location;
	}
	public void setProfile_location(String profile_location) {
		this.profile_location = profile_location;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public UserEntity getEntities() {
		return entities;
	}
	public void setEntities(UserEntity entities) {
		this.entities = entities;
	}
	public int getFollowers_count() {
		return followers_count;
	}
	public void setFollowers_count(int followers_count) {
		this.followers_count = followers_count;
	}
	public int getFriends_count() {
		return friends_count;
	}
	public void setFriends_count(int friends_count) {
		this.friends_count = friends_count;
	}
	public int getListed_count() {
		return listed_count;
	}
	public void setListed_count(int listed_count) {
		this.listed_count = listed_count;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public int getFavourites_count() {
		return favourites_count;
	}
	public void setFavourites_count(int favourites_count) {
		this.favourites_count = favourites_count;
	}
	public int getUtc_offset() {
		return utc_offset;
	}
	public void setUtc_offset(int utc_offset) {
		this.utc_offset = utc_offset;
	}
	public String getTime_zone() {
		return time_zone;
	}
	public void setTime_zone(String time_zone) {
		this.time_zone = time_zone;
	}
	public boolean isGeo_enabled() {
		return geo_enabled;
	}
	public void setGeo_enabled(boolean geo_enabled) {
		this.geo_enabled = geo_enabled;
	}
	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}
	public int getStatuses_count() {
		return statuses_count;
	}
	public void setStatuses_count(int statuses_count) {
		this.statuses_count = statuses_count;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public Tweet getStatus() {
		return status;
	}
	public void setStatus(Tweet status) {
		this.status = status;
	}
	public boolean isContributors_enabled() {
		return contributors_enabled;
	}
	public void setContributors_enabled(boolean contributors_enabled) {
		this.contributors_enabled = contributors_enabled;
	}
	public boolean isIs_translator() {
		return is_translator;
	}
	public void setIs_translator(boolean is_translator) {
		this.is_translator = is_translator;
	}
	public boolean isIs_translator_enabled() {
		return is_translator_enabled;
	}
	public void setIs_translator_enabled(boolean is_translator_enabled) {
		this.is_translator_enabled = is_translator_enabled;
	}
	public String getProfile_background_color() {
		return profile_background_color;
	}
	public void setProfile_background_color(String profile_background_color) {
		this.profile_background_color = profile_background_color;
	}
	public String getProfile_background_image_url() {
		return profile_background_image_url;
	}
	public void setProfile_background_image_url(String profile_background_image_url) {
		this.profile_background_image_url = profile_background_image_url;
	}
	public String getProfile_background_image_url_https() {
		return profile_background_image_url_https;
	}
	public void setProfile_background_image_url_https(String profile_background_image_url_https) {
		this.profile_background_image_url_https = profile_background_image_url_https;
	}
	public boolean isProfile_background_tile() {
		return profile_background_tile;
	}
	public void setProfile_background_tile(boolean profile_background_tile) {
		this.profile_background_tile = profile_background_tile;
	}
	public String getProfile_image_url() {
		return profile_image_url;
	}
	public void setProfile_image_url(String profile_image_url) {
		this.profile_image_url = profile_image_url;
	}
	public String getProfile_image_url_https() {
		return profile_image_url_https;
	}
	public void setProfile_image_url_https(String profile_image_url_https) {
		this.profile_image_url_https = profile_image_url_https;
	}
	public String getProfile_banner_url() {
		return profile_banner_url;
	}
	public void setProfile_banner_url(String profile_banner_url) {
		this.profile_banner_url = profile_banner_url;
	}
	public String getProfile_link_color() {
		return profile_link_color;
	}
	public void setProfile_link_color(String profile_link_color) {
		this.profile_link_color = profile_link_color;
	}
	public String getProfile_sidebar_border_color() {
		return profile_sidebar_border_color;
	}
	public void setProfile_sidebar_border_color(String profile_sidebar_border_color) {
		this.profile_sidebar_border_color = profile_sidebar_border_color;
	}
	public String getProfile_sidebar_fill_color() {
		return profile_sidebar_fill_color;
	}
	public void setProfile_sidebar_fill_color(String profile_sidebar_fill_color) {
		this.profile_sidebar_fill_color = profile_sidebar_fill_color;
	}
	public String getProfile_text_color() {
		return profile_text_color;
	}
	public void setProfile_text_color(String profile_text_color) {
		this.profile_text_color = profile_text_color;
	}
	public boolean isProfile_use_background_image() {
		return profile_use_background_image;
	}
	public void setProfile_use_background_image(boolean profile_use_background_image) {
		this.profile_use_background_image = profile_use_background_image;
	}
	public boolean isHas_extended_profile() {
		return has_extended_profile;
	}
	public void setHas_extended_profile(boolean has_extended_profile) {
		this.has_extended_profile = has_extended_profile;
	}
	public boolean isDefault_profile() {
		return default_profile;
	}
	public void setDefault_profile(boolean default_profile) {
		this.default_profile = default_profile;
	}
	public boolean isDefault_profile_image() {
		return default_profile_image;
	}
	public void setDefault_profile_image(boolean default_profile_image) {
		this.default_profile_image = default_profile_image;
	}
	public boolean isFollowing() {
		return following;
	}
	public void setFollowing(boolean following) {
		this.following = following;
	}
	public boolean isFollow_request_sent() {
		return follow_request_sent;
	}
	public void setFollow_request_sent(boolean follow_request_sent) {
		this.follow_request_sent = follow_request_sent;
	}
	public boolean isNotifications() {
		return notifications;
	}
	public void setNotifications(boolean notifications) {
		this.notifications = notifications;
	}
	public boolean isSuspended() {
		return suspended;
	}
	public void setSuspended(boolean suspended) {
		this.suspended = suspended;
	}
	public boolean isNeed_phone_verification() {
		return need_phone_verification;
	}
	public void setNeed_phone_verification(boolean need_phone_verification) {
		this.need_phone_verification = need_phone_verification;
	}
    	
}
