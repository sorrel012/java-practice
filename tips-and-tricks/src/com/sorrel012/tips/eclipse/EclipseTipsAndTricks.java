package com.sorrel012.tips.eclipse;

class TestBean {
    private int i;
    private String str;
      
     
    public TestBean() {
	super();
	
    }

    public TestBean(int i, String str) {
	super();
	this.i = i;
	this.str = str;
    }
    
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + i;
	return result;
    }
    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	TestBean other = (TestBean) obj;
	if (i != other.i) {
	    return false;
	}
	return true;
    }
    /**
     * @return the i
     */
    public int getI() {
        return i;
    }
    /**
     * @param i the i to set
     */
    public void setI(int i) {
        this.i = i;
    }
    /**
     * @return the str
     */
    public String getStr() {
        return str;
    }
    /**
     * @param str the str to set
     */
    public void setStr(String str) {
        this.str = str;
    }
    
    
}


public class EclipseTipsAndTricks {

}
