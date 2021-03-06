package jp.kazune.gomachat.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

@ManagedBean
@SessionScoped
@Named
public class GomaChatDataItem {
	protected String iconPath = "http://www.yuyushiki.net/core_sys/images/main/cont/chara/chara_navi2.gif";

	protected String userName = "haramura";

	protected String chatText = null;

	protected Date chatDate = new Date();

	public Date getChatDate() {
		return chatDate;
	}

	public String getChatDateText() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(chatDate);
	}

	public void setChatDate(Date chatDate) {
		this.chatDate = chatDate;
	}

	public String getChatText() {
		return chatText;
	}

	public void setChatText(String chatText) {
		this.chatText = chatText;
	}

	public String getIconPath() {
		return iconPath;
	}

	public void setIconPath(String iconPath) {
		this.iconPath = iconPath;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public synchronized void submit() {
		if (getChatText() == null || getChatText().length() == 0) {
			// 文字入っていなかったら何もしない。
			return;
		}

		GomaChatDataItem newItem = new GomaChatDataItem();
		newItem.setIconPath(getIconPath());
		newItem.setUserName(getUserName());
		newItem.setChatText(getChatText());
		newItem.setChatDate(new Date());
		GomaChatData.getStaticItemList().add(0, newItem);

		setChatText(null);
	}
}
