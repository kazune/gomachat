package jp.kazune.gomachat.vo;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

@ManagedBean
@SessionScoped
@Named
public class GomaChatData {
	protected List<GomaChatDataItem> itemList = new ArrayList<GomaChatDataItem>();

	public List<GomaChatDataItem> getItemList() {
		if (itemList.size() == 0) {
			itemList.add(new GomaChatDataItem());
			itemList.add(new GomaChatDataItem());
			itemList.add(new GomaChatDataItem());
		}

		return itemList;
	}
}
