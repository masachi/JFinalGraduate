package common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAddress<M extends BaseAddress<M>> extends Model<M> implements IBean {

	public void setAddressID(String addressID) {
		set("addressID", addressID);
	}

	public String getAddressID() {
		return get("addressID");
	}

	public void setUserID(String userID) {
		set("userID", userID);
	}

	public String getUserID() {
		return get("userID");
	}

	public void setMoblie(String moblie) {
		set("moblie", moblie);
	}

	public String getMoblie() {
		return get("moblie");
	}

	public void setName(String name) {
		set("name", name);
	}

	public String getName() {
		return get("name");
	}

	public void setAddress(String address) {
		set("address", address);
	}

	public String getAddress() {
		return get("address");
	}

}
