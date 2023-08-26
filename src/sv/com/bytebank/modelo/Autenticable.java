package sv.com.bytebank.modelo;
//TODAS LAS INTERFACES SON ABSTRACTAS
/*UNA INTERFAS NO PUEDE EXTENDER CLASES 
 * SOLO OTRAS INTERFACES*/
public interface Autenticable {

	public void setClave(String clave);

	public boolean iniciarSesion(String clave);
}
