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
	/**
	 * チャットのデータの一覧
	 */
	protected List<GomaChatDataItem> itemList = new ArrayList<GomaChatDataItem>();

	/**
	 * チャットのデータ一覧をゲットする。
	 * 
	 * @return
	 */
	public List<GomaChatDataItem> getItemList() {
		/**
		 * とりあえずで、ダミーなハードコードデータ
		 */
		if (itemList.size() == 0) {
			{
				final GomaChatDataItem item = new GomaChatDataItem();
				itemList.add(item);
				item.setIconPath("http://www.yuyushiki.net/core_sys/images/main/cont/chara/chara_navi2.gif");
				item.setUserName("haramuraUNK");
				item.setChatText("いつか、鳥になりたい・・・・unk");
			}

			{
				final GomaChatDataItem item = new GomaChatDataItem();
				itemList.add(item);
				item.setIconPath("http://www.yuyushiki.net/core_sys/images/main/cont/chara/chara_navi2.gif");
				item.setUserName("haramuraUNK");
				item.setChatText("いつか、AHOになりたい・・・・unk");
			}

			{
				final GomaChatDataItem item = new GomaChatDataItem();
				itemList.add(item);
				item.setIconPath("http://www.yuyushiki.net/core_sys/images/main/cont/chara/chara_navi2.gif");
				item.setUserName("haramuraUNK");
				item.setChatText("いつか、IMKになりたい・・・・unk");
			}
		}

		return itemList;
	}
}
