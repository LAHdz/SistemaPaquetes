package sistemapaquetes.dao.puntocontrol;

import sistemapaquetes.dao.CRUD;
import sistemapaquetes.model.PuntoControl;

/**
 *
 * @author asael
 */
public interface PuntoControlDAO extends CRUD<PuntoControl>{
    public PuntoControl getPuntoControl(int numPC, int idRuta);
}
