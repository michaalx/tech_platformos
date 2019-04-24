package lt.vu.usecases.cdi.security;

import lombok.Getter;
import lt.vu.auth.AdministratorValidity;
import lt.vu.auth.UserLoggedInValidity;

import javax.enterprise.inject.Model;

@Model
public class SecureBean {

    @Getter
    private String result = "Press the button!!!";

    @UserLoggedInValidity
    public void tikPrisijungusiems() {
        result = "Buvo iškviestas metodas skirtas tik prisijungusiems.";
    }

    @AdministratorValidity
    public void tikAdminams() {
        result = "Buvo iškviestas metodas skirtas tik adminams.";
    }
}
