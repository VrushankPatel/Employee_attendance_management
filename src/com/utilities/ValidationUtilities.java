package com.utilities;
import com.mysql.cj.util.StringUtils;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class ValidationUtilities {
    private final Pattern pattern;
    public ValidationUtilities() {
        pattern = Pattern.compile("^(?!.* )(?=.*[@$!%*#?&])(?=.*\\d)(?=.*[A-Z]).{8,15}$");
    }    
    public boolean validateUserNameAndPassword(String str[]){
        for(String s : str){
            if(!pattern.matcher(s).matches()){
                return false;
            }            
        }
        return true;
    }
    
    public boolean validateEmployee(String name,String address,String id,String phone){        
        return  StringUtils.isStrictlyNumeric(phone) && StringUtils.isStrictlyNumeric(id) && name.length() <= 100 && address.length() <= 250 && id.length() == 10 && phone.length() == 10;        
    }
    public boolean validateEmployeeId(String Id){
        return Id.length() == 10;
    }
    public long getWorkingDays(final LocalDate start, final LocalDate end) {
        final long days = ChronoUnit.DAYS.between(start, end);
        long result = days - 2*(days/7);
        result -= (days % 7 != 0 && start.getDayOfWeek().getValue()==7 || end.getDayOfWeek().getValue() == 7 || end.getDayOfWeek().getValue() < start.getDayOfWeek().getValue()) ? 1 : 0;            
        return result;
    }
    public long getTotalDays(Date date1,Date date2){        
        long diff = date2.getTime() - date1.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
}
