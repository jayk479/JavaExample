package work230403;

public class PortableNotebook implements Notebook, Tablet{
	
	private int mode;
	private String video;
	private String app;
	private String doc;
	private String browser;
	
	public void ProtableNotebook() {
		this.
	}

	@Override
	public void watchVideo() {
		System.out.println(video+"를 시청");
	}

	@Override
	public void useApp() {
		if(mode == NOTEBOOK_MODE) {
			mode = TABLET_MODE;
			System.out.println(app+"를 실행");
		}else if(mode == TABLET_MODE) {
			System.out.println(app+"를 실행");
		}
		
	}

	@Override
	public void writeDocumentaion() {
		
		System.out.println(doc + "을 통해 문서를 작성");
	}

	@Override
	public void searchInternet() {
		
		System.out.println(browser+"를 통해 인터넷을 검색");
	}
	
	public void changeMode() {
		if(mode == NOTEBOOK_MODE) {
			mode = TABLET_MODE;
			System.out.println("TABLET_MODE");
		}else if(mode == TABLET_MODE) {
			mode = NOTEBOOK_MODE;
			System.out.println("NOTEBOOK_MODE");
		}
	}

}
