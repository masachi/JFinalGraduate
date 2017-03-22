package common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseItemdetail<M extends BaseItemdetail<M>> extends Model<M> implements IBean {

	public void setItemDetailID(String itemDetailID) {
		set("itemDetailID", itemDetailID);
	}

	public String getItemDetailID() {
		return get("itemDetailID");
	}

	public void setNumber(String number) {
		set("number", number);
	}

	public String getNumber() {
		return get("number");
	}

	public void setItemName(String itemName) {
		set("itemName", itemName);
	}

	public String getItemName() {
		return get("itemName");
	}

	public void setPrice(Double price) {
		set("price", price);
	}

	public Double getPrice() {
		return get("price");
	}

}