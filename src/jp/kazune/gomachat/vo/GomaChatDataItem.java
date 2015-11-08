package jp.kazune.gomachat.vo;

public class GomaChatDataItem {
	protected String iconPath = "http://www.yuyushiki.net/core_sys/images/main/cont/chara/chara_navi2.gif";

	protected String userName = "haramura";

	protected String chatText = "いつか、鳥になりたい・・・・unk";

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
}
