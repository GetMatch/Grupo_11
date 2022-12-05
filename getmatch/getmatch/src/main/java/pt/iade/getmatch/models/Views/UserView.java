package pt.iade.getmatch.models.Views;

import java.time.LocalDate;

public interface UserView {

    long getId();
    String getName();
    LocalDate getbDate();
    String getEmail();
    String getPass();

}
