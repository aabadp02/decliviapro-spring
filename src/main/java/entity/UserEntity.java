package entity;

import dao.Interface.IUserDao;
import entity.IBaseEntity.IBaseEntity;
import org.springframework.beans.factory.annotation.Required;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Entidad para la clase usuarios que persistirá en la base de datos
 */

@Entity
@Table(name="Users")
public class UserEntity implements IBaseEntity<Integer> {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = IUserDao.COLUMN_USER_NICK, nullable = false)
    private String nick;

    @Column(name = IUserDao.COLUMN_USER_EMAIL)
    private String email;

    @Column(name = IUserDao.COLUMN_USER_PASSWORD, nullable = false)
    private String password;

    @Column(name= IUserDao.COLUMN_USER_CREATIONDATE)
    private LocalDateTime creationDate;

    public UserEntity(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public Integer givePK() {
        return this.id;
    }
}
