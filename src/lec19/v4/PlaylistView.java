package lec19.v4;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlaylistView extends JPanel implements Observer {

	private Playlist plist;
	private JPanel list_panel;
	
	public PlaylistView(Playlist plist) {
		this.plist = plist;
		plist.addObserver(this);
		
		setLayout(new BorderLayout());

		list_panel = new JPanel();
		list_panel.setLayout(new GridLayout(0,1));
		for (Song s : plist.getSongs()) {
			JLabel song_label = new JLabel(s.toString());
			list_panel.add(song_label);
		}		
		add(list_panel, BorderLayout.CENTER);
		
		AddSongWidget add_song_widget = new AddSongWidget(plist);
		add(add_song_widget, BorderLayout.SOUTH);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		list_panel.removeAll();
		for (Song s : plist.getSongs()) {
			JLabel song_label = new JLabel(s.toString());
			list_panel.add(song_label);
		}
		list_panel.revalidate();
	}
}
