package entity.IBaseEntity;

/**
 * Interfaz de entidad base que implementan todas las entidades
 */

public interface IBaseEntity<PK> {

    PK givePK();
}
