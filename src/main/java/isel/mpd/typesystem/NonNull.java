/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package isel.mpd.typesystem;

/**
 *
 * @author João Simões
 * @param <T> the stategy to be validated
 */
public class NonNull<T extends BinderStrategy> implements BinderStrategy{

    private final T bs;
    
    public NonNull(T bs) {
        if(bs instanceof NonNull)
            throw new IllegalArgumentException("Strategy cannot be of type <NonNull>");
        this.bs = bs;
    }    

    @Override
    public <T> boolean bindMember(T newT, String key, Object value) {
        if(value!=null)
            return bs.bindMember(newT, key, value);
        return false;
    }
}
