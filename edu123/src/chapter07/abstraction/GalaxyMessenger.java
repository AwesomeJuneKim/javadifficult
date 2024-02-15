package chapter07.abstraction;

public class GalaxyMessenger implements Messenger, WorkFile {

	@Override
	public void fileUpload() {
		// TODO Auto-generated method stub
		System.out.println("파일을 업로드 합니다.");
	}

	@Override
	public void fileDownload() {
		// TODO Auto-generated method stub
		System.out.println("파일을 다운로드 합니다.");
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "galaxy";
	}

	@Override
	public void setMessage(String msg) {	
		// TODO Auto-generated method stub
		System.out.println("galaxy에서 메세지를 설정합니다:"+msg);
		//질문:String msg가 뭘 불러오는거지?
	}
	public void ChangeKeyboard() {
		System.out.println("키보드아이콘 터치 후 키보드를 변경합니다.");
	}

	

}
