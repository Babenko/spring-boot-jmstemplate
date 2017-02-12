package com.foxic.dto;

import java.io.Serializable;

/**
 * @author Sem Babenko
 */
public interface Message<T> extends Serializable{

    T getPayload();
}
