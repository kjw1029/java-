
public class DocumentsShelf {
	private Documents documents10;
	private Documents documents9;
	private Documents documents8;
	private Documents documents7;
	private Documents gar;
	
	
	public Documents getDocuments10() {
		return documents10;
	}
	public Documents getDocuments9() {
		return documents9;
	}
	public Documents getDocuments8() {
		return documents8;
	}
	public Documents getDocuments7() {
		return documents7;
	}
	public void setDocuments10(Documents documents10) {
		if(documents10.getImpo() >= 5) {
		this.documents10 = documents10;
		} else { 
			return;
		}
	}
	public void setDocuments9(Documents documents9) {
		if(documents9.getImpo() >= 4) {
			this.gar = this.documents9;
			this.documents9 = documents9;
			if(this.gar.getImpo() >= 5) {
			this.documents10 = this.gar; 
			} return;
		} else {
			return;
		}
	}
	public void setDocuments8(Documents documents8) {
		if(documents8.getImpo() >= 3) {
			this.gar = this.documents8;
			this.documents8 = documents8;
			if(this.gar.getImpo() >= 4) {
				this.documents9 = this.gar; 
				} return; 
		} else {
			return;
		}
	}
	public void setDocuments7(Documents documents7) {
		if(documents7.getImpo() >= 2) {
			this.gar = this.documents7;
			this.documents7 = documents7;
			if(this.gar.getImpo() >= 3) {
				this.documents8 = this.gar; 
				} return;
		} else {
			return;
		}
	}
	public Documents getGar() {
		return gar;
	}
	public void setGar(Documents gar) {
		this.gar = gar;
	}
	
}