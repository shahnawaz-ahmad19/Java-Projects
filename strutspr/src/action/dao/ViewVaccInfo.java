package action.dao;

public class ViewVaccInfo {
public String execute()
{
VaccinfoAction.getVaccInfo();
return "success";
}
}
