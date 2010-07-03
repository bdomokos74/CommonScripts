package hu.astrid.timelog.action;

import com.opensymphony.xwork2.ActionSupport;
import hu.astrid.timelog.persistence.entity.Company;
import hu.astrid.timelog.persistence.entity.Team;
import hu.astrid.timelog.persistence.entity.TimeLogUser;
import org.apache.log4j.Logger;
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
public class InitAction extends AbstractPersistentAction {
    private static final Logger logger = Logger.getLogger(InitAction.class);

    @Action("/init")
    @Override
    public String execute() throws Exception {
        logger.info("InitAction execute called.");
        return SUCCESS;
    }
}
