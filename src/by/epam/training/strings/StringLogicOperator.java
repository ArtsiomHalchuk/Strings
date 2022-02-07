package by.epam.training.strings;

public class StringLogicOperator {
	String originText;
	String result;
	
	public StringLogicOperator(String originText) {
		this.originText=originText;
	}
	
	
	
	public String removeSpaces () {
		result=originText.trim().replaceAll(" +", " ");
		return result;
	}
	
	public int CountWords() {
		result=originText.trim();
		String[] words = result.split("\\s+");
		return words.length;
	}
	
	public String replaceSubstring(String find, String replaceWith) {
		
		result = originText.replace(find, replaceWith);
		return result;
	}

	public String getOriginlText() {
		return originText;
	}

	public void setOriginlText(String originlText) {
		this.originText = originlText;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "StringLogicOperator [originlText=" + originText + ", result=" + result + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((originText == null) ? 0 : originText.hashCode());
		result = prime * result + ((this.result == null) ? 0 : this.result.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StringLogicOperator other = (StringLogicOperator) obj;
		if (originText == null) {
			if (other.originText != null)
				return false;
		} else if (!originText.equals(other.originText))
			return false;
		if (result == null) {
			if (other.result != null)
				return false;
		} else if (!result.equals(other.result))
			return false;
		return true;
	}
	
	

}
