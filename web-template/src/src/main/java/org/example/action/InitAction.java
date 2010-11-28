package org.example.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

/**
 * Created by IntelliJ IDEA.
 * User: bds
 * Date: Jun 21, 2010
 * Time: 2:23:04 PM
 */
@Results(value = {
        @Result(name = ActionSupport.SUCCESS, location = "main", type = "tiles"),
        @Result(name = ActionSupport.INPUT, location = "todo"),
        @Result(name = ActionSupport.ERROR, location = "todo")
})
public class InitAction extends ActionSupport {

    @Action("/init")
    @Override
    public String execute() throws Exception {        
        return SUCCESS;
    }
}
