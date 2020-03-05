package org.pgi;

import java.util.ArrayList;

public class Banks {
    private String bankname;
    private ArrayList<Branch> branches;

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public Banks(String bankname, ArrayList<Branch> branches) {
        this.bankname = bankname;
        this.branches = branches;
    }
}
