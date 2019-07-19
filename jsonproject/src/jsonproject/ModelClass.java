package jsonproject;

import java.util.ArrayList;
import java.util.List;

public class ModelClass {

	private String pvName;
	private String pvPassWord;
	public String pbNoSetGetMethod;
	public int pbInt =1;
	public long pbLong=200000;
	public double pbDouble=3.14;
	public boolean pbBool=true;
	public Integer pbInteger =2;
	public Long pbLongOb=3000000l;
	public Double pbDoubleOb=343.34234324;
	public Boolean pbBoolean = true;
	public SubClass pbSubClass = new SubClass();
	private final String pvfinalString = "StrValue";
	private List<SubModelClass> sbModelList = new ArrayList<SubModelClass>();
	
	public ModelClass() {
		super();
		sbModelList.add(new SubModelClass());
	}

	public String getPvName() {
		return pvName;
	}

	public void setPvName(String pvName) {
		this.pvName = pvName;
	}

	public String getPvPassWord() {
		return pvPassWord;
	}

	public void setPvPassWord(String pvPassWord) {
		this.pvPassWord = pvPassWord;
	}

	class SubClass{
		private String subPvName = "subPvName value";
		private String subPvPassWord = "subPvPassWord";
	}

	class SubModelClass{
		String sbStr = "subModelClass";
	}
	
}
