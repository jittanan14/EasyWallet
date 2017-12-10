package com.gwamelody.easywallet.Model;

/**
 * Created by Gwa Melody on 10/12/2560.
 */

public class incom {
private String detail;
private int number;
public incom(){


}
    public incom(String detail, int number) {
        this.detail = detail;
        this.number = number;
    }

    public String getDetail() {
        return detail;
    }

    public int getNumber() {
        return number;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
